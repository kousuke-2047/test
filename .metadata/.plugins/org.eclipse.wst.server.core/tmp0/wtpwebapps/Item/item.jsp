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

	<s:form action="ItemshowAction">
	<table>
		<tr>
			<td>NO</td>
			<td>商品名</td>
			<td>値段</td>
		</tr>

		<s:iterator value = "itemList">
		<tr>
			<td><input type ="radio" name="id" value="<s:property value='id'/>"/>
			<s:property value = "id"/></td>
			<td><s:property value = "itemName"/></td>
			<td><s:property value = "itemPrice"/></td>
		</tr>
		</s:iterator>
		<s:submit value ="商品表示"/>
	</table>
	</s:form>

	<s:iterator value="countList">

		<a href ='<s:url action ="ItemAction"/>'>
		<s:property value ="page"/>
		<input type="hidden" name="number" value="<s:property value='page'/>"/>
		</a>
		:
	</s:iterator>


	<s:form action ="ItemAction">
	<s:iterator value="countList">
		<table>
			<tr>
				<td><input type ="radio" name="number" value="<s:property value='page'/>"/></td>
				<td><s:property value="page"/></td>
			</tr>
		</table>


	</s:iterator>
	<s:submit value="表示"/>
	</s:form>










</body>
</html>