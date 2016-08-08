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
    <h2>create article</h2>
    <h3>${addMsg }</h3>
    <form action="<%=request.getContextPath()%>/Business/addArticle" method="get">
        <input type = "text" name = "title"/>
        <input type = "text" name = "icon"/>
        <input type = "text" name = "content"/>
        <input type = "text" name = "cateId"/>
        <input type = "text" name = "relUrl"/>
        <input type = "text" name = "seoTitle"/>
        <input type = "text" name = "brief"/>
        <input type = "submit" value = "增加"/>
    </form>
</body>
</html>