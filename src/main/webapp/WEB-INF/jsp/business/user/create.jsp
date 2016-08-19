<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <!DOCTYPE>
 我是陈浩
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}</h1>
    <h2>create Goods</h2>
    <h3>${addMsg }</h3>
    <form action="<%=request.getContextPath()%>/Business/addGoods" method="get">
        <input type = "text" name = "name"/>
        <input type = "text" name = "subName"/>
        <input type = "submit" value = "增加"/>
    </form>
</body>
</html> --%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/userManager_userAdd.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
    <script type="text/javascript">
    $(document).ready(function(){

        // var numArr = []; // 定义一个空数组
  //       var txt = $('#input_all').find(':text'); // 获取所有文本框
  //       for (var i = 0; i < txt.length; i++) {
  //           numArr.push(txt.eq(i).val()); // 将文本框的值添加到数组中

  //       }   
    })
    


    </script>
</head>
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
                        <div>红包管理</div>
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
                    <li id="title_bg"><a href="userManager_userAdd.html">会员管理</a></li>
                    <li><a href="#">银行卡管理</a></li>
                    <li><a href="#">红包管理</a></li>
                    <li style="border-right: none;"><a href="#">站内消息管理</a></li>
                    <div class="clear"></div>
                </ul>
                <div class="table_top">新增会员信息</div>
                <table id="input_all">
                    <tr>
                        <td>
                            <div class="box box1">会员类型 :
                                <input type="text" name="add_1" dir="rtl" placeholder="请输入" class="input input4" id="lop">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">会员名称 :
                                <input type="text" name="add_2" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">会员邮件 :
                                <input type="text" name="add_3" placeholder="请输入" dir="rtl" class="input input1" value="121212">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">手机号 :
                                <input type="text" name="add_4" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">会员密码 :
                                <input type="text" name="add_5" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">会员密码 :
                                <input type="text" name="add_6" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">身份信息
                        </td>
                        <td colspan="2" class="input_title">学历信息
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">真实姓名 :
                                <input type="text" name="add_7" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">身份证号 :
                                <input type="text" name="add_8" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">最高学历 :
                                <input type="text" name="add_9" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">入学年份 :
                                <input type="text" name="add_10" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">出生日期 :
                                <input type="text" name="add_11" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">性别 :
                                <input type="text" name="add_12" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">毕业院校 :
                                <input type="text" name="add_13" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                12位在线码 :
                                <input type="text" name="add_14" placeholder="请输入" dir="rtl" class="input input11">
                            </div>
                        </td>       
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">婚姻状况
                        </td>
                        <td colspan="2" class="input_title">其他信息
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <div class="box box2">婚姻状况 :
                                <input type="text" name="add_15" placeholder="请输入" dir="rtl" class="input input2">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">有无子女 :
                                <input type="text" name="add_16" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">籍贯 :
                                <input type="text" name="add_17" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">房产信息
                        </td>
                        <td>
                            <div class="box box1">户口所在地 :
                                <input type="text" name="add_18" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">支付宝号 :
                                <input type="text" name="add_19" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">有无房产 :
                                <input type="text" name="add_20" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">有无房贷 :
                                <input type="text" name="add_21" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">学校 :
                                <input type="text" name="add_22" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">专业 :
                                <input type="text" name="add_23" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td colspan="2" class="input_title">购车信息
                        </td>
                        <td colspan="2">
                            <div class="box box2">居住地址 :
                                <input type="text" name="add_24" placeholder="请输入" dir="rtl" class="input input22">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">是否有车 :
                                <input type="text" name="add_25" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">有无车贷 :
                                <input type="text" name="add_26" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">状态 :
                                <input type="text" name="add_27" dir="rtl" placeholder="请输入" class="input input4">
                                <button class="xiala"></button>
                            </div>
                        </td>
                        <td>
                            <div class="box box1">
                                EMS :
                                <input type="text" name="add_28" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">汽车品牌 :
                                <input type="text" name="add_29" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>
                        <td>
                            <div class="box box1">购车年份 :
                                <input type="text" name="add_30" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                    <tr>
                        <td>
                            <div class="box box1">车牌号码 :
                                <input type="text" name="add_31" placeholder="请输入" dir="rtl" class="input input1">
                            </div>
                        </td>   
                    </tr>
                </table>
            </div>
            <div class="btn_g">
                <button class="btn btn1" id="qwe">提交</button>
                <button class="btn btn2">返回</button>
            </div>
        </div>
        <div class="bottom"></div>
    </div>
    <div class="mask" id="mask"></div>
</body>
</html>