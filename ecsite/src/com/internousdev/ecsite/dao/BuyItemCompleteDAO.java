package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {

	private DBConnector dbConnector =new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "insert into user_buy_item_transaction(item_transaction_id, total_price,total_count,user_master_id,pay,insert_date) values(?,?,?,?,?,?)";

	public  void buyIteminfo(String item_trancaction_id, String user_master_id,String total_price,String total_count,String pay)throws SQLException{
		try{

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
