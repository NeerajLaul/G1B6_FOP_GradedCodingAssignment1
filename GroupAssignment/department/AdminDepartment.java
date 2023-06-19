package com.group.department;

public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		return ("Admin Department");
	}
	
	public String getTodaysWork() {
		return ("Complete Documents Submission");
	}
	
	public String getWorkDeadline() {
		return ("Complete By EOD");
	}

}
