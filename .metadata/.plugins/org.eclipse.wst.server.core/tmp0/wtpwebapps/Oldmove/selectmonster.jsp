<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/selectstyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>選択画面</title>
</head>
<body>

	<script type="text/javascript" src="./js/selectscript.js">
	</script>

	<div class="datebox">
		<a href='<s:url action="SelectmonsterAction"/>'>
		リセット
		</a>
	</div>

	<div class="enemybox">

		<img src='<s:property value="session.filepath"/>/<s:property value="session.firstfilename"/>' class ="enemyfirstbox"/>
		<img src='<s:property value="session.filepath"/>/<s:property value="session.secondfilename"/>' class ="enemysecondbox"/>
		<img src='<s:property value="session.filepath"/>/<s:property value="session.thirdfilename"/>' class ="enemythirdbox"/>

		<div class="firstmessagebox">
		<s:property value="session.firstmonstername"/><br>
		にいくらかけますか？
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				１０
			</a>
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				２０
			</a>
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				５０
			</a>
			<div class="selectbutton">
			やめる
			</div>
		</div>

		<div class="secondmessagebox">
		<s:property value="session.secondmonstername"/><br>
		にいくらかけますか？
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				１０
			</a>
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				２０
			</a>
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				５０
			</a>
			<div class="selectbutton">
			やめる
			</div>
		</div>

		<div class="thirdmessagebox">
		<s:property value="session.thirdmonstername"/><br>
		にいくらかけますか？
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				１０
			</a>
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				２０
			</a>
			<a href ='<s:url action="LeadyAction"/>' class="selectbutton">
				５０
			</a>
			<div class="selectbutton">
			やめる
			</div>
		</div>
	</div>

	<div class="texttopbox">

	<table>
		<tr>
			<td>なまえ</td>
			<td>たいりょく</td>
			<td>オッズ</td>
		</tr>
	</table>

	</div>
	<div class="textbottombox">

	<table>
		<tr class="selectfirstbox">
			<td><s:property value="session.firstmonstername"/></td>
		</tr>
		<tr class="selectsecondbox">
			<td><s:property value="session.secondmonstername"/></td>
		</tr>
		<tr class="selectthirdbox">
			<td><s:property value="session.thirdmonstername"/></td>
		</tr>
	</table>
	<table>
		<s:iterator value="selectmonsterList">
			<tr>
				<td><s:property value="hp"/></td>
				<td><s:property value="odds"/></td>
			</tr>
		</s:iterator>
	</table>

	</div>


</body>
</html>