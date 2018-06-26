package com.oldmove.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

import com.oldmove.dao.SelectmonsterDAO;
import com.oldmove.dto.SelectmonsterDTO;
import com.oldmove.util.RandomInt;

public class SelectmonsterAction extends ActionSupport implements SessionAware{

private SelectmonsterDAO dao = new SelectmonsterDAO();
private ArrayList<SelectmonsterDTO> selectmonsterList = new ArrayList<SelectmonsterDTO>();
private RandomInt randomint = new RandomInt();
private int menber;
public Map<String ,Object>session;

	public String execute(){

		dao.Resethp();

		menber =randomint.getSelectmenber(3);


		selectmonsterList = dao.getselectInfo(menber);

		session.put("selectmonsterList",selectmonsterList);

		session.put("menber", menber);

		String result = SUCCESS;
		return result;
	}

	public ArrayList<SelectmonsterDTO> getSelectmonsterList(){
		return this.selectmonsterList;
	}
	public int getMenber(){
		return menber;
	}
	public void setMenber(int menber){
		this.menber = menber;
	}
	public void setSession(Map<String ,Object>session){
		this.session= session;
	}

}
