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
	<div><h1>회원목록</h1></div>
	<div>
		<table border="1">
			<thead>
				<tr>
					<th width="150">아이디</th>
					<th width="150">이 름</th>
					<th width="150">전화번호</th>
					<th width="100">성 별</th>
					<th width="100">나 이</th>
					<th width="200">등록일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${members }" var="m" >
					<tr>
						<td align="center">${m.memberId }</td>
						<td align="center">${m.memberName }</td>
						<td align="center">${m.memberTel }</td>
						<td align="center">${m.memberGender }</td>
						<td align="center">${m.memberAge }</td>
						<td align="center">${m.memberDate }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div><br>
	<div>
		<form>
			<select name="key" id="key">
				<option value="">--Please choose an option--</option>
				<option value="all">전체</option>
			    <option value="id">아이디</option>
			    <option value="name">이름</option>
			    <option value="tel">전화번호</option>
			    <option value="gender">성별</option>
			    <option value="age">나이</option>
			    <option value="date">등록일</option>
		   </select> &nbsp;&nbsp;
			검색할 값을 입력하세요 : <input type="text" id="val" name="val">
		</form>
		<button type="button" onclick="ajaxCall()">JSON 검색</button>
	</div>
</div>

<script type="text/javascript">
	function dateFormat(date) {  //날짜 형식 변환 및 날짜연산
	    let month = date.getMonth() + 1;
	    let day = date.getDate();
	    	
	    month = month >= 10 ? month : '0' + month;  //월이 1,2 등 한자리면 01,02로 변경
	    day = day >= 10 ? day : '0' + day;
	   	
	    return date.getFullYear() + '-' + month + '-' + day; //날짜가 한자리면 01,02 로변경
	}
	
	function ajaxCall(){   // POST로 호출할때 
		let url = "ajaxMemberList.do";
		let key = document.getElementById("key").value;
		let val = document.getElementById("val").value;
		let end = new Date();

		if(key == 'date') {  //날짜 검색이면 
			end = new Date(val);  //날짜로 변경하고
			end.setDate(end.getDate() + 1);  //하루를 더한다. 검색을 위해
		}

		const payload = 'key=' + key + '&val=' + val + '&end=' + dateFormat(end);
		
		fetch(url,{
			method: "POST",
			headers: {
		       "Content-Type": "application/x-www-form-urlencoded",
	        },
			body: payload
		})
		.then(response => response.json())
		.then(json =>HtmlConvert(json));
	}
	
/*
 * Get 방식으로 호출할 때
 *
	function ajaxCall(){       
		let url = "ajaxMemberList.do";
		let key = document.getElementById("key").value;
		let val = document.getElementById("val").value;
		let payload = '?key='+key+'&val='+val;  //get 방식일때
		if(key == 'date') {  //날짜 검색이면 마지막 날짜 추가
			end = new Date(val);
			end.setDate(end.getDate() + 1);
			payload += '&end=' + dateFormat(end);
		}
		
		url += payload;  //url 에 get방식으로 데이터 넘김
 		fetch(url)
			.then(response => response.json())
			.then(json =>HtmlConvert(json));
	}
*/	
	function HtmlConvert(datas) {  //json을 html로 변환해서 화면에 뿌림
		document.querySelector('tbody').remove();  //<tbody> 삭제
		const container = document.createElement('tbody'); //<tbody>태그 생성
		container.innerHTML = datas.map(data => createHTMLString(data)).join("");  //Html 변환
		document.querySelector('table').appendChild(container);  //<table>에 추가
	}
	
	function createHTMLString(data){  //html 변환 코드 css, event Listner를 활용하면 깔끔하게 정리됨
		let str = "<tr>";
			str += "<td align='center'>" + data.memberId + "</td>";
			str += "<td align='center'>" + data.memberName + "</td>";
			str += "<td align='center'>" + data.memberTel + "</td>";
			str += "<td align='center'>" + data.memberGender + "</td>";
			str += "<td align='center'>" + data.memberAge + "</td>";
			str += "<td align='center'>" + data.memberDate + "</td></tr>";
		return str;
	}

</script>
</body>
</html>