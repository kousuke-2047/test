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

	<script type="text/javascript" src="./js/script.js">
	</script>

	<div class="datebox">
		<a href='<s:url action="SelectmonsterAction"/>'>
		リセット
		</a>
	</div>

	<div class="enemybox"></div>

	<div class="messagebox">

		いくらかけますか？

		<div class="selectbutton">
		はい
		</div>

		<div class="selectbutton">
		いいえ
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
		<s:iterator value="selectmonsterList">
			<tr>
				<div class="selectbox"><td><s:property value="name"/></td></div>
				<div class="selectbox"><td><s:property value="hp"/></td></div>
				<div class="selectbox"><td><s:property value="odds"/></td></div>

			</tr>
		</s:iterator>
	</table>

	</div>


</body>
</html>