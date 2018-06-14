package com.items.dto;

public class ItemSDTO {

	private int id;
	private String itemName;
	private int itemPrice;
	private int count;

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
	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice=itemPrice;
	}
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count = count;
	}

}
