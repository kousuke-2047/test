package com.rensyu.dao;

import com.rensyu.dto.MypageDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import com.rensyu.util.DBConnector;
import java.sql.SQLException;
import java.util.ArrayList;


public class MypageDAO {

	private MypageDTO dto= new MypageDTO();
	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();


	public ArrayList<MypageDTO> getHistoryInfo(String userid)throws SQLException{

		ArrayList<MypageDTO> mypagedto = new ArrayList<MypageDTO>();

		String sql = "selcet * from history where userid = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userid);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				dto.setItemName(rs.getString("itemName"));
				dto.setTotalPrice(rs.getInt("totalPrice"));
				dto.setTotalCount(rs.getInt("totalCount"));
				dto.setPay(rs.getString("pay"));
				dto.setInsertdate(rs.getString("inertdate"));
				mypagedto.add(dto);

			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return mypagedto;
	}


}
