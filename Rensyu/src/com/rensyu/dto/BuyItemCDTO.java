package com.rensyu.dto;

public class BuyItemCDTO {

	private int id;
	private String itemName;
	private int totalPrice;
	private int totalCount;
	private String userid;
	private String pay;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public int getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}
	public int getTotalCount(){
		return totalCount;
	}
	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}
	public String getUserid(){
		return userid;
	}
	public void setUserid(String userid){
		this.userid = userid;
	}
	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay = pay;
	}

}