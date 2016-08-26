<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../static/css/jifen_listAdd.css">
    <link rel="stylesheet" href="../static/js/jquery-ui.css">
    <script type="text/javascript" src="../static/js/jquery-3.1.0.min.js"></script>
    <script src="../static/js/jquery-ui.js"></script>
    <script src="../static/js/ajaxfileupload.js"></script>

    <script type="text/javascript" src="../static/js/text/ueditor.config.js"></script>
    <script type="text/javascript" src="../static/js/text/ueditor.all.min.js"> </script>
    <script type="text/javascript" src="../static/js/text/lang/zh-cn/zh-cn.js"></script>

    <script type="text/javascript">
    $(function() {
        var ue = UE.getEditor('editor');

        $(".select_file").change(function(event) {
            var obj = $(this);
            var files = event.target.files, file;
            if (files && files.length > 0) {
                file = files[0];
                if(file.size > 1024 * 1024 * 3) {
                    alert('图片大小不能超过 3MB!');
                    return false;
                }
		        var url = window.URL || window.webkitURL;
		        var imgURL = url.createObjectURL(file);
	            obj.parent().parent().next().attr('src', imgURL);
                var formData = new FormData($( "#uploadForm" )[0]);
                $.ajax({  
                    url: '<%=request.getContextPath()%>/Business/setImage',  
                    type: 'POST',  
                    data: formData,  
                    async: false,  
                    cache: false,  
                    contentType: false,  
                    processData: false,  
                    success: function (returndata) {  
                        $("#realPic").val(returndata);
                    },  
                    error: function (returndata) {  
                        alert(returndata);  
                    }  
               });  
            }
            
        });
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
    });

    function showMask(){
            $("#mask").css("width",$(document).width());
            $("#mask").css("height",$(document).height());
            $("#mask").show();  
        }

    </script>
