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

		session.put("filepath", selectmonsterList.get(0).getFilepath());
		session.put("firstfilename", selectmonsterList.get(0).getFilename());
		session.put("secondfilename", selectmonsterList.get(1).getFilename());
		session.put("thirdfilename", selectmonsterList.get(2).getFilename());

		session.put("firstmonstername", selectmonsterList.get(0).getName());
		session.put("secondmonstername", selectmonsterList.get(1).getName());
		session.put("thirdmonstername", selectmonsterList.get(2).getName());
		session.put("firstmonsterid", selectmonsterList.get(0).getId());
		session.put("secondmonsterid", selectmonsterList.get(1).getId());
		session.put("thirdmonsterid", selectmonsterList.get(2).getId());

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
