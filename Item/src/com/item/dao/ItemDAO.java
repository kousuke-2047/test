package com.item.dao;

import com.item.dto.ItemDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import com.item.util.DBConnector;
import java.util.ArrayList;

public class ItemDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();
	public int s = 0;

	public ArrayList<ItemDTO> getItemInfo()throws SQLException{

		ArrayList<ItemDTO> itemdto = new ArrayList<ItemDTO>();

		String sql ="select * from item";


		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs =ps.executeQuery();

			while(rs.next()){
				ItemDTO dto = new ItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				itemdto.add(dto);
				s++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return itemdto;
	}
}