<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>testフォーム</title>
</head>
<body>

	<s:form action="SendAction">

		<s:select name="count" list="%{#session.test}"/>

		<s:submit value="送信"/>


	</s:form>

</body>
</html>