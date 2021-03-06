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
    <h2>modify article</h2>
    <h3>${addMsg }</h3>
    <form action="<%=request.getContextPath()%>/Business/modifyArticleCate" method="get">
        <input type = "hidden" name = "id" value = "${articleCate.id }"/>
        <input type = "text" name = "title" value = "${articleCate.title }"/>
        <input type = "text" name = "brief" value = "${articleCate.brief }"/>
        <input type = "submit" value = "modify"/>
    </form>
</body>
</html>
 -->
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../static/css/qianduan_list.css">
	<link rel="stylesheet" href="../static/js/jquery-ui.css">
 	<script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
 	<script src="../static/js/jquery-ui.js"></script>
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
					<a href="index">
						<img src="../static/img/img1/icon2.png">
						<div>会员管理</div>
					</a>
				</li>
				<li>
					<a href="showAllGoods">
						<img src="../static/img/img1/icon3.png">
						<div>积分商城</div>
					</a>
				</li>
				<li class="bg">
					<a href="showAllArticle">
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
					<li><a href="<%=url%>/Business/showAllArticle">文章列表</a></li>
					<li id="title_bg"><a href="<%=url%>/Business/showAllArticleCate">文章分类</a></li>
					<li style="border-right: none;"><a href="<%=url%>/Business/showAllAdv">前端广告管理</a></li>
					<div class="clear"></div>
				</ul>
			</div>
			<div class="table_top">新增文章</div>
			<div class="hongbao_info">
				<div class="box box2">
					分类名称 :
					<input type="text" value = "${articleCate.title }" name="title" placeholder="必填" dir="rtl" class="input input23">
				</div>
				<div class="box5">
					<div class="box_title">消息内容:</div>
					<textarea placeholder="${articleCate.brief }"></textarea>
				</div>
				<div class="box4">
					<div class="box box3" style="float: left;margin-right: 30px;">
						分类 :
						<input type="text" name="txt5" dir="rtl" class="input input4 input_drop" readonly="readonly">	
						<button class="xiala"></button>
						<ul class="drop_1 drop">
							<li>养老保险</li>
							<li>医疗保险</li>
							<li>失业保险</li>
						</ul>
					</div>
					<div class="box box3" style="float: left;">
						文章类型 :
						<input type="text" name="txt5" dir="rtl" class="input input4 input_drop" readonly="readonly">	
						<button class="xiala"></button>
						<ul class="drop_1 drop">
							<li>养老保险</li>
							<li>医疗保险</li>
							<li>失业保险</li>
						</ul>
					</div>	
					<div class="clear"></div>
				</div>
				<div class="box4">
					<div class="box box3" style="float: left;margin-right: 30px;">
						排序 :
						<input type="text" name="sort" dir="rtl" placeholder="${articleCate.sort }" class="input input3">	
					</div>
					<div class="box box3" style="float: left;">
						状态 :
						<input type="text"  value = "${articleCate.isEffect == 0 ? '无效' : '有效' }" name="isEffect" dir="rtl" class="input input4 input_drop" readonly="readonly">	
						<button class="xiala"></button>
						<ul class="drop_1 drop">
							<li>养老保险</li>
							<li>医疗保险</li>
							<li>失业保险</li>
						</ul>
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