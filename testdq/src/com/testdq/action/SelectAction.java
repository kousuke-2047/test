package com.testdq.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class SelectAction extends ActionSupport{

	public String execute() {
		return SUCCESS;
	}

	public Map<String , Object>session;

}
