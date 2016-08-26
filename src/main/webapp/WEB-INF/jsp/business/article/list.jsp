<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--  <!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}</h1>
    <h2>show articles</h2>
    <c:forEach var="article" items="${articles}" varStatus="count">  
         <tr>  
            <td>${user.id }</td>
            <td>${article.content }</td>
        </tr>  
    </c:forEach>  
</body>
</html>
-->

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../static/css/qianduan_fenleilist.css">
	<link rel="stylesheet" href="../static/js/jquery-ui.css">
 	<script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
 	<script src="../static/js/jquery-ui.js"></script>
 	<script type="text/javascript" src="../static/js/qianduan_fenleilist.js"></script>
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
					<a href="<%=url%>/Business/index">
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
			</div>
			<div class="list_top">
				<form action="<%=url%>/Business/showAllArticle">
				<div class="list_top1">
					<input type="text" placeholder="请输入名称" value="${pagination.title }" id="title" name="title" class="list_input1" id="name">
				</div>

				<input class="btn btn1" value="搜索" type = "submit">
				<button class="btn btn1" type="button" onclick="addArticle('<%=request.getContextPath()%>')">新增</button>
				<button class="btn btn2">删除</button>
				</form>
			</div>
			
			<div class="list_con">
				<table class="table_con" cellspacing="0">
					<tr class="tr_1">
						<th class="check_t"><input type="checkbox" class="check1" id="checkAll">编号</th>
						<th>文章标题</th>
						<th>分类</th>
						<th>状态</th>
						<th>创建时间</th>
						<th>更新时间</th>
						<th>排序</th>
						<th>点击数</th>
						<th width="5%;"></th>
					</tr>
					
					<c:forEach var="articles" items="${articles}" varStatus="count">
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1">${articles.id }</td>
                        <td>${articles.title }</td>
                        <td>${articles.cateId }</td>
                        <td>${articles.isEffect == 0 ? '无效' : '有效'}</td>
                        <td>${articles.createTime }</td>
                        <td>${articles.updateTime }</td>
                        <td>${articles.sort }</td>
                        <td>${articles.clickCount }</td>
                        <td align="center" class="td_r">
                            <a href="<%=url%>/Business/goToModifyArticle?id=${articles.id}" class="shenhe">操作</a>
                        </td>
                    </tr>
                  </c:forEach>
				</table>
			</div>
			<div class="list_bottom">
				<a href="<%=url%>/Business/showAllArticle?currentPage=1&title=${pagination.title }" class="a_0 a_1"></a>
				<c:if test="${pagination.currentPage <= 1 }">
                    <a href="<%=url%>/Business/showAllArticle?currentPage=1&title=${pagination.title }" class="a_0 a_2"></a>
                </c:if>
                <c:if test="${pagination.currentPage > 1 }">
                    <a href="<%=url%>/Business/showAllArticle?currentPage=${(pagination.currentPage - 1)}&title=${pagination.title }" class="a_0 a_2"></a>
                </c:if>
				<div class="page_1">第<input type="text" value="${pagination.currentPage }" class="page_inp page_inp1">页</div>
				 <c:if test="${pagination.currentPage >= pagination.totalPage}">
                    <a href="<%=url%>/Business/showAllArticle?currentPage=${(pagination.totalPage)}&title=${pagination.title }" class="a_0 a_3"></a>
                </c:if>
				<c:if test="${pagination.currentPage < pagination.totalPage}">
                    <a href="<%=url%>/Business/showAllArticle?currentPage=${(pagination.currentPage + 1)}&title=${pagination.title }" class="a_0 a_3"></a>
                </c:if>
                <a href="<%=url%>/Business/showAllArticle?currentPage=${pagination.totalPage }&title=${pagination.title }" class="a_0 a_4"></a>
     			<div class="page_all">共<span>${pagination.totalPage }</span>页</div>
                <div class="page_fo">到<input type="text" value="${pagination.currentPage }" class="page_f" id="page">页</div>
				<input type="button" value="GO" class="page_inp" onclick="tiaozhuan('<%=url%>/Business/showAllArticle')">
			</div>
		</div>
		<div class="bottom"></div>
	</div>
</body>
</html>