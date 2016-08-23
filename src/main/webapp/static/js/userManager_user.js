$(document).ready(function(){
	$("#datepicker" ).datepicker({
		changeMonth: true,
		changeYear: true
	});
	$("#datepicker1" ).datepicker({
		changeMonth: true,
		changeYear: true
	});
	$("#checkAll").click(function(){
		$('input[name="subBox"]').prop("checked",this.checked);
	});

	$("#dai_detail li").click(function(){
		var str = $(this).children().val();
		$(".list_input2").val(str);
		$("#dai_detail").hide();
	});

	$(".del").on('click',function(){
		var obj = $(this);
		var r = confirm("您确定要删除吗!");
		if (r==true) {
		    obj.parents("tr").remove();
		} else {
		    return;
		}
	});

	$(".delAll").click(function(){
		var obj = $(this);
		var r = confirm("您确定要删除吗!");
		if (r==true) {
		    $("input[name='subBox']:checked").each(function(){
				n = $(this).parents("tr").index();
				$(".table_con").find("tr:eq("+n+")").remove();
			})
		} else {
		    return;
		}
	})
	
	$("#endTime").click(function() {
		alert("1");
	})
	
})

function showDetail(){
	$("#dai_detail").toggle();
}

function tiaozhuan(url){
	var str = $("#page").val();
	var totalPage = $(".page_all span").text();
	
	if (str <= 1) {
		str = 1;
	}
	
	if (str >= totalPage) {
		str = totalPage;
	}
	
	if((/^(\+|-)?\d+$/.test(str)) && str > 0)	{
		location.href = url + "?currentPage=" + str + "&userName=" + $("#userName").val() + "&realName=" + $("#realName").val() + "&mobile=" + $("#mobile").val() + "&refName=" + $("#refName").val() + "&beginTime=" + $(".begin_time").val() + "&endTime=" + $(".end_time").val();
		return true;
	} else {
		alert('请输入正确的数字');
		return false;
	}
}

function goToAddUser(url) {
	window.location.href = url + "/Business/goToAddUser"
}


