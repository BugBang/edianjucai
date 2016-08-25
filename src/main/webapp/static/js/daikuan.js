$(document).ready(function(){
	$("#datepicker" ).datepicker();
	$("#datepicker1" ).datepicker();
	$("#checkAll").click(function(){
		$('input[name="subBox"]').prop("checked",this.checked);
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

function tiaozhuan(url){
	var str = $("#page").val();
	var totalPage = $(".page_all span").text();
	
	if (parseInt(str) <= 1) {
		str = 1;
	}
	
	if (parseInt(str) >= parseInt(totalPage)) {
		str = totalPage;
	}
	
	if((/^(\+|-)?\d+$/.test(str)) && str > 0)	{
		location.href = url + "?currentPage=" + str + "&name=" + $("#name").val() + "&userName=" + $("#userName").val() + "&loantype=" + $("#loantype").val() +"&cateId=" + $("#cateId").val() + "&dealStatus=" + $("#dealStatus").val();
		return true;
	} else {
		alert('请输入正确的数字');
		return false;
	}
}

function showMask(){
      $("#mask").css("width",$(document).width());
      $("#mask").css("height",$(document).height());
      $("#mask").show();  
    }

function addDaikuan(url){
	window.location.href = url + "/Business/goToAddDeal";
}
