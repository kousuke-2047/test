<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content= "text/javascript" />
	<meta http-equiv="imagetoolbar" content= "no" />
	<meta name = "description" content="" />
	<meta name="keywords" content="" />
<title>Item一覧画面</title>
</head>
<body>
	<table>
		<tr>
			<td>NO</td>
			<td>商品名</td>
			<td>値段</td>
		</tr>

		<s:iterator value = "itemList" begin ="0" end ="3">
		<tr>
			<td><s:property value = "id"/></td>
			<td><s:property value = "itemName"/></td>
			<td><s:property value = "itemPrice"/></td>
		</tr>
		</s:iterator>
	</table>
	<%
		int b = Integer.parseInt(session.get("total").toString);
	%>
	ー<%
	for(int i=1; i<b/4+1 ;++i){
	%>
	<a href ='<s:url action ="ItemAction"/>'><%= i %>、</a>
	<%} %>ー



</body>
</html>