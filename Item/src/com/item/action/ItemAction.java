package com.item.action;

import com.item.dao.ItemDAO;
import com.item.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.sql.SQLException;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;


public class ItemAction extends ActionSupport implements SessionAware{

	private ItemDAO itemdao = new ItemDAO();
	private ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
	public Map<String ,Object>session;

	public String execute()throws SQLException{

		String result = SUCCESS;

		itemList = itemdao.getItemInfo();

		session.put("total", itemdao.s);



		return result;
	}
	public ArrayList<ItemDTO> getItemList(){
		return this.itemList;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}


}