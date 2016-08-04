<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/css/login.css">
    <script type="text/javascript">
    window.onload = function(){
        var user = document.getElementById('user');
        var pw = document.getElementById('pw');
        var check = document.getElementById('check');
        var login_btn = document.getElementById('login_btn');
        var loUser = localStorage.getItem("user") || "";
        var loPw = localStorage.getItem("pw") || "";
        user.value = loUser;
        pw.value = loPw;

        if(loUser !== "" && loPw !== ""){
            check.setAttribute("checked","");
        }

        login_btn.onclick = function(){
             if(check.checked){
                localStorage.setItem("user",user.value);
                localStorage.setItem("pw",pw.value);
            } else {
                localStorage.clear();
            }
        } 
    }
    </script>
</head>
<body>
    <div class="login">
        <div class="title">壹点聚财后台管理系统</div>
        <div class="content">
        <form action="<%=request.getContextPath()%>/login" method="post">
            <div class="con_right">
        ${loginMsg }
                <div class="con con_user">
                    <img src="<%=request.getContextPath()%>/static/img/03.png" class="user_img">
                    <input type="text" name="userName" placeholder="账号" class="inp" id="user">
                </div>
                <div class="con con_pw">
                    <img src="<%=request.getContextPath()%>/static/img/06.png" class="user_img">
                    <input type="password" name="password" placeholder="密码" class="inp" id="pw">
                </div>
                <div class="rem_pw">
                    <input type="checkbox" name="remember" value="" id="check">记住密码
                </div>
                <input type="submit" value="登录" name="login" class="login_btn" id="login_btn">
            </div>
         </form>
        </div>
    </div>
</body>
</html>