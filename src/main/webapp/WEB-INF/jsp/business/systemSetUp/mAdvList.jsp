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
    <h2>show MAdvs</h2>
    <c:forEach var="mAdv" items="${mAdvs}" varStatus="count">  
         <tr>  
            <td>${mAdv.id }</td>
            <td>${mAdv.name }</td>
        </tr>  
    </c:forEach>  
</body>
</html>