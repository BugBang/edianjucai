<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}</h1>
    <h2>modify goods</h2>
    <h3>${msg }</h3>
    <form action="<%=request.getContextPath()%>/Business/modifyGoods" method="get">
        <input type = "hidden" name = "id" value = "${good.id }"/>
        <input type = "text" name = "name" value = "${good.name }"/>
        <input type = "text" name = "subName" value = "${good.subName }"/>
        <input type = "submit" value = "modify"/>
    </form>
</body>
</html> --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_userChange.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
    <script type="text/javascript" src="../static/js/userManager_userChange.js"></script>
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
        <div class="sign">
            <div class="arrow"></div>
            <div class="sign_all">
                <ul class="sign_title">
                     <li id="title_bg"><a href="<%=url%>/Business/index">会员管理</a></li>
                    <li><a href="<%=url%>/Business/showAllUserBank">银行卡管理</a></li>
                    <li><a href="<%=url%>/Business/showAllEcvType">红包管理</a></li>
                    <li style="border-right: none;"><a href="<%=url%>/Business/showAllMsgSystem">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
                <div class="table_top">会员信息编辑</div>
                <table>
                    <tr>
                        <td colspan="2">
                            <div class="box box2">
                                最后登录IP :
                                <input type="text" name="ch_1" placeholder="请输入" dir="rtl" class="input input22" value="${test }">
                            </div>
                        </td>
                        <td colspan="2">
                            <div class="box box2">
                                最后登录时间 :
                                <input type="text" name="ch_2" placeholder="请输入" dir="rtl" class="input input22" value="2016-08-13 15:16">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td colspan="2">
                            <div class="box box2">
                                注册时间 :
                                <input type="text" name="ch_3" placeholder="请输入" dir="rtl" class="input input22" value="2015-12-10 15:16">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                会员类型 :
                                <input type="text" name="ch_4" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                会员名称 :
                                <input type="text" name="ch_5" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">
                                会员邮件 :
                                <input type="text" name="ch_6" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                手机号 :
                                <input type="text" name="ch_7" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                会员密码 :
                                <input type="text" name="ch_8" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                会员密码 :
                                <input type="text" name="ch_9" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">
                            身份信息
                        </td>
                        <td colspan="2" class="input_title">
                            学历信息
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">
                                真实姓名 :
                                <input type="text" name="ch_10" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                身份证号 :
                                <input type="text" name="ch_11" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                最高学历 :
                                <input type="text" name="ch_12" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                入学年份 :
                                <input type="text" name="ch_13" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">
                                出生日期 :
                                <input type="text" name="ch_14" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                性别 :
                                <input type="text" name="ch_15" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                毕业院校 :
                                <input type="text" name="ch_16" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                12位在线码 :
                                <input type="text" name="ch_17" placeholder="请输入" dir="rtl" class="input input11">
                            </div>
                        </td>       
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">
                            婚姻状况
                        </td>
                        <td colspan="2" class="input_title">
                            其他信息
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <div class="box box2">
                                婚姻状况 :
                                <input type="text" name="ch_18" placeholder="请输入" dir="rtl" class="input input2">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                有无子女 :
                                <input type="text" name="ch_19" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                籍贯 :
                                <input type="text" name="ch_20" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">
                            房产信息
                        </td>
                        <td>
                            <div class="box box1">
                                户口所在地 :
                                <input type="text" name="ch_21" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                支付宝号 :
                                <input type="text" name="ch_22" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">
                                有无房产 :
                                <input type="text" name="ch_23" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                有无房贷 :
                                <input type="text" name="ch_24" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                学校 :
                                <input type="text" name="ch_25" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                专业 :
                                <input type="text" name="ch_26" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">
                            购车信息
                        </td>
                        <td colspan="2">
                            <div class="box box2">
                                居住地址 :
                                <input type="text" name="ch_27" placeholder="请输入" dir="rtl" class="input input22">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">
                                是否有车 :
                                <input type="text" name="ch_28" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                有无车贷 :
                                <input type="text" name="ch_29" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                状态 :
                                <input type="text" name="ch_30" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                EMS :
                                <input type="text" name="ch_31" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">
                                汽车品牌 :
                                <input type="text" name="ch_32" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                购车年份 :
                                <input type="text" name="ch_33" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">
                                车牌号码 :
                                <input type="text" name="ch_34" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                </table>
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

