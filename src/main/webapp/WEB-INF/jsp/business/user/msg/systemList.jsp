<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="/tags" prefix="date"%>
<%-- <!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}</h1>
    <h2>show msgSystem</h2>
    <h3>${msg }</h3>
    <c:forEach var="msgSystem" items="${msgSystems}" varStatus="count">  
         <tr>  
            <td>${msgSystem.id }</td>
            <td>${msgSystem.title }</td>
        </tr>  
    </c:forEach>  
</body>
</html> --%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_ZNlist.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
    <script type="text/javascript" src="../static/js/userManager_ZNist.js"></script>
</head>
<% String url = request.getContextPath(); %>
<body>
    <div class="sheet">
        <div class="head">  
            <div class="title">
                <img src="../static/img/img1/logo.png" class="logo">
                <div class="title_r">
                    <ul>
                        <li class="li_1"></li>
                        <li class="li_2"></li>
                        <li class="li_3">
                            <div>
                                <img src="../static/img/img1/head.png" class="head_img">
                                <div class="head_1">
                                    <div class="head_2 aa">${admin.replayName}</div>
                                    <div class="head_3 aa">业务部</div>
                                </div>
                                <img src="../static/img/img1/edit.png" class="edit" id="edit">
                                <div class="clear"></div>
                            <div>
                        </li>
                        <div class="clear"></div>
                    </ul>
                </div>
            </div>
        </div>
        <div class="nav">
            <ul>
                <li>
                    <a href="#">
                        <img src="../static/img/img1/icon1.png">
                        <div>贷款管理</div>
                    </a>
                </li>
                <li class="bg">
                    <a href="userManager_user.html">
                        <img src="../static/img/img1/icon2.png">
                        <div>会员管理</div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="../static/img/img1/icon3.png">
                        <div>积分商城</div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="../static/img/img1/icon4.png">
                        <div>前端管理</div>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <img src="../static/img/img1/icon5.png">
                        <div>系统设置</div>
                    </a>
                </li>
            </ul>
        </div>
        <div class="list">
            <div class="arrow"></div>
            <div class="sign_all">
                <ul class="sign_title">
                    <li><a href="<%=url%>/Business/index">会员管理</a></li>
                    <li><a href="<%=url%>/Business/showAllUserBank">银行卡管理</a></li>
                    <li id="title_bg"><a href="<%=url%>/Business/showAllEcvType">红包管理</a></li>
                    <li style="border-right: none;"><a href="<%=url%>/Business/showAllMsgSystem">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="list_top">
                <button class="btn btn1">新增</button>
                <button class="btn btn2">删除</button>
            </div>
            <div class="list_con">
                <table class="table_con" cellspacing="0">
                    <tr class="tr_1">
                        <th class="check_t"><input type="checkbox" class="check1" id="checkAll"></th>
                        <th>编号</th>
                        <th>消息标题</th>
                        <th>创建时间</th>
                        <th>结束时间</th>
                        <th style="width:5%;"></th>
                    </tr>
                    <c:forEach var="msgSystem" items="${msgSystems}" varStatus="count">
	                    <tr>
	                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
	                        <td>${msgSystem.id }</td>
	                        <td>${msgSystem.title }</td>
	                        
	                        <td class="td_r">
	                            <a href="#">操作</a>
	                        </td>
	                    </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="list_bottom">
                <a href="#" class="a_0 a_1"></a>
                <a href="#" class="a_0 a_2"></a>
                <div class="page_1">第<input type="text" value="4" class="page_inp page_inp1">页</div>
                <a href="#" class="a_0 a_3"></a>
                <a href="#" class="a_0 a_4"></a>
                <div class="page_all">共<span>20</span>页</div>
                <div class="page_fo">到<input type="text" value="" class="page_f" id="page">页</div>
                <input type="button" value="GO" class="page_inp" onclick="tiaozhuan()">
            </div>
        </div>
        <div class="bottom"></div>
    </div>
</body>
</html>