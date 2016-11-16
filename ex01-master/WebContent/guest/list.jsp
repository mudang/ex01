<%@page import="java.util.ArrayList"%>
<%@page import="com.hb.guest.model.GuestDto"%>
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
<%
ArrayList list=(ArrayList)request.getAttribute("alist");
for(int i=0; i<list.size(); i++){
	GuestDto map = (GuestDto)list.get(i);
System.out.print(map.getSabun());
System.out.print((","));
System.out.print(map.getName());
System.out.print((","));
System.out.print(map.getNalja());
System.out.print((","));
System.out.print(map.getPay());
System.out.println();
}
%>

</body>
</html>