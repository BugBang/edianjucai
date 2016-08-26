<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--  
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}</h1>
    <h2>create article</h2>
    <h3>${addMsg }</h3>
    <form action="<%=request.getContextPath()%>/Business/addArticle" method="get">
        <input type = "text" name = "title"/>
        <input type = "text" name = "icon"/>
        <input type = "text" name = "content"/>
        <input type = "text" name = "cateId"/>
        <input type = "text" name = "relUrl"/>
        <input type = "text" name = "seoTitle"/>
        <input type = "text" name = "brief"/>
        <input type = "submit" value = "增加"/>
    </form>
</body>
</html>
-->

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../static/css/qianduan_listAdd.css">
	<link rel="stylesheet" href="../static/js/jquery-ui.css">
 	<script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
 	<script src="../static/js/jquery-ui.js"></script>

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
             	var URL = window.URL || window.webkitURL;
              	var imgURL = URL.createObjectURL(file);
              	obj.parent().parent().next().attr('src', imgURL);
        	}
      	});

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
    });

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
					<a href="showAllDeal">
						<img src="../static/img/img1/icon1.png">
						<div>贷款管理</div>
					</a>
				</li>
				<li>
					<a href="/edianjucai/Business/index">
						<img src="../static/img/img1/icon2.png">
						<div>会员管理</div>
					</a>
				</li>
				<li>
					<a href="<%=url%>/Business/showAllGoods">
						<img src="../static/img/img1/icon3.png">
						<div>积分商城</div>
					</a>
				</li>
				<li class="bg">
					<a href="<%=url%>/Business/showAllArticle">
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
					<li id="title_bg"><a href="<%=url%>/Business/showAllArticle">文章列表</a></li>
					<li><a href="<%=url%>/Business/showAllArticleCate">文章分类</a></li>
					<li style="border-right: none;"><a href="<%=url%>/Business/showAllAdv">前端广告管理</a></li>
					<div class="clear"></div>
				</ul>
				<div class="table_top">新增文章</div>
				<div>
					<div class="table_1">
						<table>
							<tr>
								<td colspan="2">
									<div class="box box2">
										文章标题 :
										<input type="text" name="te3" placeholder="必填" dir="rtl" class="input input2">
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<div>
										<div class="box box4">
											图标 :
											<input type="text" name="txt7" dir="rtl" class="input">
											<a href="javascript:;" class="file">上传图片
												<input type="file" class="select_file input">
											</a>
											<button class="suolue"></button>
										</div>
										<img src="../static/img/img/add_1.png" class="tupian">
										<div class="clear"></div>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="box box1">
										副标题 :
										<input type="text" name="te7" placeholder="请输入" dir="rtl" class="input input3">
									</div>
								</td>
								<td>
									<div class="td_ri">仅用于公告的推荐显示</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<div class="box5">
										<div class="box_title">简介:</div>
										<textarea placeholder="请输入"></textarea>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="box box1">
										URL别名 :
										<input type="text" name="te7" placeholder="请输入" dir="rtl" class="input input3">
									</div>
								</td>
								<td>
									<div class="box box1">
										排序 :
										<input type="text" name="te7" placeholder="请输入" dir="rtl" class="input input3">
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<div class="box box2">
										引入外链地址 :
										<input type="text" name="te3" placeholder="必填" dir="rtl" class="input input2">
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="box box1">
										分类 :
										<input type="text" name="te8" dir="rtl" placeholder="必填" class="input input4 input_drop" readonly="readonly">
										<button class="xiala" onclick="hk_style()"></button>
										<ul class="drop_1 drop">
											<li>养老保险</li>
											<li>医疗保险</li>
											<li>失业保险</li>
										</ul>
									</div>
								</td>
								<td>
									<div class="box box1">
										状态 :
										<input type="text" name="te8" dir="rtl" placeholder="必填" class="input input4 input_drop" readonly="readonly">
										<button class="xiala"></button>
										<ul class="drop_1 drop">
											<li>养老保险</li>
											<li>医疗保险</li>
											<li>失业保险</li>
										</ul>
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
								<td colspan="2">
									<div class="box5">
										<div class="box_title">贷款SEO自定义标题:</div>
										<textarea placeholder="请输入"></textarea>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<div class="box5">
										<div class="box_title">贷款SEO自定义关键词:</div>
										<textarea placeholder="请输入"></textarea>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<div class="box5">
										<div class="box_title">贷款SEO自定义描述:</div>
										<textarea placeholder="请输入"></textarea>
									</div>
								</td>
							</tr>
						</table>
					</div>
					<div class="clear"></div>
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