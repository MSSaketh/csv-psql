package com.capgemini.cox.csvpsqlDb.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.capgemini.cox.csvpsqlDb.model.JiraCSV;


public class Processor implements ItemProcessor<JiraCSV, JiraCSV> {

	private static final Logger log = LoggerFactory.getLogger(Processor.class);

	@Override
	public JiraCSV process(JiraCSV customer) throws Exception {
//		final int id = customer.getId();
		final String priority = customer.getPriority();
		final String issue_key = customer.getIssue_key();
		final int issue_id = customer.getIssue_id();
		final String summary = customer.getSummary();
		final String status = customer.getStatus();
		final String created = customer.getCreated();
		final String custom_field_start_date = customer.getCustom_field_start_date();
		final String resolved = customer.getResolved();
		final String custom_field_Location = customer.getCustom_field_Location();
		final String custom_field_COX_Candidate_Level = customer.getCustom_field_COX_Candidate_Level();
		final String custom_field_COX_Capgemini_Lead = customer.getCustom_field_COX_Capgemini_Lead();
		final String custom_field_COX_Hiring_Manager = customer.getCustom_field_COX_Hiring_Manager();
		final String custom_field_COX_Role_Skillset = customer.getCustom_field_COX_Role_Skillset();
		final String custom_field_COX_Tier_Level = customer.getCustom_field_COX_Tier_Level();
		final String custom_field_COX_Tierlevel = customer.getCustom_field_COX_Tierlevel();
		final String custom_field_Position_Backfill_New = customer.getCustom_field_Position_Backfill_New();
		final String custom_field_Cap_SL_BU = customer.getCustom_field_Cap_SL_BU();
		final String custom_field_Opportunity_Stage = customer.getCustom_field_Opportunity_Stage();
		final String custom_field_Minimun_COR_HOUR = customer.getCustom_field_Minimun_COR_HOUR();
		final String custom_field_COX_COR = customer.getCustom_field_COX_COR();
		final String creator = customer.getCreater();
		final JiraCSV fixedCustomer = new JiraCSV(priority, issue_key, issue_id, summary, status, created,
				custom_field_start_date, resolved, custom_field_Location, custom_field_COX_Candidate_Level,
				custom_field_COX_Capgemini_Lead, custom_field_COX_Hiring_Manager, custom_field_COX_Role_Skillset,
				custom_field_COX_Tier_Level, custom_field_COX_Tierlevel, custom_field_Position_Backfill_New, custom_field_Cap_SL_BU,
				custom_field_Opportunity_Stage, custom_field_Minimun_COR_HOUR, custom_field_COX_COR,creator);

		log.info("Converting (" + customer + ") into (" + fixedCustomer + ")");

		return fixedCustomer;
	}
}
