<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.name}登陆成功</h1>
    <c:forEach var="product" items="${admins}" varStatus="count">  
       <tr>  
			<td>${product.name}</td>  
			<td>${product.password}</td>  
        </tr>  
</c:forEach>  
</body>
</html>