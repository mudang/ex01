<%@page import="com.hb.guest.model.GuestDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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


<h1>수정하세요</h1>
<form method="post">
<p>
	<label for="sabun">sabun  :      </label><%=request.getParameter("sabun") %>
	</p>
	<p>
	<label for="name">name  :</label><input id="name" type="text" name="name"/>
	</p>
	<p>
	<label for="pay">pay  :</label><input id="pay" type="text" name="pay"/>
	</p>

	<p>
	<button type="submit"> 입 력 </button>
	</p>


</form>
</body>
</html>