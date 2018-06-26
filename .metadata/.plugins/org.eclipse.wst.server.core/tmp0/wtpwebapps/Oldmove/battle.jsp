<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/battlestyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>攻撃画面</title>
</head>
<body>

	<script type="text/javascript" src="./js/battle.js">
	</script>



	<table>
		<tr  class="namebox">
			<td class="smalltd"></td>
				<s:iterator value="displayList">
					<td><s:property value="name"/></td>
				</s:iterator>
		</tr>

		<tr class="hpbox">
			<td class="smalltd">ＨＰ</td>
			<s:iterator value="displayList">
				<td><s:property value="hp"/></td>
			</s:iterator>
		</tr>
		<tr class="mpbox">
			<td class="smalltd">ＭＰ</td>
			<s:iterator value="displayList">
				<td><s:property value="mp"/></td>
			</s:iterator>
		</tr>
	</table>

	<div class="enemybox">

		<s:iterator value="displayList">
			<img src='<s:property value="filepath"/>/<s:property value="filename"/>' class="enemyminibox"/>
		</s:iterator>

	</div>

	<a href ='<s:url action="BattleAction">
	<s:param name="attacknumber" value="attacknumber"/>
	</s:url>'>
		<div class="textbox">

			<s:property value="session.attackname"/>のこうげき<br>
			<div class="textafterbox">
			<s:property value="session.defensename"/>に<s:property value ="session.damage"/>のダメージ
			</div>
		</div>
	</a>

</body>
</html>