package com.fileHandling.Json;

public class Project {
	private int projectId;
    private String projectName;
    private String status;
	public Project() {
		super();
	}
	public Project(int projectId, String projectName, String status) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.status = status;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", status=" + status + "]";
	}
    
}
