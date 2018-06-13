package com.item.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;
import com.item.dao.ItemshowDAO;
import com.item.dto.ItemshowDTO;
import java.sql.SQLException;




public class ItemshowAction extends ActionSupport implements SessionAware{

	public Map<String ,Object>session;
	private ItemshowDTO dto = new ItemshowDTO();
	private ItemshowDAO dao = new ItemshowDAO();
	private int id;

	public String execute()throws SQLException{

		dao.ItemShow(id);

		session.put("id",dto.getId());
		session.put("itemName",dto.getItemName());
		session.put("itemPrice",dto.getItemPrice());

		String result = SUCCESS;
		return result;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
}

