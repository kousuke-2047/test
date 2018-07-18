package com.internousdev.retris.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.retris.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private String loginId;
	private String password;
	private String sex;

	private List<String> familyNameEMessageList = new ArrayList<String>();
	private List<String> firstNameEMessageList = new ArrayList<String>();
	private List<String> familyNameKanaEMessageList = new ArrayList<String>();
	private List<String> firstNameKanaEMessageList = new ArrayList<String>();
	private List<String> emailEMessageList = new ArrayList<String>();
	private List<String> loginIdEMessageList = new ArrayList<String>();
	private List<String> passwordEMessageList = new ArrayList<String>();

	private String categoryId;
	private List<String> sexList = new ArrayList<String>();
	private Map<String ,Object>session;

	public String execute(){
		String result = ERROR;
		InputChecker inputchecker = new InputChecker();

		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("email", email);
		session.put("loginId", loginId);
//いらないかも↓
//		session.put("password", password);
		session.put("sex", sex);

		familyNameEMessageList = inputchecker.doCheck("姓", familyName, 1, 16, true, true, true, false,false,false,false);
		firstNameEMessageList = inputchecker.doCheck("名", firstName, 1, 16, true, true, true, false,false,false,false);
		familyNameKanaEMessageList = inputchecker.doCheck("姓ふりがな", familyNameKana, 1, 16, false, false, true, false,false,false,false);
		firstNameKanaEMessageList = inputchecker.doCheck("名ふりがな",firstNameKana, 1, 16,false,false,true,false,false,false,false);
		emailEMessageList = inputchecker.doCheck("メールアドレス",email,14, 32, true,false,false,true,true,false,false);
		loginIdEMessageList = inputchecker.doCheck("ログインID",loginId,1, 8, true,false,false,true,false,false,false);
		passwordEMessageList = inputchecker.doCheck("パスワード",password,1, 16, true,false,false,true,false,false,false);

		if(familyNameEMessageList.size()==0 &&
				firstNameEMessageList.size()==0 &&
				familyNameKanaEMessageList.size()==0 &&
				firstNameKanaEMessageList.size()==0 &&
				emailEMessageList.size()==0 &&
				loginIdEMessageList.size()==0 &&
				passwordEMessageList.size()==0){
			result =SUCCESS;
		}else{
			session.put("familyNameEMessageList", familyNameEMessageList);
			session.put("firstNameEMessageList", firstNameEMessageList);
			session.put("familyNameKanaEMessageList", familyNameKanaEMessageList);
			session.put("firstNameKanaEMessageList", firstNameKanaEMessageList);
			session.put("emailEMessageList", emailEMessageList);
			session.put("loginIdEMessageList", loginIdEMessageList);
			session.put("passwordEMessageList", passwordEMessageList);
		}

		return result;
	}
	public Map<String ,Object> getSession(){
		return session;
	}
	public void setSession(Map<String ,Object>session){
		this.session = session;
	}
	public String getFamilyName(){
		return familyName;
	}
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFamilyNameKana(){
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}
	public String getFirstNameKana(){
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	public List<String> getFamilyNameEMessageList(){
		return familyNameEMessageList;
	}
	public void setFamilyNameEMessageList(List<String>familyNameEMessageList){
		this.familyNameEMessageList = familyNameEMessageList;
	}

	public List<String> getFirstNameEMessageList(){
		return firstNameEMessageList;
	}
	public void setFirstNameEMessageList(List<String>firstNameEMessageList){
		this.firstNameEMessageList = firstNameEMessageList;
	}
	public List<String> getFamilyNameKanaEMessageList(){
		return familyNameKanaEMessageList;
	}
	public void setFamilyNameKanaEMessageList(List<String>familyNameKanaEMessageList){
		this.familyNameKanaEMessageList = familyNameKanaEMessageList;
	}
	public List<String> getFirstNameKanaEMessageList(){
		return firstNameKanaEMessageList;
	}
	public void setFirstNameKanaEMessageList(List<String>firstNameKanaEMessageList){
		this.firstNameKanaEMessageList = firstNameKanaEMessageList;
	}
	public List<String> getEmailEMessageList(){
		return emailEMessageList;
	}
	public void setEmailEMessageList(List<String>emailEMessageList){
		this.emailEMessageList = emailEMessageList;
	}
	public List<String> getLoginIdEMessageList(){
		return loginIdEMessageList;
	}
	public void setLoginIdEMessageList(List<String>loginIdEMessageList){
		this.loginIdEMessageList = loginIdEMessageList;
	}
	public List<String> getPasswordEMessageList(){
		return passwordEMessageList;
	}
	public void setPasswordEMessageList(List<String>passwordEMessageList){
		this.passwordEMessageList = passwordEMessageList;
	}
	public List<String> getSexList(){
		return sexList;
	}
	public void setSexList(List<String>sexList){
		this.sexList = sexList;
	}

}
