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
    <h2>show Deals</h2>
    <c:forEach var="dealCate" items="${dealCates}" varStatus="count">  
         <tr>  
            <td>${dealCate.id }</td>
            <td>${dealCate.name }</td>
        </tr>  
    </c:forEach>  
    <c:forEach var="deal" items="${deals}" varStatus="count">  
         <tr>  
            <td>${deal.id }</td>
            <td>${deal.name }</td>
        </tr>  
    </c:forEach>  
</body>
</html>