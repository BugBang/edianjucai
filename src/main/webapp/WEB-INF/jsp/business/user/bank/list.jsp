<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_Banklist.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
    <script type="text/javascript" src="../static/js/userManager_Banklist.js"></script>
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
                    <a href="<%=url%>/Business/index">
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
                    <li  id="title_bg"><a href="<%=url%>/Business/showAllUserBank">银行卡管理</a></li>
                    <li><a href="<%=url%>/Business/showAllEcvType">红包管理</a></li>
                    <li style="border-right: none;"><a href="<%=url%>/Business/showAllMsgSystem">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
	        <div class="list_top" style="overflow: hidden;">
                <form action="<%=url%>/Business/showAllUserBank" method="get">
	                <input type="text" placeholder="请输入会员名称" value="${pagination.userName }" name="userName" class="list_input1"/>
	                <input type="submit" value="搜索" class="btn btn2"/>
                </form>
	        </div>
            <div class="list_con">
                <table class="table_con" cellspacing="0">
                    <tr class="tr_1">
                        <th class="check_t"><input type="checkbox" class="check1" id="checkAll">会员名</th>
                        <th>银行卡号</th>
                        <th style="width:10%;">真实姓名</th>
                        <th>银行名称</th>
                        <th>区域</th>
                        <th>开户网点</th>
                        <th><span class="delAll">删除选中</span></th>
                    </tr>
                    <c:forEach var="userBank" items="${userBanks}" varStatus="count">
	                    <tr>
	                        <td id="td_1"><input type="checkbox" name="subBox" class="check1">${userBank.userName }</td>
	                        <td>${userBank.bankCard }</td>
	                        <td>${userBank.realName }</td>
	                        <td>${userBank.bankName }</td>
	                        <td>${userBank.regionLv1 }</td>
	                        <td>${userBank.bankZone }</td>
	                        <td align="center" class="td_r">
	                            <span class="del">删除</span>
	                        </td>
	                    </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="list_bottom">
                <a href="<%=url%>/Business/showAllUserBank?currentPage=1&userName=${pagination.userName }" class="a_0 a_1"></a>
                <c:if test="${pagination.currentPage <= 1 }">
                    <a href="<%=url%>/Business/showAllUserBank?currentPage=1&userName=${pagination.userName }" class="a_0 a_2"></a>
                </c:if>
                <c:if test="${pagination.currentPage > 1 }">
                    <a href="<%=url%>/Business/showAllUserBank?currentPage=${(pagination.currentPage - 1)}&userName=${pagination.userName }" class="a_0 a_2"></a>
                </c:if>
                <div class="page_1">第<input type="text" value="${pagination.currentPage }" class="page_inp page_inp1">页</div>
                <c:if test="${pagination.currentPage >= pagination.totalPage}">
                    <a href="<%=url%>/Business/showAllUserBank?currentPage=${(pagination.totalPage)}&userName=${pagination.userName }" class="a_0 a_3"></a>
                </c:if>
                <c:if test="${pagination.currentPage < pagination.totalPage}">
                    <a href="<%=url%>/Business/showAllUserBank?currentPage=${(pagination.currentPage + 1)}&userName=${pagination.userName }" class="a_0 a_3"></a>
                </c:if>
                <a href="<%=url%>/Business/showAllUserBank?currentPage=${pagination.totalPage }&userName=${pagination.userName }" class="a_0 a_4"></a>
                <div class="page_all">共<span>${pagination.totalPage }</span>页</div>
                <div class="page_fo">到<input type="text" value="${pagination.currentPage }" class="page_f" id="page">页</div>
                <input type="button" value="GO" class="page_inp" onclick="tiaozhuan('<%=url%>/Business/showAllUserBank')"/>
            </div>
        </div>
        <div class="bottom"></div>
    </div>
</body>
</html>