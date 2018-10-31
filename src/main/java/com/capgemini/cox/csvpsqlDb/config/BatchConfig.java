package com.capgemini.cox.csvpsqlDb.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.cox.csvpsqlDb.dao.CustomerDao;
import com.capgemini.cox.csvpsqlDb.model.Customer;
import com.capgemini.cox.csvpsqlDb.step.Listener;
import com.capgemini.cox.csvpsqlDb.step.Processor;
import com.capgemini.cox.csvpsqlDb.step.Reader;
import com.capgemini.cox.csvpsqlDb.step.Writer;


@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public CustomerDao customerDao;

	@Bean
	public Job job() {
		return jobBuilderFactory.get("job").incrementer(new RunIdIncrementer()).listener(new Listener(customerDao))
				.flow(step1()).end().build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<Customer, Customer>chunk(19)
				.reader(Reader
						.reader("Revenue Positions Closed in Past 2 Weeks by Resolved date (TMT Staffing Portal).csv"))
				.processor(new Processor()).writer(new Writer(customerDao)).build();
	}
}
