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
		<div><h1>게시글 등록</h1></div>
		<div>
			<form id="frm" action="noticeInsert.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="150">작성자</th>
							<td width="150" align="center">
								<input type="text" id="noticeWriter" name="noticeWriter" value=${name} readonly="readonly" size="30">
							</td>
							<th width="150">작성일자</th>
							<td width="150" align="center">
								<input type="date" id="noticeWdate" name="noticeWdate" size="50" required="required">
							</td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3">
								<input type="text" id="noticeTitle" name="noticeTitle" size="88" required="required">
							</td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="3">
								<textarea rows="10" cols="90" id="noticeSubject" name="noticeSubject"></textarea>
							</td>
						</tr>
					</table>
				</div><br>
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