</head>
<%String url = request.getContextPath();%>
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
                <li >
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
        <form action="<%=url%>/Business/modifyGoods" id="uploadForm" method="post">
        <div class="list">
            <div class="arrow"></div>
            <div class="sign_all">
                <ul class="sign_title">
                    <li style="border-right: none;"  id="title_bg"><a href="#">商品列表</a></li>
                    <li><a href="#">商品分类</a></li>
                    <li><a href="#">兑换商品</a></li>
                    <div class="clear"></div>
                </ul>
                <div class="table_top">新增商品</div>
                <div>
                    <div class="table_1">
                        <table>
                            <tr>
                                <td colspan="2" class="input_title">
                                商品基本信息
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="box box2">商品名称 :
                                        <input type="hidden" name="id" value="${good.id }"/>
                                        <input type="text" name="name" placeholder="必填" value="${good.name }" dir="rtl" class="input input2">
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="box box1">简短名称 :
                                        <input type="text" name="subName" placeholder="请输入" value="${good.subName }" dir="rtl" class="input input3">
                                    </div>
                                </td>
                                <td>
                                    <div class="td_ri">用于邮件，短信的显示，字数不得超过20个字</div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="box5">
                                        <div class="box_title">商品简介:</div>
                                        <textarea placeholder="请输入" name="description">${good.description }</textarea>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="box box1">分类 :
                                        <input type="hidden" class="hiddenInput" value="${good.cateid }" name = "cateId"/>
                                        <input type="text" name="te8" dir="rtl" placeholder="必填" value="${good.cateName }" class="input input4 input_drop" readonly="readonly">
                                        <button class="xiala"></button>
                                        <ul class="drop_1 drop">
                                            <c:forEach var="goodsCate" items="${goodsCates}" varStatus="count">
                                            <li value="${goodsCate.id }">${goodsCate.name }</li>
                                            </c:forEach>
                                        </ul>
                                    </div>
                                </td>
                                <td>
                                    <div class="box box1">购买所需积分 :
                                        <input type="text" name="score" placeholder="必填" dir="rtl" value="${good.score }" class="input input5">
                                        <span class="input_ri">分</span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="box box1">虚拟购买数 :
                                        <input type="text" name="inventedNumber" placeholder="请输入" value="${good.inventedNumber }" dir="rtl" class="input input3">
                                    </div>
                                </td>
                                <td>
                                    <div class="box box1">市场价格 :
                                        <input type="text" name="money" placeholder="必填" dir="rtl" value="${good.money }" class="input input5">
                                        <span class="input_ri">分</span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="box box2">商品购买地址 :
                                        <input type="text" name="url" placeholder="必填" dir="rtl" value="${good.url }" class="input input2">
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="box box1">库存数 :
                                        <input type="text" name="maxBought" placeholder="请输入" value="${good.maxBought }" dir="rtl" class="input input3">
                                    </div>
                                </td>
                                <td>
                                    <div class="box box1">会员最大购买量 :
                                        <input type="text" name="buyNumber" placeholder="请输入" value="${good.buyNumber }" dir="rtl" class="input input3">
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div>
                                        <div class="box box4">商品缩略图 :
                                            <input type="text" name="txt7" dir="rtl" class="input">
                                            <a href="javascript:;" class="file">上传图片
                                                <input type="file" name="realPicFile" id="realPicFile" class="select_file input">
                                                <input type="hidden" name="img" id="realPic"/>
                                                <input type="hidden" name="imgName" class="imgName" />
                                            </a>
                                            <button class="suolue"></button>
                                        </div>
                                        <c:if test="${!empty good.img}">
                                            <img src="../images/${good.img }" class="tupian">
                                        </c:if>
                                        <c:if test="${empty good.img }">
                                            <img src="../static/img/img/add_1.png" class="tupian">
                                        </c:if>
                                        <div class="clear"></div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="baozhang">商品描述</div>
                                    <div id="editor" style="width:556px;height:240px;">
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div class="table_1">
                        <table >
                            <tr>
                                <td colspan="2" class="input_title">属性设置
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="box box1">是否热卖 :
                                        <input type="hidden" value="${good.isHot == '' ? 0 : 1}" class="hiddenInput" name="isHot"/>
                                        <input type="text" name="te6" dir="rtl" value="${good.isHot == '' ? '否' : '是'}" class="input input4 input_drop" readonly="readonly">
                                        <button class="xiala" onclick="hk_style()"></button>
                                        <ul class="drop_1 drop">
                                            <li value="1">热卖</li>
                                            <li value="0">不热卖</li>
                                        </ul>
                                    </div>
                                </td>
                                <td>
                                    <div class="box box1">是否新品 :
                                        <input type="hidden" value="${good.isNew == '' ? 0 : 1}" class="hiddenInput" name="isNew" />
                                        <input type="text" name="te7" dir="rtl" value = "${good.isNew == '' ? '否' : '是'}" class="input input4 input_drop" readonly="readonly">
                                        <button class="xiala" onclick="hk_style()"></button>
                                        <ul class="drop_1 drop">
                                            <li value="1">是</li>
                                            <li value="0">否</li>
                                        </ul>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="box box1">是否推荐 :
                                        <input type="hidden" class="hiddenInput" value="${good.isRecommend == '' ? 0 : 1 }" name="isRecommend" />
                                        <input type="text" name="te8" dir="rtl" value="${good.isRecommend == '' ? '否' : '是' }" class="input input4 input_drop" readonly="readonly">
                                        <button class="xiala" onclick="hk_style()"></button>
                                        <ul class="drop_1 drop">
                                            <li value="1">是</li>
                                            <li value="0">否</li>
                                        </ul>
                                    </div>
                                </td>
                                <td>
                                    <div class="box box1">商品类型 :
                                        <input type="hidden" class="hiddenInput" value="${good.goodsTypeId }" name="goodsTypeId" />
                                        <input type="text" name="te8" dir="rtl" value="${good.goodsTypeName }" class="input input4 input_drop" readonly="readonly">
                                        <button class="xiala" onclick="hk_style()"></button>
                                        <ul class="drop_1 drop">
                                            <c:forEach var="goodsType" items="${goodsTypes}" varStatus="count">
                                            <li value="${goodsType.id }">${goodsType.name }</li>
                                            </c:forEach>
                                        </ul>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="box box2">商品属性 :
                                        <input type="text" name="te3" placeholder="由商品类型决定" readonly="readonly" value="${good.goodsTypeName }" dir="rtl" class="input input2">
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="box box1">是否配送 :
                                        <input type="hidden" value="${good.isDelivery == '否' ? 0 : 1}" class="hiddenInput" name="isDelivery"/>
                                        <input type="text" name="te6" dir="rtl" value="${good.isDelivery}" class="input input4 input_drop" readonly="readonly">
                                        <button class="xiala" onclick="hk_style()"></button>
                                        <ul class="drop_1 drop">
                                            <li value="1">是</li>
                                            <li value="0">否</li>
                                        </ul>
                                    </div>
                                </td>
                                <td>
                                    <div class="td_ri">需要配送表示购买时需填写购买地址，需要计算运费</div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="input_title">
                                SEO设置
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="box5">
                                        <div class="box_title">贷款SEO自定义标题:</div>
                                        <textarea placeholder="请输入" name="seoTitle">${good.seoTitle }</textarea>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="box5">
                                        <div class="box_title">贷款SEO自定义关键词:</div>
                                        <textarea placeholder="请输入" name="seoKeyword">${good.seoKeyword }</textarea>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <div class="box5">
                                        <div class="box_title">贷款SEO自定义描述:</div>
                                        <textarea placeholder="请输入" name="seoDescription">${good.seoDescription }</textarea>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div class="clear"></div>
                </div>  
            </div>
            <div class="btn_g">
                <input type="submit" value="提交" class="btn btn1" />
                <input type="button" value="返回" class="btn btn2" />
            </div>
        </div>
        </form>
        <div class="bottom"></div>
    </div>
    <div class="mask" id="mask"></div>
</body>
</html>