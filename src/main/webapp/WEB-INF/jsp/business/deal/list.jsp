<%@page import="com.edianjucai.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<!-- 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>${admin.replayName}</h1>
    <h2>show Deals</h2>
    <c:forEach var="dealCate" items="${dealCates}" varStatus="count">  
         <tr>  
            <td>${dealCate.id }</td>
            <td>${dealCate.name }</td>
        </tr>  
    </c:forEach>  
    <c:forEach var="deal" items="${deals}" varStatus="count">  
         <tr>  
            <td>${deal.id }</td>
            <td>${deal.name }</td>
        </tr>  
    </c:forEach>  
</body>
</html>
 -->
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../static/css/daikuan.css">
	<link rel="stylesheet" href="../static/js/jquery-ui.css">
 	<script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
 	<script src="../static/js/jquery-ui.js"></script>
 	<script type="text/javascript" src="../static/js/daikuan.js"></script>
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
				<li class="bg">
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
				<li>
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
				<div class="title_bg">新增客户信息</div>
			</div>
			<div class="list_top">
			<form action="<%=url%>/Business/showAllDeal" method="get">
				<div class="list_top1">
					<input type="text" placeholder="请输入贷款名称" value="${pagination.name }" id="name" name="name" class="list_input1">
					<input type="text" placeholder="请输入贷款人" value="${pagination.userName }" id="userName" name="userName" class="list_input1">	
				</div>
				<div class="list_top1" style="margin-right: 20px;">
					<input type="text" placeholder="还款方式" value="${pagination.loantype }" id="loantype" name="loantype" class="list_input2 input_drop" readonly="readonly">
					<button class="list_btn2" onclick="showDetail()"></button>
					<ul class="drop_1 drop">
						<li>住房贷款</li>
						<li>养老贷款</li>
						<li>失业贷款</li>
					</ul>
				</div>
				<div class="list_top1" style="margin-right: 20px;">
					<input type="text" placeholder="分类" value="${pagination.cateId }" id="cateId" name="cateId" class="list_input2 input_drop" readonly="readonly">
					<button class="list_btn2" onclick="showDetail()"></button>
					<ul class="drop_1 drop">
						<li>住房贷款</li>
						<li>养老贷款</li>
						<li>失业贷款</li>
					</ul>
				</div>
				<div class="list_top1" style="margin-right: 20px;">
					<input type="text" placeholder="贷款状态" value="${pagination.dealStatus }" id="dealStatus" name="dealStatus" class="list_input2 input_drop" readonly="readonly">
					<button class="list_btn2" onclick="showDetail()"></button>
					<ul class="drop_1 drop">
						<li>住房贷款</li>
						<li>养老贷款</li>
						<li>失业贷款</li>
					</ul>
				</div>
				<div class="btn_g">
					<input class="btn btn1" value="查询" type = "submit"/>
					<button class="btn btn2" type="button" onclick="addDaikuan('<%=request.getContextPath()%>')">新增</button>
				</div>
				<div class="clear"></div>
				</form>
			</div>
			<div class="list_con">
				<table class="table_con" cellspacing="0">
					<tr class="tr_1">
						<th class="check_t"><input type="checkbox" class="check1" id="checkAll">编号</th>
						<th>贷款名称</th>
						<th>借款人</th>
						<th>利率(％)</th>
						<th>贷款金额</th>
						<th>期数</th>
						<th>还款方式</th>
						<th>投标状态</th>
						<th>放款</th>
						<th>流标返回</th>
						<th>投标数</th>
						<th>推荐</th>
						<th>同步到第三方</th>
						<th>预告</th>
						<th>新手享</th>
						<th>状态</th>
						<th>隐藏</th>
						<th>推荐管理员</th>
						<th>排序</th>
						<th><span class="delAll">删除选中</span></th>
					</tr>
					
					
					<c:forEach var="dealMappingMsg" items="${mappingMsgs}" varStatus="count">
                    <tr>
                        <td id="td_1"><input type="checkbox" name="subBox" class="check1">${dealMappingMsg.deal.id }</td>
                        <td>${dealMappingMsg.deal.name }</td>
                        <td>${dealMappingMsg.user.userName}</td>
                        <td>${dealMappingMsg.deal.rate }</td>
                        <td>${dealMappingMsg.deal.borrowAmount }</td>
                        <td>${dealMappingMsg.deal.repayTime }</td>
                        <td>${dealMappingMsg.loadtype }</td>
                      	<td>${dealMappingMsg.dealStatus }</td>
                        <td>${dealMappingMsg.isHasLoans }</td>
                        <td>${dealMappingMsg.isHasReceived }</td>
                        <td>${dealMappingMsg.deal.loadMoney }</td>
                        <td>${dealMappingMsg.isRecommend }</td>
                      	<td>${dealMappingMsg.deal.name }</td>
                        <td>${dealMappingMsg.isAdvance }</td>
                        <td>${dealMappingMsg.isNew }</td>
                        <td>${dealMappingMsg.isEffect }</td>
                        <td>${dealMappingMsg.isHidden }</td>
                      	<td> </td>
                        <td>${dealMappingMsg.deal.sort }</td>	
                        <td align="center" class="td_r">
                            <a href="<%=url%>/Business/goToModifyDeal?id=${dealMappingMsg.deal.id}" class="shenhe">操作</a>&nbsp;&nbsp;
                            <span class="del">删除</span>
                        </td>
                    </tr>
                  </c:forEach>
					
					
				</table>
			</div>
			<div class="list_bottom">
				<a href="<%=url%>/Business/showAllDeal?currentPage=1&name=${pagination.name }&userName=${pagination.userName }&loantype=${pagination.loantype }&cateId=${pagination.cateId }&dealStatus=${pagination.dealStatus }" class="a_0 a_1"></a>
				<c:if test="${pagination.currentPage <= 1 }">
                    <a href="<%=url%>/Business/showAllDeal?currentPage=1&name=${pagination.name }&userName=${pagination.userName }&loantype=${pagination.loantype }&cateId=${pagination.cateId }&dealStatus=${pagination.dealStatus }" class="a_0 a_2"></a>
                </c:if>
                <c:if test="${pagination.currentPage > 1 }">
                    <a href="<%=url%>/Business/showAllDeal?currentPage=${(pagination.currentPage - 1)}&name=${pagination.name }&userName=${pagination.userName }&loantype=${pagination.loantype }&cateId=${pagination.cateId }&dealStatus=${pagination.dealStatus }" class="a_0 a_2"></a>
                </c:if>
				<div class="page_1">第<input type="text" value="${pagination.currentPage }" class="page_inp page_inp1">页</div>
				<c:if test="${pagination.currentPage >= pagination.totalPage}">
                    <a href="<%=url%>/Business/showAllDeal?currentPage=${(pagination.totalPage)}&name=${pagination.name }&userName=${pagination.userName }&loantype=${pagination.loantype }&cateId=${pagination.cateId }&dealStatus=${pagination.dealStatus }" class="a_0 a_3"></a>
                </c:if>
                <c:if test="${pagination.currentPage < pagination.totalPage}">
                    <a href="<%=url%>/Business/showAllDeal?currentPage=${(pagination.currentPage + 1)}&name=${pagination.name }&userName=${pagination.userName }&loantype=${pagination.loantype }&cateId=${pagination.cateId }&dealStatus=${pagination.dealStatus }" class="a_0 a_3"></a>
                </c:if>
				<a href="<%=url%>/Business/showAllDeal?currentPage=${pagination.totalPage }&name=${pagination.name }&userName=${pagination.userName }&loantype=${pagination.loantype }&cateId=${pagination.cateId }&dealStatus=${pagination.dealStatus }" class="a_0 a_4"></a>
				<div class="page_all">共<span>${pagination.totalPage }</span>页</div>
                <div class="page_fo">到<input type="text" value="${pagination.currentPage }" class="page_f" id="page">页</div>
				<input type="button" value="GO" class="page_inp" onclick="tiaozhuan('<%=url%>/Business/showAllDeal')"/>
			</div>
		</div>
		<div class="bottom"></div>
	</div>
</body>
</html>