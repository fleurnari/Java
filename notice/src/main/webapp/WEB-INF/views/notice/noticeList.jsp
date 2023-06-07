<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<jsp:include page="../main/menu.jsp" />
	<div><h1>게시글 목록</h1></div>
	<div>
	<table border="1">
		<thead>
			<tr>
				<td align="center" width="150">순번</td>
				<td align="center" width="150">작성자</td>
				<td align="center" width="150">제목</td>
				<td align="center" width="150">작성일</td>
				<td align="center" width="150">조회수</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = "${notices}" var = "n">
				<tr onmouseover='this.style.background="#fcecae";'
					onmouseleave='this.style.background="#FFFFFF";'
					onclick="noticeChoice(${n.noticeId})"
				>
				<td align="center">${n.noticeId}</td>
				<td align="center">${n.noticeWriter}</td>
				<td align="center">${n.noticeTitle}</td>
				<td align="center">${n.noticeWdate}</td>
				<td align="center">${n.noticeHit}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div><br>
	<div>
		<c:if test="${not empty id}">
			<button type="button" onclick="location.href='noticeInsertForm.do'">글쓰기</button>
		</c:if>
	</div>
	<div>
		<form id="frm" action="noticeSelect.do" method="post">
			<input type="hidden" id="noticeId" name="noticeId">
		</form>
	</div>
	<div>
		<jsp:include page="../main/footer.jsp"></jsp:include>
	</div>
</div>
<script type="text/javascript">
	function noticeChoice(id) {
//		let url = 'noticeSelect.do?noticeId='+id;
//		location.href = url;
		let frm = document.getElementById("frm");
		frm.noticeId.value = id;
		frm.submit();
	}
</script>
</body>
</html>