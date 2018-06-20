package com.item.action;

import com.opensymphony.xwork2.ActionSupport;

public class XSearchAction extends ActionSupport{



	private String category;
	private String word;
	private int number;

	public String execute(){
		String result = SUCCESS;

		if(category.isEmpty()){


		}










		return result;
	}
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getWord(){
		return word;
	}
	public void setWord(String word){
		this.word=word;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}

}
