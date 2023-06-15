<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><h1>회원가입</h1></div>
	<form action="memberInsert.do" method="post" enctype="multipart/form-data">
		아 이 디 : <input type="text" id="memberId" name="memberId"><p>
		패스워드 : <input type="text" id="memberPassword" name="memberPassword"><p>
		이   름 : <input type="text" id="memberName" name="memberName"><p>
		나   이 : <input type="text" id="memberAge" name="memberAge"><p>
		전화번호 : <input type="text" id="memberTel" name="memberTel"><p>
		성   별 : <input type="text" id="memberGender" name="memberGender"><p>
		사   진 : <input type="file" name="pfile"><p>
		<input type="submit" value="전송">
	</form>	
</body>
</html>