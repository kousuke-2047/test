package com.practice.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class SendAction extends ActionSupport implements SessionAware{

	private String count;
	public Map<String,Object>session;


	public String execute(){

		count = String.valueOf((count.split(" ,",0))[0]);

		session.put("count",count);

		String result = SUCCESS;
		return result;

	}
	public String getCount(){
		return count;
	}
	public void setCount(String count){
		this.count= count;
	}
	public void setSession(Map<String,Object>session){
		this.session= session;
	}

}
