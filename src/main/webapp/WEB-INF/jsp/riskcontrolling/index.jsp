<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/02.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
    <script type="text/javascript" src="../static/js/02.js"></script>
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
                                    <div class="head_2 aa">${admin.replayName}</div>
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
                <li class="bg">
                    <a href="02.html">
                        <img src="../static/img/img1/icon1.png">
                        <div>业务审核</div>
                    </a>
                </li>
                <li>
                    <a href="03.html">
                        <img src="../static/img/img1/icon2.png">
                        <div>签约管理</div>
                    </a>
                </li>
                <li>
                    <a href="04.html">
                        <img src="../static/img/img1/icon3.png">
                        <div>贷后管理</div>
                    </a>
                </li>
                <li>
                    <a href="05.html">
                        <img src="../static/img/img1/icon4.png">
                        <div>部门管理</div>
                    </a>
                </li>
                <li>
                    <a href="06.html">
                        <img src="../static/img/img1/icon5.png">
                        <div>人员信息</div>
                    </a>
                </li>
            </ul>
        </div>
        <div class="list">
            <div class="arrow"></div>
            <div class="list_top">
                <div class="list_top1">
                    <input type="text" placeholder="请输入姓名或手机号" value="" name="name" class="list_input1" id="name">
                </div>
                <div class="list_top2">
                    <input type="text" placeholder="开始时间" id="datepicker" class="begin_time"> <span>&nbsp;--&nbsp;</span>
                    <input type="text" placeholder="结束时间" id="datepicker1" class="end_time">
                </div>
                <button class="list_btn1"></button>
                <div class="list_top1">
                    <input type="text" placeholder="所有贷款" value="" name="dai" class="list_input2" readonly="readonly">
                    <button class="list_btn2" onclick="showDetail()"></button>
                    <ul class="dai_detail" id="dai_detail">
                        <li><input type="text" value="所有贷款" readonly="readonly"></li>
                        <li><input type="text" value="住房贷款" readonly="readonly"></li>
                        <li><input type="text" value="婚姻贷款" readonly="readonly"></li>
                        <li><input type="text" value="养老贷款" readonly="readonly"></li>
                        <li><input type="text" value="失业贷款" readonly="readonly"></li>
                    </ul>
                </div>
                <div class="list_top3">
                    <div class="list_title1"><a href="">待审核</a></div>
                    <div class="list_title2"><a href="">已审核</a></div>
                    <div class="list_title3"><a href="">全部</a></div>
                </div>
            </div>
            <div class="list_con">
                <table class="table_con" cellspacing="0">
                    <tr class="tr_1">
                        <th class="check_t"><input type="checkbox" class="check1" id="checkAll">任务名称</th>
                        <th>任务名称</th>
                        <th>项目名称</th>
                        <th>到达时间</th>
                        <th>流程名称</th>
                        <th>流程名称</th>
                        <th>流程名称</th>
                        <th>流程名称</th>
                        <th>流程名称</th>
                        <th><span class="delAll">删除选中</span></th>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1">任务名称</td>
                        <td>text1</td>
                        <td>text1</td>
                        <td>text1</td>
                        <td>text1text1text1text1text1text1</td>
                        <td>text1</td>
                        <td>text1</td>
                        <td>text1</td>
                        <td>text1</td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <!-- <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>ilkm</td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td>huh</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td align="center" class="td_r">
                            <a href="01.html" class="shenhe">审核</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr> -->
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