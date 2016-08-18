$(document).ready(function(){
	$("#checkAll").click(function(){
		$('input[name="subBox"]').prop("checked",this.checked);
	});

	// $(".save").click(function(){
	// 	$(this).parents().parents().children('td').attr("readonly","readonly");
	// 	$(this).parents().parents().children('td').css('border','none');
	// 	$(this).css('display','none');
	// })
})

function tianjia(){
	var str="<tr><td><input type=\"checkbox\" name=\"subBox\" class=\"check1\">"+
              "</td><td><input type=\"text\" name=\"ziliao_1\" class=\"ziliao_2\">"+
              "</td><td><input type=\"text\" name=\"ziliao_2\" class=\"ziliao_2\">"+
              "</td><td><input type=\"text\" name=\"ziliao_3\" class=\"ziliao_2\">"+
              "</td><td><input type=\"text\" name=\"ziliao_4\" class=\"ziliao_2\">"+
              "</td><td><input type=\"text\" name=\"ziliao_5\" class=\"ziliao_2\">"+
              "</td><td><input type=\"text\" name=\"ziliao_6\" class=\"ziliao_2\">"+
              "</td><td><button class=\"save\" onclick=\"save()\">保存</button></td></tr>";
	$("#table_con").append(str);
}

function bianji(){
	$(".ziliao_1").removeAttr("readonly");
	$(".ziliao_1").css('border','1px solid #dddddd');
}

// function save(e){
// 	$(".ziliao_2").attr("readonly","readonly");
// 	$(".ziliao_2").css('border','none');
// 	$(".save").css('display','none');
// }

function shanchu(){
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
}

