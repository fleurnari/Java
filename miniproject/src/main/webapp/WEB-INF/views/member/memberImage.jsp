<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : ${join.memberId }<p>
	이  름 : ${join.memberName }<p>
	사 진 : <img src="attech/${join.memberImgDir }">
</body>
</html>