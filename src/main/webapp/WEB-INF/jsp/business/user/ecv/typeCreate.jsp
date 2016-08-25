<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_HBadd.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>

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
                    <li><a href="<%=url%>/Business/showAllUserBank">银行卡管理</a></li>
                    <li id="title_bg"><a href="<%=url%>/Business/showAllEcvType">红包管理</a></li>
                    <li style="border-right: none;"><a href="#">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="table_top">新增红包信息</div>
            <div class="hongbao_info">
                <div class="box box2">
                    红包名称 :
                    <input type="text" name="txt1" placeholder="必填" dir="rtl" class="input input23">
                </div>
                <div class="box box2">
                    红包面额 :
                    <input type="text" name="txt2" placeholder="必填" dir="rtl" class="input input22">
                    <span class="input_ri">元</span>     
                </div>
                <div class="input_al">
                    <div class="box box3" style="float: left;">
                        可用次数 :
                        <input type="text" name="txt3" placeholder="必填" dir="rtl" class="input input3">     
                    </div>
                    <span class="input_right">可用次数为空或为0表示无限次数</span>
                    <div class="clear"></div>
                </div>  
               <div class="input_al">
                    <div class="box box3" style="float: left;">
                        有效期开始时间 :
                        <input type="text" name="txt4" dir="rtl" class="input input4 input_drop" readonly="readonly"> 
                        <button class="xiala"></button> 
                        <ul class="drop_1 drop">
                            <li>养老保险</li>
                            <li>医疗保险</li>
                            <li>失业保险</li>
                        </ul>
                    </div>
                    <span class="input_right">不设开始时间为即时生效</span>
                    <div class="clear"></div>
                </div>
                <div class="input_al">
                    <div class="box box3" style="float: left;">
                        有效期结束时间 :
                        <input type="text" name="txt5" dir="rtl" class="input input4 input_drop" readonly="readonly">   
                        <button class="xiala"></button>
                        <ul class="drop_1 drop">
                            <li>养老保险</li>
                            <li>医疗保险</li>
                            <li>失业保险</li>
                        </ul>
                    </div>
                    <span class="input_right">不设开始时间为永不过期<span>
                    <div class="clear"></div>
                </div>
                <div class="box box2">
                    发放类型 :
                    <input type="text" name="txt6" dir="rtl" class="input input5 input_drop" readonly="readonly">
                    <button class="xiala"></button>
                    <ul class="drop_2 drop">
                        <li>养老保险</li>
                        <li>医疗保险</li>
                        <li>失业保险</li>
                    </ul>
                </div>
                
            </div>
            <div class="btn_g">
                <button class="btn btn1">提交</button>
                <button class="btn btn2">返回</button>
            </div>
        </div>
        <div class="bottom"></div>
    </div>
    <div class="mask" id="mask"></div>
</body>
</html>