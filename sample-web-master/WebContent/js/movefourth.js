var startflg=true;
var i=0;


$(function(){
	$(document).on(function(){
		for(i=0;i<20 && startflg;i++){
			$("img.startmessage").fadeIn(0);
			$("img.startmessage").animate({"top":"+=0px"},{'duration':1500});
			$("img.startmessage").fadeOut(0);
			$("img.startmessage").animate({"top":"+=0px"},{'duration':500});
		};
	});
	$("body").off('click');

	});
	$("body").click(function(){
		startflg=false;
		i=20;
	});
	$("body").click(function(){
		$("img.startmessage").fadeOut(0);
		$(".firstbox").fadeIn(10);
		$("img.nextfirstbox").fadeIn(10);
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px","left":"-=90px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});
		$(".firstbox").animate({"top":"+=60px"},{'duration':250});

		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.firstbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},750);
		setTimeout(function(){
			$("img.nextfirstbox").fadeOut(0);
			$(".secondbox").fadeIn(10);
			$("img.nextsecondbox").fadeIn(10);
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px","left":"-=90px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px","left":"-=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
			$(".secondbox").animate({"top":"+=60px"},{'duration':250});
		},2000);

		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.secondbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},2200);

		setTimeout(function(){
			$(".thirdbox").fadeIn(10);
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px","left":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px","left":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=60px"},{'duration':250});
			$(".thirdbox").animate({"top":"+=90px"},{'duration':375});
		},4000);
		setTimeout(function(){
			$({deg:0}).animate({deg:180}, {
				duration:500,
//			 途中経過
			 progress:function() {
				$('.thirdbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},4500);

		setTimeout(function(){
			$("img.nextsecondbox").fadeOut(10);
			$(".fourthbox").fadeIn(10);
			$("img.nextthirdbox").fadeIn(10);
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px","left":"+=90px"},{'duration':375});
			$(".fourthbox").animate({"top":"+=60px","left":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fourthbox").animate({"top":"+=60px"},{'duration':250});
		},6000);
		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.fourthbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},6500);

		setTimeout(function(){
			$("img.nextthirdbox").fadeOut(10);
			$(".fifthbox").fadeIn(10);
			$("img.nextfourthbox").fadeIn(10);
			$(".fifthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=60px","left":"-=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=60px","left":"-=60px"},{'duration':250});
			$(".fifthbox").animate({"top":"+=90px"},{'duration':375});
		},8250);

		setTimeout(function(){
			$("img.nextfourthbox").fadeOut(10);
			$(".sixthbox").fadeIn(10);
			$("img.nextfifthbox").fadeIn(10);
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px","left":"+=90px"},{'duration':375});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
			$(".sixthbox").animate({"top":"+=60px"},{'duration':250});
		},10000);
		setTimeout(function(){
			$({deg:0}).animate({deg:-90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.sixthbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},10500);

		setTimeout(function(){
			$("img.nextfifthbox").fadeOut(10);
			$(".seventhbox").fadeIn(10);
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
			$(".seventhbox").animate({"top":"+=60px"},{'duration':250});
		},12000);
		setTimeout(function(){
			$({deg:0}).animate({deg:90}, {
				duration:250,
//			 途中経過
			 progress:function() {
				$('.seventhbox').css({
					transform:'rotate(' + this.deg + 'deg)'
				});
			},
			});
		},12500);

		setTimeout(function(){
			$("img.logo").fadeIn(10);
			$(".scorepoint").fadeIn(10);
			$(".scorepoint").animate({position:"absolute",bottom:"280px"},{'duration':1000});
			$(".scorebox").text("1000");
			$(".firstbox").fadeOut(10);
			$(".secondbox").fadeOut(10);
			$(".thirdbox").fadeOut(10);
			$(".fourthbox").fadeOut(10);
			$(".fifthbox").fadeOut(10);
			$(".sixthbox").fadeOut(10);
			$(".seventhbox").fadeOut(10);
		},14000);

		setTimeout(function(){
			$(".firstbox").fadeIn(10);
			$(".secondbox").fadeIn(10);
			$(".thirdbox").fadeIn(10);
			$(".fourthbox").fadeIn(10);
			$(".fifthbox").fadeIn(10);
			$(".sixthbox").fadeIn(10);
			$(".seventhbox").fadeIn(10);
		},14050);

		setTimeout(function(){
			$(".firstbox").fadeOut(10);
			$(".secondbox").fadeOut(10);
			$(".thirdbox").fadeOut(10);
			$(".fourthbox").fadeOut(10);
			$(".fifthbox").fadeOut(10);
			$(".sixthbox").fadeOut(10);
			$(".seventhbox").fadeOut(10);
		},14550);

		setTimeout(function(){
			$(".firstbox").fadeIn(10);
			$(".secondbox").fadeIn(10);
			$(".thirdbox").fadeIn(10);
			$(".fourthbox").fadeIn(10);
			$(".fifthbox").fadeIn(10);
			$(".sixthbox").fadeIn(10);
			$(".seventhbox").fadeIn(10);
		},14600);

		setTimeout(function(){
			$("img.logo").fadeIn(10);
			$(".firstbox").fadeOut(10);
			$(".secondbox").fadeOut(10);
			$(".thirdbox").fadeOut(10);
			$(".fourthbox").fadeOut(10);
			$(".fifthbox").fadeOut(10);
			$(".sixthbox").fadeOut(10);
			$(".seventhbox").fadeOut(10);
		},14650);

		setTimeout(function(){
			$(".scorepoint").fadeOut(10);
		},15000);

		setTimeout(function(){
			$(".nextbox").fadeOut(200);
			$(".scorebox").fadeOut(200);
			$(".retrisbox").css({borderLeftColor:"black",borderTopColor:"black",borderBottomColor:"black",borderRightColor:"black"});

		},15100);

		setTimeout(function(){
			$(".retrisbox").animate({"width":"842px",position:"absolute",left:"120px"},{'duration':500});
			$("img.logo").animate({"width":"630px","height":"440px"},{'duration':500});
		},15500);
	});
});