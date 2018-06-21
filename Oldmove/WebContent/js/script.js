$(function(){

	var myDefer = $.Deferred();

	myDefer.resolve();
});

var myPromise = myDefer.promise();

myPromise.then(
	function(){
		$('.firstline').animate({'marginLeft':'200px'});
	});