package com.capgemini.cox.csvpsqlDb.step;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.ClassPathResource;

import com.capgemini.cox.csvpsqlDb.model.JiraCSV;

public class Reader {
	public static FlatFileItemReader<JiraCSV> reader(String path) {
		FlatFileItemReader<JiraCSV> reader = new FlatFileItemReader<JiraCSV>();

		reader.setResource(new ClassPathResource(path));
		reader.setLinesToSkip(1);
		reader.setLineMapper(new DefaultLineMapper<JiraCSV>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames(new String[] { "priority", "issue_key", "issue_id", "summary", "status", "created",
								"custom_field_start_date", "resolved", "custom_field_Location",
								"custom_field_COX_Candidate_Level", "custom_field_COX_Capgemini_Lead",
								"custom_field_COX_Hiring_Manager", "custom_field_COX_Role_Skillset",
								"custom_field_COX_Tier_Level", "custom_field_COX_Tierlevel", "custom_field_Position_Backfill_New",
								"custom_field_Cap_SL_BU", "custom_field_Opportunity_Stage", "custom_field_Minimun_COR_HOUR",
								"custom_field_COX_COR", "creater" });
					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<JiraCSV>() {
					{
						setTargetType(JiraCSV.class);
					}
				});
			}
		});
		return reader;
	}
}
