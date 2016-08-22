<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_ZNadd.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>

    <script src="js/jquery-ui.js"></script>
        <script type="text/javascript">
        $(document).ready(function(){
            $(".input_drop").click(function(){
                $(this).next().next().show();
                showMask();
            }); 

            $(".drop li").click(function(){
                var str = $(this).html();
                $('.drop').hide();
                $(this).parents().siblings().val(str);
                $("#mask").hide();  
            });
        })

        function showMask(){
            $("#mask").css("width",$(document).width());
            $("#mask").css("height",$(document).height());
            $("#mask").show();  
        }

    </script>
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
                                    <div class="head_2 aa">张开泰</div>
                                    <div class="head_3 aa">风控部</div>
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
                    <li><a href="<%=url%>/Business/showAllUserBank">银行卡管理</a></li>
                    <li><a href="<%=url%>/Business/showAllEcvType">红包管理</a></li>
                    <li id="title_bg" style="border-right: none;"><a href="<%=url%>/Business/showAllMsgSystem">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="sign_all">
                <div class="table_top">新增站内信息</div>
                <table>
                    <tr>
                        <td colspan="2">
                            <div class="box box2" style="margin-right: 30px;">
                                消息标题 :
                                <input type="text" name="text1" placeholder="必填" dir="rtl" class="input input2" id="aaaa">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                有效期结束时间 :
                                <input type="text" name="text2" dir="rtl" class="input input4 input_drop" readonly="readonly">
                                <button class="xiala"></button>
                                <ul class="drop_1 drop">
                                    <li>养老保险</li>
                                    <li>医疗保险</li>
                                    <li>失业保险</li>
                                </ul>
                            </div>
                        </td>
                        <td class="input_r">
                            不设结束时间为用不过期
                        </td>   
                    </tr>
                    <tr>
                        <td colspan="2">
                            <div class="box3">
                                <div class="box_title">消息内容:</div>
                                <textarea placeholder="请输入"></textarea>
                            </div>
                        </td>
                        <td colspan="2">
                            <div class="box3">
                                <div class="box_title">接收会员:</div>
                                <textarea placeholder="填写接收消息的用户名，用半角逗号分隔，不填写发送给所有用户。"></textarea>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="btn_g">
                <button class="btn btn1">新增</button>
                <button class="btn btn2">删除</button>
            </div>
        </div>
        <div class="bottom"></div>
    </div>
    <div class="mask" id="mask"></div>
</body>
</html>