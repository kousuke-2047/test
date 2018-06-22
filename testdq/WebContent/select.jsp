<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content= "text/javascript" />
	<meta http-equiv="imagetoolbar" content= "no" />
	<meta name = "description" content="" />
	<meta name="keywords" content="" />
	<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>クソゲー乙index</title>


<style type = "text/css">
body{font-family:DRAGON QUEST MONSTERS;}

.namebox{
    color:black;
    width:400px;
    height:35px;
    border-top:4px solid black;
    border-left:4px solid black;
    border-right:4px solid black;
    font-size:20px;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;


}

.namebox li{
    float:left;
    list-style:none;
    position:relative;
    right:20px;
    bottom:15px;

}

.namebox li.migi{
    float:left;
    list-style:none;
    padding-left:50px;


}

.datebox{
    color:black;
    width:400px;
    height:60px;
    border:4px solid black;
    border-bottom-left-radius:10px;
    border-bottom-right-radius:10px;
}
.datebox li{
    float:left;
    list-style:none;
    font-size:20px;
    position:relative;
    bottom:10px;
    right:20px;
}
.datebox li.migi{
    float:left;
    list-style:none;
    padding-left:50px;
    font-size:20px;
}
.datebox .spacenone li{
    float:left;
    list-style:none;
    font-size:20px;
    position:relative;
    bottom:20px;
    right:20px;
}
.datebox .spacenone li.migi{
    float:left;
    list-style:none;
    padding-left:50px;
    font-size:20px;
}

.imgbox{


    position:absolute;
    top:180px;
    left:100px;

	}

.imgboxleft{
 	position:absolute;
    top:150px;
    left:220px;

	}

/* img{
    margin-top:30px;
    margin-left:80px;
    margin-bottom:10px;
} */
.textbox{
    width:385px;
    height:80px;
    border:4px solid black;
    border-radius:10px;
    font-size:20px;
    padding-left:15px;
    margin-top:120px;
}
.text{
    margin-top:10px;
    margin-bottom:10px;
}

</style>

<script type = "text/javascript">

function submitAction(url){
	$('body').after('action',url);
	$('body').submit();
}
</script>
</head>
<body>

</body>
</html>