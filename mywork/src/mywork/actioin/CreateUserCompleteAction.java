package com.internousdev.retris.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.retris.dao.CartInfoDAO;
import com.internousdev.retris.dao.DestinationInfoDAO;
import com.internousdev.retris.dao.UserInfoDAO;
import com.internousdev.retris.dto.DestinationInfoDTO;
import com.internousdev.retris.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware{

	//dtoではuserIdがloginIdになっています

	private Map<String,Object>session;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String password;
	private String loginId;
	private String email;
	private String sex;
	private String categoryId;

	public String execute(){
		String result = ERROR;
		UserInfoDAO dao = new UserInfoDAO();
		int createcount;
		createcount=dao.createUser(familyName,firstName,familyNameKana,firstNameKana,sex,email,loginId,password);
		if(createcount>0){
			result =SUCCESS;
			UserInfoDTO userInfoDto = dao.getUserInfo(loginId, password);
			session.put("logined", userInfoDto.getUserId());
			int count = 0;
			CartInfoDAO cartInfoDao = new CartInfoDAO();
			count = cartInfoDao.linkToLoginId(String.valueOf(session.get("tempUserId")), loginId);
			session.put("logined", 1);
			session.put("loginId", loginId);
			if(count > 0){
				DestinationInfoDAO destinationInfoDao = new DestinationInfoDAO();
				try{
					List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<DestinationInfoDTO>();
					destinationInfoDtoList = destinationInfoDao.getDestinationInfo(loginId);
					Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
					if(!(iterator.hasNext())){
						destinationInfoDtoList = null;
					}
					session.put("destinationInfoDtoList", destinationInfoDtoList);
				}catch(SQLException e){
					e.printStackTrace();
				}
				}
			}
		return result;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
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
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
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
	public String getUserId(){
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










}
