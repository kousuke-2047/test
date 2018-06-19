package com.item.action;

import com.item.dao.ItemDAO;
import com.item.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.sql.SQLException;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import com.item.dto.ItemCDTO;


public class ItemAction extends ActionSupport implements SessionAware{

	private ItemDAO itemdao = new ItemDAO();
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	public Map<String ,Object>session;
	private int number;
	private int forward;


	private ArrayList<ItemCDTO> countList = new ArrayList<ItemCDTO>();

	public String execute()throws SQLException{

		String result = SUCCESS;


		if(forward==1){
			itemList = itemdao.getItemInfo(number,forward);
			number--;
		}else{
			itemList = itemdao.getItemInfo(number);
		}

		countList = itemdao.Itemcount();

		return result;
	}
	public ArrayList<ItemDTO> getItemList(){
		return this.itemList;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public ArrayList<ItemCDTO> getCountList(){
		return this.countList;
	}
	public int getForward(){
		return forward;
	}
	public void setForward(int forward){
		this.forward = forward;
	}

}
