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
	<link rel="stylesheet" type="text/css" href="../static/css/qianyue_daikuan.css">
	<link rel="stylesheet" href="../static/js/jquery-ui.css">
 	<script type="text/javascript" src="../static/js/jquery-1.12.2.min.js"></script>
 	<script src="../static/js/jquery-ui.js"></script>
 	<script type="text/javascript" src="../static/js/qianyue_daikuan.js"></script>
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
						<div>签约管理</div>
					</a>
				</li>
				<li>
					<a href="#">
						<img src="../static/img/img1/icon3.png">
						<div>贷后管理</div>
					</a>
				</li>
				<li>
					<a href="#">
						<img src="../static/img/img1/icon4.png">
						<div>部门管理</div>
					</a>
				</li>
				<li>
					<a href="#">
						<img src="../static/img/img1/icon5.png">
						<div>人员信息</div>
					</a>
				</li>
			</ul>
		</div>
		<div class="sign">
			<div class="arrow"></div>
			<div class="sign_all">
				<ul class="sign_title">
					<li id="title_bg"><a href="qianyue_daikuan.html">贷款基本信息</a></li>
					<li><a href="qianyue_SEO.html">SEO设置</a></li>
					<li><a href="qianyue_canshu.html">相关参数</a></li>
					<li><a href="qianyue_diyawu.html">抵押物</a></li>
					<li><a href="qianyue_ziliao.html">相关资料</a></li>
					<li><a href="qianyue_xinxi.html">企业信息</a></li>
					<li><a href="qianyue_baozhang.html">保障措施</a></li>
					<li style="border-right: none;"><a href="qianyue_xiangmu.html">项目描述</a></li>
					<div class="clear"></div>
				</ul>
				<table>
					<tr>
						<td>
							<div class="box box1">
								颜色 :
								<input type="text" name="te1" placeholder="不填即为默认颜色" dir="rtl" class="input input1">
							</div>
						</td>
						<td>
							<div class="box box1">
								借款编号 :
								<input type="text" name="te2" placeholder="ERZx20160000124" dir="rtl" class="input input1">
							</div>
						</td>
						<td colspan="2">
							<div class="box box2">
								贷款名称 :
								<input type="text" name="te3" placeholder="必填" dir="rtl" class="input input2">
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<div class="box box2">
								简短名称 :
								<input type="text" name="te4" placeholder="用于邮件，短信的显示，字数不得超过20个字；必填" dir="rtl" class="input input2">
							</div>
						</td>
						<td>
							<div class="box box1">
								会员名称 :
								<input type="text" name="te5" placeholder="必填" dir="rtl" class="input input1">
							</div>
						</td>
						<td>
							<div class="box box1">
								排序 :
								<input type="text" name="te6" placeholder="请输入" dir="rtl" class="input input1">
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="box box1">
								业务档案编号 :
								<input type="text" name="te7" placeholder="请输入" dir="rtl" class="input input3">
							</div>
						</td>
						<td>
							<div class="box box1">
								还款方式 :
								<input type="text" name="te8" dir="rtl" class="input input4 input_drop" readonly="readonly">
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
								所在城市 :
								<input type="text" name="te9" dir="rtl" class="input input4 input_drop" readonly="readonly">
								<button class="xiala"></button>
								<ul class="drop_1 drop">
									<li>养老保险</li>
									<li>医疗保险</li>
									<li>失业保险</li>
								</ul>
							</div>
						</td>
						<td>
							<div class="box box1">
								分类 :
								<input type="text" name="te10" dir="rtl" class="input input4 input_drop" readonly="readonly">
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
						<td>
							<div class="box box1">
								年利率 :
								<input type="text" name="te11" placeholder="必填" dir="rtl" class="input input5">
								<span class="input_ri">％</span>
							</div>
						</td>
						<td>
							<div class="box box1">
								筹标期限 :
								<input type="text" name="te12" placeholder="必填" dir="rtl" class="input input5">
								<span class="input_ri">天</span>
							</div>
						</td>
						<td>
							<div class="box box1">
								贷款缩略图 :
								<a href="javascript:;" class="file">上传图片
									<input type="file" class="select_file input" id="suolue">
								</a>
								<img class="suolue" src="../static/img/img1/03_01.png">
							</div>
						</td>
						<td>
							<div class="box box1">
								借款用途 :
								<input type="text" name="te14" dir="rtl" class="input input4 input_drop" readonly="readonly">
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
							<div class="box box2">
								借款合同范本 :
								<input type="text" name="te15" placeholder="必填" dir="rtl" class="input input7 input_drop" readonly="readonly">
								<button class="xiala"></button>
								<ul class="drop_11 drop">
									<li>养老保险</li>
									<li>医疗保险</li>
									<li>失业保险</li>
								</ul>
							</div>
						</td>
						<td colspan="2">
							<div class="box box2">
								转让合同范本 :
								<input type="text" name="te16" placeholder="必填" dir="rtl" class="input input7 input_drop" readonly="readonly">
								<button class="xiala"></button>
								<ul class="drop_11 drop">
									<li>养老保险</li>
									<li>医疗保险</li>
									<li>失业保险</li>
								</ul>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<div class="box box2">
								借款金额 :
								<input type="text" name="te17" placeholder="必填" dir="rtl" class="input input8">
								<button class="xiala"></button>
								<span class="input_ri input_ri1 input_drop1">人名币</span>
								<ul class="drop_2">
									<li>美元</li>
									<li>日元</li>
									<li>英镑</li>
								</ul>
							</div>
						</td>
						<td colspan="2">
							<div class="box box2">
								借款保证金[第三方托管] :
								<input type="text" name="te18" placeholder="冻结借款人的金额，需要提前存款；必填" dir="rtl" class="input input8">
								<button class="xiala"></button>
								<span class="input_ri input_ri1 input_drop1">人名币</span>
								<ul class="drop_2">
									<li>美元</li>
									<li>日元</li>
									<li>英镑</li>
								</ul>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="box box1">
								投标类型 :
								<input type="text" name="te19" dir="rtl" class="input  input4 input_drop" readonly="readonly">
								<button class="xiala"></button>
								<ul class="drop_1 drop">
									<li>养老保险</li>
									<li>医疗保险</li>
									<li>失业保险</li>
								</ul>
							</div>
						</td>
						<td>
							<div class="box box1">
								最低投标金额 :
								<input type="text" name="te20" dir="rtl" placeholder="必填" class="input input1">
							</div>
						</td>
						<td>
							<div class="box box1">
								最高投资金额 :
								<input type="text" name="te21" dir="rtl" placeholder="0为不限制" class="input input1">
							</div>
						</td>
						<td>
							<div class="box box1">
								借款期限 :
								<input type="text" name="te22" dir="rtl" placeholder="必填" class="input input9">
								<button class="xiala"></button>
								<span class="input_ri input_ri2 input_drop1">月</span>
								<ul class="drop_2">
									<li>天</li>
									<li>月</li>
									<li>年</li>
								</ul>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<div class="box box2">
								可否使用红包 :
								<input type="text" name="te15" placeholder="选 “是” 请将 “最低投标金额” 设置大于红包最大额度" dir="rtl" class="input input7">
								<button class="xiala"></button>
							</div>
						</td>
						<td colspan="2">
							<div class="box box3">
								筹标开始时间 :
								<input type="text" name="te16" placeholder="如有同步：时间只能是当天或者是前一天" dir="rtl" class="input input10 input_drop" readonly="readonly">
								<button class="xiala"></button>
								<ul class="drop_112 drop">
									<li>养老保险</li>
									<li>医疗保险</li>
									<li>失业保险</li>
								</ul>
							</div>
							<button class="qingkong"></button>
						</td>
					</tr>
				</table>
			</div>
			<div class="btn_g">
				<button class="btn btn1" id="add" onclick="addDeal('<%=request.getContextPath()%>')">新增</button>
				<button class="btn btn2" id="chongzhi" onclick="chongzhi()">重置</button>
			</div>
		</div>
		<div class="bottom"></div>
	</div>
	<div class="mask" id="mask"></div>
</body>
</html>