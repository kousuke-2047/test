package com.practice.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;

	public String execute(){

		List<Integer> test  = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		session.put("test", test);

		String result = SUCCESS;
		return result;

	}
	public void setSession(Map<String,Object>session){
		this.session = session;;
	}


}
