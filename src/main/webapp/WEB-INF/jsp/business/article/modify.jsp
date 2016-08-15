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
    <h2>modify article</h2>
    <h3>${addMsg }</h3>
    <form action="<%=request.getContextPath()%>/Business/modifyArticle" method="get">
        <input type = "hidden" name = "id" value = "${article.id }"/>
        <input type = "hidden" name = "contentFileName" value = "${article.contentFileName }"/>
        <input type = "text" name = "title" value = "${article.title }"/>
        <input type = "text" name = "icon" value = "${article.icon }"/>
        <input type = "text" name = "content" value = "${article.content }"/>
        <input type = "text" name = "cateId" value = "${article.cateId }"/>
        <input type = "text" name = "relUrl" value = "${article.relUrl }"/>
        <input type = "text" name = "seoTitle" value = "${article.seoTitle }"/>
        <input type = "text" name = "brief" value = "${article.brief }"/>
        <input type = "submit" value = "modify"/>
    </form>
</body>
</html>