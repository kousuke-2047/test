<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/battlestyle.css">
<title>レディ画面</title>
</head>
<body>

	<table>
	<tr  class="namebox">
		<td class="smalltd"></td>
			<s:iterator value="#session.selectmonsterList">
				<td><s:property value="name"/></td>
			</s:iterator>
	</tr>

	<tr class="hpbox">
		<td class="smalltd">ＨＰ</td>
		<s:iterator value="#session.selectmonsterList">
			<td><s:property value="hp"/></td>
		</s:iterator>
	</tr>
	<tr class="mpbox">
		<td class="smalltd">ＭＰ</td>
		<s:iterator value="#session.selectmonsterList">
			<td><s:property value="mp"/></td>
		</s:iterator>
	</tr>
	</table>
	<div class="enemybox">

		<div class="enemyminibox"></div>
		<div class="enemyminibox"></div>
		<div class="enemyminibox"></div>

	</div>


	<div class="textbox">
		<s:iterator value="#session.selectmonsterList">
			<s:property value="name"/>
			<br>
		</s:iterator>
	</div>
</body>
</html>