package com.capgemini.cox.csvpsqlDb.model;

public class JiraCSV {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(columnDefinition = "serial")
//	private int id;
	private String priority;
	private String issue_key;
	private int issue_id;
	private String summary;
	private String status;
	private String created;
	private String custom_field_start_date;
	private String resolved;
	private String custom_field_Location;
	private String custom_field_COX_Candidate_Level;
	private String custom_field_COX_Capgemini_Lead;
	private String custom_field_COX_Hiring_Manager;
	private String custom_field_COX_Role_Skillset;
	private String custom_field_COX_Tier_Level;
	private String custom_field_COX_Tierlevel;
	private String custom_field_Position_Backfill_New;
	private String custom_field_Cap_SL_BU;
	private String custom_field_Opportunity_Stage;
	private String custom_field_Minimun_COR_HOUR;
	private String custom_field_COX_COR;
	private String creater;

	public JiraCSV() {

	}

	public JiraCSV(String priority, String issue_key, int issue_id, String summary, String status, String created,
			String custom_field_start_date, String resolved, String custom_field_Location,
			String custom_field_COX_Candidate_Level, String custom_field_COX_Capgemini_Lead,
			String custom_field_COX_Hiring_Manager, String custom_field_COX_Role_Skillset,
			String custom_field_COX_Tier_Level, String custom_field_COX_Tierlevel,
			String custom_field_Position_Backfill_New, String custom_field_Cap_SL_BU,
			String custom_field_Opportunity_Stage, String custom_field_Minimun_COR_HOUR, String custom_field_COX_COR,
			String creater) {
		super();
		this.priority = priority;
		this.issue_key = issue_key;
		this.issue_id = issue_id;
		this.summary = summary;
		this.status = status;
		this.created = created;
		this.custom_field_start_date = custom_field_start_date;
		this.resolved = resolved;
		this.custom_field_Location = custom_field_Location;
		this.custom_field_COX_Candidate_Level = custom_field_COX_Candidate_Level;
		this.custom_field_COX_Capgemini_Lead = custom_field_COX_Capgemini_Lead;
		this.custom_field_COX_Hiring_Manager = custom_field_COX_Hiring_Manager;
		this.custom_field_COX_Role_Skillset = custom_field_COX_Role_Skillset;
		this.custom_field_COX_Tier_Level = custom_field_COX_Tier_Level;
		this.custom_field_COX_Tierlevel = custom_field_COX_Tierlevel;
		this.custom_field_Position_Backfill_New = custom_field_Position_Backfill_New;
		this.custom_field_Cap_SL_BU = custom_field_Cap_SL_BU;
		this.custom_field_Opportunity_Stage = custom_field_Opportunity_Stage;
		this.custom_field_Minimun_COR_HOUR = custom_field_Minimun_COR_HOUR;
		this.custom_field_COX_COR = custom_field_COX_COR;
		this.creater = creater;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getIssue_key() {
		return issue_key;
	}

	public void setIssue_key(String issue_key) {
		this.issue_key = issue_key;
	}

	public int getIssue_id() {
		return issue_id;
	}

	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getCustom_field_start_date() {
		return custom_field_start_date;
	}

	public void setCustom_field_start_date(String custom_field_start_date) {
		this.custom_field_start_date = custom_field_start_date;
	}

	public String getResolved() {
		return resolved;
	}

	public void setResolved(String resolved) {
		this.resolved = resolved;
	}

	public String getCustom_field_Location() {
		return custom_field_Location;
	}

	public void setCustom_field_Location(String custom_field_Location) {
		this.custom_field_Location = custom_field_Location;
	}

	public String getCustom_field_COX_Candidate_Level() {
		return custom_field_COX_Candidate_Level;
	}

	public void setCustom_field_COX_Candidate_Level(String custom_field_COX_Candidate_Level) {
		this.custom_field_COX_Candidate_Level = custom_field_COX_Candidate_Level;
	}

	public String getCustom_field_COX_Capgemini_Lead() {
		return custom_field_COX_Capgemini_Lead;
	}

	public void setCustom_field_COX_Capgemini_Lead(String custom_field_COX_Capgemini_Lead) {
		this.custom_field_COX_Capgemini_Lead = custom_field_COX_Capgemini_Lead;
	}

	public String getCustom_field_COX_Hiring_Manager() {
		return custom_field_COX_Hiring_Manager;
	}

	public void setCustom_field_COX_Hiring_Manager(String custom_field_COX_Hiring_Manager) {
		this.custom_field_COX_Hiring_Manager = custom_field_COX_Hiring_Manager;
	}

	public String getCustom_field_COX_Role_Skillset() {
		return custom_field_COX_Role_Skillset;
	}

	public void setCustom_field_COX_Role_Skillset(String custom_field_COX_Role_Skillset) {
		this.custom_field_COX_Role_Skillset = custom_field_COX_Role_Skillset;
	}

	public String getCustom_field_COX_Tier_Level() {
		return custom_field_COX_Tier_Level;
	}

	public void setCustom_field_COX_Tier_Level(String custom_field_COX_Tier_Level) {
		this.custom_field_COX_Tier_Level = custom_field_COX_Tier_Level;
	}

	public String getCustom_field_COX_Tierlevel() {
		return custom_field_COX_Tierlevel;
	}

	public void setCustom_field_COX_Tierlevel(String custom_field_COX_Tierlevel) {
		this.custom_field_COX_Tierlevel = custom_field_COX_Tierlevel;
	}

	public String getCustom_field_Position_Backfill_New() {
		return custom_field_Position_Backfill_New;
	}

	public void setCustom_field_Position_Backfill_New(String custom_field_Position_Backfill_New) {
		this.custom_field_Position_Backfill_New = custom_field_Position_Backfill_New;
	}

	public String getCustom_field_Cap_SL_BU() {
		return custom_field_Cap_SL_BU;
	}

	public void setCustom_field_Cap_SL_BU(String custom_field_Cap_SL_BU) {
		this.custom_field_Cap_SL_BU = custom_field_Cap_SL_BU;
	}

	public String getCustom_field_Opportunity_Stage() {
		return custom_field_Opportunity_Stage;
	}

	public void setCustom_field_Opportunity_Stage(String custom_field_Opportunity_Stage) {
		this.custom_field_Opportunity_Stage = custom_field_Opportunity_Stage;
	}

	public String getCustom_field_Minimun_COR_HOUR() {
		return custom_field_Minimun_COR_HOUR;
	}

	public void setCustom_field_Minimun_COR_HOUR(String custom_field_Minimun_COR_HOUR) {
		this.custom_field_Minimun_COR_HOUR = custom_field_Minimun_COR_HOUR;
	}

	public String getCustom_field_COX_COR() {
		return custom_field_COX_COR;
	}

	public void setCustom_field_COX_COR(String custom_field_COX_COR) {
		this.custom_field_COX_COR = custom_field_COX_COR;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

}
