<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style></style>
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>

 <h1>INDEX.JSP</h1>
 <p> ${msg}</p>
 <p><a href="Ex01.do?id=<%=request.getParameter("id") %>">링크</a></p>
 <p> <%=request.getParameter("id") %></p>
 <p> <%=session.getAttribute("msg2") %></p>

</body>
</html>