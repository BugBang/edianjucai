$(document).ready(function(){
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
})

function tiaozhuan(){
	var str = $("#page").val();  
	if((/^(\+|-)?\d+$/.test(str)) && str > 0)	{
		return true;
	} else {
		alert('请输入正确的数字');
		return false;
	}
}


