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
    <h2>modify goodsCate</h2>
    <h3>${msg }</h3>
    <form action="<%=request.getContextPath()%>/Business/modifyGoodsCate" method="get">
        <input type = "hidden" name = "id" value = "${good.id }"/>
        <input type = "text" name = "name" value = "${good.name }"/>
        <input type = "submit" value = "modify"/>
    </form>
</body>
</html> --%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/jifen_splistadd.css">
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
                var val = $(this).val();
                $('.drop').hide();
                $(this).parents().siblings().val(str);
                $(this).parents().siblings(".hiddenInput").val(val);
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
<%String url = request.getContextPath(); %>
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
                    <a href="showAllDeal">
                        <img src="../static/img/img1/icon1.png">
                        <div>贷款管理</div>
                    </a>
                </li>
                <li>
                    <a href="<%=url%>/Business/index">
                        <img src="../static/img/img1/icon2.png">
                        <div>会员管理</div>
                    </a>
                </li>
                <li class="bg">
                    <a href="<%=url%>/Business/showAllGoods">
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
                    <li><a href="<%=url %>/Business/showAllGoods">商品列表</a></li>
                    <li><a href="<%=url %>/Business/showAllGoodsCate" id="title_bg">商品分类</a></li>
                    <li style="border-right: none;"><a href="<%=url %>/Business/showAllGoodsOrder">兑换商品</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="table_top">修改商品分类</div>
            <form action="<%=request.getContextPath()%>/Business/addGoodsCate" method="post">
            <div class="hongbao_info">
                <div class="box box2">名称 :
                    <input type="hidden" name="id" value="${goodsCate.id }" />
                    <input type="text" name="name" placeholder="必填" value="${goodsCate.name }" dir="rtl" class="input input23">
                </div>
                <div class="box box2">所属分类 :
                    <input type="hidden" class="hiddenInput" name="pid" value="${goodsCate.pid }"/>
                    <input type="text" dir="rtl" value="${goodsCate.name }" class="input input5 input_drop" readonly="readonly">
                    <button class="xiala"></button>
                    <ul class="drop_1 drop">
                        <li value="0">新建分类</li>
                        <c:forEach var="cate" items="${goodsCates }">
                        <c:if test="${cate.pid == 0 }">
                            <li value="${cate.id }">${cate.name }</li>
                        </c:if>
                        </c:forEach>
                    </ul>
                </div>
                <div class="box box2">状态 :
                    <input type="hidden" class="hiddenInput" name="isEffect" value="${goodsCate.isEffect }" />
                    <input type="text" value="${goodsCate.isEffect == 1 ? '有效' : '无效'}" dir="rtl" class="input input5 input_drop" readonly="readonly">
                    <button class="xiala"></button>
                    <ul class="drop_1 drop">
                        <li value="1">有效</li>
                        <li value="0">无效</li>
                    </ul>
                </div>
                <div class="box box2">排序 :
                    <input type="text" name="sort" placeholder="必填" dir="rtl" value="${goodsCate.sort }" class="input input23">
                </div>
            </div>
            <div class="btn_g">
                <input type="submit" value="提交" class="btn btn1"/>
                <input type="reset" value="返回" class="btn btn2"/>
            </div>
            </form>
        </div>
        <div class="bottom"></div>
    </div>
    <div class="mask" id="mask"></div>
</body>
</html>