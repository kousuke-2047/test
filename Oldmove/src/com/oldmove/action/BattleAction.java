package com.oldmove.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

import javax.websocket.Session;

import com.oldmove.dao.BattleDAO;
import com.oldmove.dto.BattleDTO;


public class BattleAction extends ActionSupport{


	private BattleDAO dao = new BattleDAO();
	private ArrayList<BattleDTO> attackList = new ArrayList<BattleDTO>();
	private ArrayList<BattleDTO> defenseList = new ArrayList<BattleDTO>();
	private int menber;
	private int attacknumber;



	public String execute(){

		if(attacknumber==3 || attacknumber==0){
			attacknumber=0;
			attackList.clear();
			attackList=dao.getAttackInfo(menber);
		}

		String result;
		if(attackList.get(0).getArrackhp()==0 && attackList.get(1).getArrackhp()==0 ||
				attackList.get(0).getArrackhp()==0 && attackList.get(2).getArrackhp()==0 ||
				attackList.get(1).getArrackhp()==0 && attackList.get(2).getArrackhp()==0){
			result = ERROR;
			//試合終了
		}else{
			defenseList=dao.getDefenseInfo(menber, attackList.get(attacknumber).getAttackid());








			result = SUCCESS;
		}




		return result;
	}

}