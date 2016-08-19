<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_user.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
    <script type="text/javascript" src="../static/js/userManager_user.js"></script>
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
                                    <div class="head_2 aa">${admin.replayName }</div>
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
                    <li id="title_bg"><a href="02_3.html">会员管理</a></li>
                    <li><a href="#">银行卡管理</a></li>
                    <li><a href="#">红包管理</a></li>
                    <li style="border-right: none;"><a href="#">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="list_top">
                <form action="<%=url%>/Business/index" method="get">
                <div class="list_top1">
                    <input type="text" placeholder="请输入会员名称" value="${pagination.userName }" id="userName" name="userName" class="list_input1">
                    <input type="text" placeholder="请输入真实姓名" value="${pagination.realName }" id="realName" name="realName" class="list_input1">
                    <input type="text" placeholder="请输入手机号码" value="${pagination.mobile }" id="mobile" name="mobile" class="list_input1 list_input2">
                    <input type="text" placeholder="请输入推荐人" value="${pagination.refName }" id="refName" name="refName" class="list_input1">   
                </div>
                <div class="list_top2">
                        <input type="text" value = "${pagination. beginTime}" id="beginTime" name = "beginTime" placeholder="开始时间" id="datepicker" class="begin_time"> <span>&nbsp;--&nbsp;</span>
                        <input type="text" value = "${pagination.endTime }" id="endTime" name = "endTime" placeholder="结束时间" id="datepicker1" class="end_time">
                    </div>
                <div class="btn_g">
                    <input class="btn btn1" value="查询" type = "submit">
                    <input value = "导出" type = "button" class="btn btn2" />
                    <input value = "新增" type = "button" class="btn btn1" onclick="goToAddUser('<%=request.getContextPath()%>')" />
                </div>
                <div class="clear"></div>
                </form>
            </div>
            <div class="list_con">
                <table class="table_con" cellspacing="0">
                    <tr class="tr_1">
                        <th class="check_t"><input type="checkbox" class="check1" id="checkAll">编号</th>
                        <th>会员</th>
                        <th>手机</th>
                        <th>投资金额</th>
                        <th>汇付客服号</th>
                        <th>真实姓名</th>
                        <th>身份证号</th>
                        <th>注册时间</th>
                        <th>推荐人</th>
                        <th><span class="delAll">删除选中</span></th>
                    </tr>
                    
                  <c:forEach var="user" items="${users}" varStatus="count">
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1">${user.id }</td>
                        <td>${user.userName }</td>
                        <td>${user.mobile }</td>
                        <td>${user.money }</td>
                        <td>${user.ipsAcctNo }</td>
                        <td>${user.realName }</td>
                        <td>${user.idno }</td>
                        <td>${user.createDateStr }</td>
                        <td>无</td>
                        <td align="center" class="td_r">
                            <a href="<%=url%>/Business/goToModifyUser?id=${user.id}" class="shenhe">操作</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                  </c:forEach>
                </table>
            </div>
            <div class="list_bottom">
                <a href="<%=url%>/Business/index?currentPage=1&userName=${pagination.userName }&realName=${pagination.realName }&mobile=${pagination.mobile }&refName=${pagination.refName }&beginTime=${pagination.beginTime }&endTime=${pagination.endTime }" class="a_0 a_1"></a>
                <c:if test="${pagination.currentPage <= 1 }">
                    <a href="<%=url%>/Business/index?currentPage=1&userName=${pagination.userName }&realName=${pagination.realName }&mobile=${pagination.mobile }&refName=${pagination.refName }&beginTime=${pagination.beginTime }&endTime=${pagination.endTime }" class="a_0 a_2"></a>
                </c:if>
                <c:if test="${pagination.currentPage > 1 }">
                    <a href="<%=url%>/Business/index?currentPage=${(pagination.currentPage - 1)}&userName=${pagination.userName }&realName=${pagination.realName }&mobile=${pagination.mobile }&refName=${pagination.refName }&beginTime=${pagination.beginTime }&endTime=${pagination.endTime }" class="a_0 a_2"></a>
                </c:if>
                <div class="page_1">第<input type="text" value="${pagination.currentPage }" class="page_inp page_inp1">页</div>
                <c:if test="${pagination.currentPage >= pagination.totalPage}">
                    <a href="<%=url%>/Business/index?currentPage=${(pagination.totalPage)}&userName=${pagination.userName }&realName=${pagination.realName }&mobile=${pagination.mobile }&refName=${pagination.refName }&beginTime=${pagination.beginTime }&endTime=${pagination.endTime }" class="a_0 a_3"></a>
                </c:if>
                <c:if test="${pagination.currentPage < pagination.totalPage}">
                    <a href="<%=url%>/Business/index?currentPage=${(pagination.currentPage + 1)}&userName=${pagination.userName }&realName=${pagination.realName }&mobile=${pagination.mobile }&refName=${pagination.refName }&beginTime=${pagination.beginTime }&endTime=${pagination.endTime }" class="a_0 a_3"></a>
                </c:if>
                <a href="<%=url%>/Business/index?currentPage=${pagination.totalPage }&userName=${pagination.userName }&realName=${pagination.realName }&mobile=${pagination.mobile }&refName=${pagination.refName }&beginTime=${pagination.beginTime }&endTime=${pagination.endTime }" class="a_0 a_4"></a>
                <div class="page_all">共<span>${pagination.totalPage }</span>页</div>
                <div class="page_fo">到<input type="text" value="${pagination.currentPage }" class="page_f" id="page">页</div>
                <input type="button" value="GO" class="page_inp" onclick="tiaozhuan('<%=url%>/Business/index')"/>
            </div>
        </div>
        <div class="bottom"></div>
    </div>
</body>
</html>