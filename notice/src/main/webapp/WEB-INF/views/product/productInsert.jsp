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
		<div><h1>제품 등록</h1></div>
		<div>
		<form id="frm" action="productInsert.do" method="post" enctype="multipart/form-data">
			<div>
				<table border="1">
					<tr>
						<th width="100" align="center">제품코드</th>
						<td width="100">
							<input type="text" id="productId" name="productId" required="required">
						</td>
					</tr>
					<tr>
						<th>제품명</th>
						<td>
							<input type="text" id="productName" name="productName" required="required">
						</td>
					</tr>
					<tr>
						<th>이미지</th>
						<td>
							<input type="file" id="pfile" name="pfile">
						</td>
					</tr>
				</table>
				</div><br>
				<div>
					<button type="submit">등록</button>&nbsp;&nbsp;
					<button type="reset">취소</button>&nbsp;&nbsp;
					<button type="button" onclick="location.href='productList.do'">목록</button>&nbsp;&nbsp;
				</div>
			</form>
		</div>
		<jsp:include page="../main/footer.jsp"></jsp:include>
	</div>
</body>
</html>