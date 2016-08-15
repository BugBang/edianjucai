<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}</h1>
    <h2>modify adv</h2>
    <h3>${msg }</h3>
    <form action="<%=request.getContextPath()%>/Business/modifyAdv" method="get">
        <input type = "hidden" name = "id" value = "${adv.id }"/>
        <input type = "text" name = "name" value = "${adv.name }"/>
        <input type = "submit" value = "modify"/>
    </form>
</body>
</html>