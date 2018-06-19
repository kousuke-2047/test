package com.item.dao;

import com.item.dto.SearchDTO;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.item.util.DBConnector;
import java.util.ArrayList;
import com.item.dto.ItemCDTO;

public class WSearchDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();

	public ArrayList<SearchDTO> SearchA(String word,int number){

		String sql = "select * from item where itemName like '%"+"?"+"%' limit ?,4";
		ArrayList<SearchDTO> item = new ArrayList<SearchDTO>();


		try{
			PreparedStatement ps = con.prepareStatement(sql);

			int num = number*4-4;


			ps.setInt(1, num);
			ps.setString(2, word);
			ResultSet rs = ps.executeQuery();


			while(rs.next()){
				SearchDTO dto = new SearchDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemPrice(rs.getInt("itemPrice"));
				dto.setCategory(rs.getString("category"));
				item.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return item;
	}
	public ArrayList<ItemCDTO> Wcount(String word)throws SQLException{

		String sql ="select count(*) from item where itemName like %a%";
		ItemCDTO itemcdto = new ItemCDTO();
		ArrayList<ItemCDTO> count = new ArrayList<ItemCDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			ps.setString(1, word);
			rs.next();

			itemcdto.setCount(rs.getInt(1));

			int f =itemcdto.getCount()/4+1;

			for(int i =1;i<f;i++){
				ItemCDTO dto =new ItemCDTO();
				dto.setPage(i);
				count.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return count;
	}


}
