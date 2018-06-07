package com.rensyu.action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import com.rensyu.dao.DeleteSDAO;

public class DeleteSAction extends ActionSupport{

	public String[] deleteids;

	private DeleteSDAO dao = new DeleteSDAO();

	public String execute()throws SQLException{

		String result;

		if(deleteids==null){
			result = ERROR;
		}else{
			dao.deleteSInfo(deleteids);
			result =SUCCESS;
		}

		return result;
	}





}
