package com.capgemini.cox.csvpsqlDb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class JiraCSVController {
	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job job;
	
	@Autowired
	Environment env;

	@RequestMapping("/run")
	public String handle() throws Exception {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
					.toJobParameters();
			jobLauncher.run(job, jobParameters);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		System.out.println(env.getProperty("JAVA_HOME"));
        System.out.println(env.getProperty("app.name"));
		return "Done! Check Console Window for more details";
	}
}
