$('.nav-toggle').click(function(){
	$('.nav-display-box').slideToggle();
})

$('.article .fade button').click(function(){
	$(this).parents('.fade').fadeOut(1000);
})

function shou(obj){
	$(this).siblings('.more').show();
	$(this).hide();
	$(obj).slideToggle();
}
$('.hot-art .close').click(function(){
//	$(this).parents('.border').fadeOut(1000);
	$(this).parents('.border').slideUp();
})
$(function () {
    $('main').css({'margin-top' : $('header').height() + 'px'});
})


            $('#to-top').click(function () {
                $('html,body').animate({
                    scrollTop : 0
                },1000)
            })
            var fix_nav = function () {
                var scrollTop = $(window).scrollTop();
                if(scrollTop > 0){
                    $('#to-top').css('display','block');
                }else{
                    $('#to-top').css('display','none');
                }
            }
            $(window).scroll(function () {
                fix_nav();
            })