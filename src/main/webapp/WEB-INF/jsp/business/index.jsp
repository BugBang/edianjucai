<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}登陆成功</h1>
    <h2>业务</h2>
    <c:forEach var="user" items="${users}" varStatus="count">  
         <tr>  
            <td>${user.id }</td>
            <td>${user.userName }</td>
            <td>${user.money }</td>
            <td>${user.mobile }</td>
            <td>${user.ipsAcctNo }</td>
            <td>${user.idno }</td>
            <td>${user.realName }</td>
            <td>${user.tuiGuang }</td>
            <td>${user.isEffect }</td>
            <td>${user.isBlack }</td>
            <td>${user.createDateStr }</td>
        </tr>  
    </c:forEach>  
</body>
</html>