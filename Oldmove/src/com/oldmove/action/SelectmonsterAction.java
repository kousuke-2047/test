package com.oldmove.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

import com.oldmove.dao.SelectmonsterDAO;
import com.oldmove.dto.SelectmonsterDTO;
import com.oldmove.util.RandomInt;

public class SelectmonsterAction extends ActionSupport{

private SelectmonsterDAO dao = new SelectmonsterDAO();
private ArrayList<SelectmonsterDTO> selectmonsterList = new ArrayList<SelectmonsterDTO>();
private RandomInt randomint = new RandomInt();
private int menber;

	public String execute(){


		menber =randomint.getSelectmenber(2);


		selectmonsterList = dao.getselectInfo(menber);

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

}
