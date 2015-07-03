$.passRecall = (function($){
    'use strict';

    var isEmail = function(email){
        return /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i.test(email)
    };
    var feedbackCollapse = function(){
        $('html, body').animate({
            scrollTop: $('#recallSucess').offset().top
        }, 2000);
    };
    var enviar = function(email){
        if (isEmail(email)){
            $('#recallError').attr({'style': 'display: none'});
            $('#recallSucess').attr({'style': 'display: block'});
            //$('#recallEmail404').attr({'style': 'display: block'});
            $('#esqueceuSenha').modal('toggle');
            feedbackCollapse();
        }else{
            $('#recallError').attr({'style': 'display: block'});
        }
    };
    return {
        isEmail: isEmail,
        enviar: enviar
    }
})(jQuery);