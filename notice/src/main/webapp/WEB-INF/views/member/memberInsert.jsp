<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div align="center">
			<jsp:include page="../main/menu.jsp" />
		<div><h1>회원 가입</h1></div>
		<div>
			<form id="frm" action="memberInsert.do" onsubmit="return formCheck()" method="get">
				<div>
					<table border="1">
						<tr>
							<th width="150">*아이디</th>
							<td width="300">
								<input type="email" id="memberId" name="memberId" required="required">
								<button id="checkId" value="No" onclick="idCheck()">중복체크</button>
							</td>
						</tr>
						<tr>
							<th>*패스워드</th>
							<td>
								<input type="password" id="memberPassword" name="memberPassword" required="required">
							</td>
						</tr>
						<tr>
							<th>*패스워드 확인</th>
							<td>
								<input type="password" id="passwordCheck" name="passwordCheck" required="required">
							</td>
						</tr>
						<tr>
							<th>*이름</th>
							<td>
								<input type="text" id="memberName" name="memberName" required="required">
							</td>
						</tr>
						<tr>
							<th>나이</th>
							<td>
								<input type="text" id="memberAge" name="memberAge">
							</td>
						</tr>
						<tr>
							<th>*전화번호</th>
							<td>
								<input type="text" id="memberTel" name="memberTel" required="required">
							</td>
						</tr>
						<tr>
							<th>*성별</th>
							<td>
								<input type="radio" id="memberGender" name="memberGender" value="M">남자
								<input type="radio" id="memberGender" name="memberGender" value="F" checked="checked">여자
							</td>
						</tr>
				</table>
			</div><br>
			<div>
				<input type="submit" value="등록">&nbsp;&nbsp;
				<input type="reset" value="취소">&nbsp;&nbsp;
				<input type="button" onclick="location.href='main.do'" value="홈으로">
			</div>
		</form>
	</div>
	<div>
		<jsp:include page="../main/footer.jsp"></jsp:include>
	</div>
</div>
<script type="text/javascript">
	function formCheck() {
		let frm = document.getElementById("frm");
		if (frm.memberPassword.value != frm.passwordCheck.value) {
			alert("비밀번호가 일치 하지 않습니다.");
			frm.memberPassword.value = "";
			frm.passwordCheck.value = "";
			frm.memberPassword.focus();
			return false;
		} else if (frm.checkId.value != "Yes") {
			alert("아이디 중복체크를 해 주세요.");
			return false;
		}
	
		return true;
	}
	
	function idCheck() {
		let id = document.getElementById("memberId").value;
		let url = "ajaxCheckId.do?id="+id;
		fetch(url) 
			.then(response => response.text())
			.then(text => htmlProcess(text));
		}
	
	function htmlProcess(data) {
		if(data == 'Yes') {
			alert(document.getElementById("memberId").value + "\n사용 가능한 아이디입니다.");
			document.getElementById("checkId").value = 'Yes';
	   } else {
		   alert(document.getElementById("memberId").value + "\n이미 존재하는 아이디입니다.");
		   document.getElementById("memberId").value = "";
		   document.getElementById("memberId").focus();
	   } 	
	}
</script>
</body>
</html>