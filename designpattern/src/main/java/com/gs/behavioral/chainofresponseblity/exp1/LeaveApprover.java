package com.gs.behavioral.chainofresponseblity.exp1;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);
	
	String getApproverRole();
}
