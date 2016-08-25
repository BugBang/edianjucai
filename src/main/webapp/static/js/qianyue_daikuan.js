$(document).ready(function(){
	$("#suolue").change(function(event) {
    	var files = event.target.files, file;        
    	if (files && files.length > 0) {
      		file = files[0];
          console.log(file);
      		if(file.size > 1024 * 1024 * 3) {
               	alert('图片大小不能超过 3MB!');
                return false;
          }
         	var URL = window.URL || window.webkitURL;
          var imgURL = URL.createObjectURL(file);
          $(".suolue").attr('src', imgURL);
    	}
	   });
      $(".input_drop").click(function(){
        $(this).next().next().show();
        showMask();
      }); 

       $(".input_drop1").click(function(){
        $(this).next().show();
        showMask();
      }); 

      $(".drop li").click(function(){
        var str = $(this).html();
        $('.drop').hide();
        $(this).parents().siblings().val(str);
        $("#mask").hide();  
      });

      $(".drop_2 li").click(function(){
        var str = $(this).html();
        $('.drop_2').hide();
        $(this).parent().parent().find(".input_drop1").text(str);
        $("#mask").hide();  
      });
})

function chongzhi(){
	var r = confirm("您确定要重置吗!");
	if (r==true) {
	    return;
	} else {
	    return;
	}	
}

function addDeal(url){
	window.location.href = url + "/Business/addDeal"
}

function showMask(){
      $("#mask").css("width",$(document).width());
      $("#mask").css("height",$(document).height());
      $("#mask").show();  
    }

