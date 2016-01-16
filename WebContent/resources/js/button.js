$(document).ready(function(){
	var value=$('.focus-effect').val().length;
	var placeholder=$('.focus-effect').next();

	if(value>0)
	{
	
		placeholder.children('.input__label-content--chisato').css("display","none");
	}
	$('.focus-effect').blur(function(){
	var boxContent=$(this).next();
	var len=$(this).val().length;
		console.log("in");
		console.log(len);
		if(len>0)
		{
		console.log("cndn");
		boxContent.children('.input__label-content--chisato').css("display","none");
		boxContent.next('.focus-input').css("display","inline-block");
			
			$(this).css("border-color","#fff");
		}
	else{
		boxContent.next('.focus-input').css("display","none");
		boxContent.children('.input__label-content--chisato').css("display","inline-block");
		$(this).css("border-color","#fff");
	}
	});
	$('.focus-effect').focus(function(){
		$(this).css("border-color","#fff");
	});
	/*$('input[type=password]').focus(function(){
		$(this).css("border-color","#1fbad6");
	});*/
});


