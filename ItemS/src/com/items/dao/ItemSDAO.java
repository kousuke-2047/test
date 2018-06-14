package com.items.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.items.dto.ItemSDTO;
import java.util.ArrayList;
import com.items.util.DBConnector;


public class ItemSDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con  = dbc.getConnection();


	public ArrayList<ItemSDTO> Iteminfo() throws SQLException{

		ArrayList<ItemSDTO> itemList = new ArrayList<ItemSDTO>();
		String sql = "select * from item";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemSDTO dto = new ItemSDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				itemList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemList;
	}
	public ItemSDTO Count(){
		
		String sql ="select count(*) from item";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();
			ItemSDTO dto = new ItemSDTO();
			dto.setCount(rs.getInt(1));
			int f = dto.getCount()/4+1;
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		
	}

}
