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
    <h2>show articleCates</h2>
    <c:forEach var="articleCate" items="${articleCates}" varStatus="count">  
         <tr>  
            <td>${articleCate.id }</td>
            <td>${articleCate.title }</td>
        </tr>  
    </c:forEach>  
</body>
</html>