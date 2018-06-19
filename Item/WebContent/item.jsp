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
<style type = "text/css">

header{
	background-color:lightgray;
	height:50px;
	width:100%;
	}


</style>
</head>
<body>

	<header>
		<a href ='<s:url action ="GosearchAction"/>'>検索機能</a>
	</header>

	<s:form action="ItemshowAction">
	<table>
		<tr>
			<td>NO</td>
			<td>商品名</td>
			<td>値段</td>
		</tr>

		<s:iterator value = "itemList">
		<tr>
			<td><input type ="radio" name="itemid" value="<s:property value='id'/>"/>
			<s:property value = "id"/></td>
			<td><s:property value = "itemName"/></td>
			<td><s:property value = "itemPrice"/></td>
		</tr>
		</s:iterator>
		<s:submit value ="商品表示"/>
	</table>
	</s:form>

	<s:iterator value="countList">

		<a href ='<s:url action ="ItemAction">
		<s:param name="number" value="%{page}"/>
		</s:url>'>
		<s:property value ="page"/>
		</a>
		:
	</s:iterator>


	<s:form action ="ItemAction">
	<s:iterator value="countList" status="pageNo">
		<table>
			<tr>
				<s:if test="#pageNO.count==number">
				<td><s:property value="page"/></td>
				</s:if>
				<s:else>
				<td><input type ="radio" name="number" value="<s:property value='page'/>"/></td>
				<td><s:property value="page"/></td>
				</s:else>
			</tr>
		</table>


	</s:iterator>
	<s:submit value="表示"/>
	</s:form>

	<s:form action="ItemAction">
		<s:if test="number!=1">
			<s:iterator value="countList" status="pageNo">
				<s:if test="#pageNO.count==number">
					<s:hidden name="forward" value="true"/>
					<s:hidden name="number" value="<s:property value='page'/>"/>

				</s:if>
			</s:iterator>
			<s:submit value="前へ"/>
		</s:if>
	</s:form>


	<s:if test="number!=1">


			<a href ='<s:url action= "ItemAction">
			<s:param name="number" value="number"/>
			<s:param name="forward" value="1"/>
			</s:url>'>
			前へ
			</a>

	</s:if>









</body>
</html>