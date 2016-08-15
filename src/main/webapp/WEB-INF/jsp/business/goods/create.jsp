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
    <h2>create Goods</h2>
    <h3>${addMsg }</h3>
    <form action="<%=request.getContextPath()%>/Business/addGoods" method="get">
        <input type = "text" name = "name"/>
        <input type = "text" name = "subName"/>
        <input type = "submit" value = "增加"/>
    </form>
</body>
</html>