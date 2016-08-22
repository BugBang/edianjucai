<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_ZNlook.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
</head>
<% String url = request.getContextPath(); %>
<body>
    <div class="sheet">
        <div class="head">  
            <div class="title">
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
                        <img src="../static/img//img1/icon1.png">
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
                    <li><a href="<%=url%>/Business/showAllUserBank">银行卡管理</a></li>
                    <li><a href="<%=url%>/Business/showAllEcvType">红包管理</a></li>
                    <li style="border-right: none;" id="title_bg"><a href="<%=url%>/Business/showAllMsgSystem">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="sign_all">
                <div class="table_top">新增站内信息</div>
                <div class="box">
                    消息标题 :
                    <input type="text" name="text1" value="VIP等级升级" dir="rtl" class="input input2">
                </div>
                <div class="box3">
                    <div class="box_title">消息内容:</div>
                    <textarea>VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级VIP等级升级</textarea>
                </div>
            </div>
            <div class="btn_g">
                <button class="btn">返回</button>
            </div>
        </div>
        <div class="bottom"></div>
    </div>
</body>
</html>