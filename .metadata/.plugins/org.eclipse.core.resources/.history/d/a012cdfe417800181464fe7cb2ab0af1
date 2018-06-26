package com.oldmove.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.oldmove.util.DBConnector;
import com.oldmove.dto.BattleDTO;
import java.util.ArrayList;

public class BattleDAO {

	private DBConnector dbc = new DBConnector();
	private Connection con = dbc.getConnection();


	public ArrayList<BattleDTO> getAttackInfo(int menber){

		ArrayList<BattleDTO> attackList = new ArrayList<BattleDTO>();
		String sql ="select * from battlemonster where menber=? order by rand()";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, menber);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				BattleDTO dto = new BattleDTO();
				dto.setAttackid(rs.getInt("id"));
				dto.setAttackpower(rs.getInt("power"));
				dto.setAttackname(rs.getString("name"));
				dto.setAttackhp(rs.getInt("hp"));
				attackList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return attackList;

	}
	public ArrayList<BattleDTO> getDefenseInfo(int menber,int attackid){
		ArrayList<BattleDTO> defenseList = new ArrayList<BattleDTO>();
		String sql = "select * from battlemonster where menber=? not in(?) order by rand() limit 1";

		try{PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, menber);
			ps.setInt(2, attackid);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				BattleDTO dto = new BattleDTO();
				dto.setDefenseid(rs.getInt("id"));
				dto.setDefenesename(rs.getString("name"));
				dto.setDefenseguard(rs.getInt("guard"));
				dto.setDefensehp(rs.getInt("hp"));
				defenseList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return defenseList;
	}


}
