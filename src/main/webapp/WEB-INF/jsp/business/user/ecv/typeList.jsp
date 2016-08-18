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
    <h2>show ecv type</h2>
    <h3>${msg }</h3>
    <c:forEach var="ecvType" items="${ecvTypes}" varStatus="count">  
         <tr>  
            <td>${ecvType.id }</td>
            <td>${ecvType.name }</td>
        </tr>  
    </c:forEach>  
</body>
</html>