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
		<div>
			<jsp:include page="../main/menu.jsp"></jsp:include>
		</div>
		<div><h1>게시글 수정</h1></div>
		<div>
			<form id="frm" action="noticeUpdate.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="150">작성자</th>
							<td width="150" align="center">
								${notice.noticeWriter}
							</td>
							<th width="150">작성일자</th>
							<td width="150" align="center">
								<input type="date" id="noticeWdate" name="noticeWdate" value="${notice.noticeWdate}" size="50">
							</td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3">
								<input type="text" id="noticeTitle" name="noticeTitle" value="${notice.noticeTitle}" size="88">
							</td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="3">
								<textarea rows="10" cols="90" id="noticeSubject" name="noticeSubject">${notice.noticeSubject}</textarea>
							</td>
						</tr>
					</table>
				</div><br>
				<div>
					<input type="hidden" id="noticeId" name="noticeId" value="${notice.noticeId}">
				</div>
				<div>
					<button type="submit">등록</button>&nbsp;&nbsp;
					<button type="reset">취소</button>&nbsp;&nbsp;
					<button type="button" onclick="location.href='noticeList.do'">목록</button>&nbsp;&nbsp;
				</div>
			</form>
		</div>
		<div>
			<jsp:include page="../main/footer.jsp"></jsp:include>
		</div>		
	</div>
</body>
</html>