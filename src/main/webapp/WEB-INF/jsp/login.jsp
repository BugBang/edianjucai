<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/login" method="post">
        user name: <input type="text" name="userName" /><br/>
        pass word: <input type="password" name="password" /><br/>
        <input type="submit" value="submit" />
    </form>
    ${loginMsg}
</body>
</html>