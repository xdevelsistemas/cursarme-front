$.passRecall = (function($){
    'use strict';

    var isEmail = function(email){
        return /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i.test(email)
    };
    /*var feedbackCollapse = function(){
        $('html, body').animate({
            scrollTop: $('#recallSucess').offset().top
        }, 2000);
    };*/
    var enviar = function(email){
        if (isEmail(email)){
            //('/api/resetpassword/:email', {"email": email});
            //location.href="/api/resetpassword/" + email;

            $.ajax({
                    type: 'POST',
                    data: email,
                    url: '/api/resetpassword/' + email,
                    success: function(data) {
                        if (data.msgErro) {
                            $('#msgAlert').attr({'style': 'display: none'});
                            $('#msgErro').text(data.msgErro).attr({'style': 'display: block'});
                        } else {
                            if (data.msgSuccess) {
                                $('#msgAlert').attr({'style': 'display: none'});
                                $('#msgSuccess').text(data.msgSuccess).attr({'style': 'display: block'});
                            }
                        }
                    }
                }

            );

            $('#recallError').attr({'style': 'display: none'});
            //$('#recallSucess').attr({'style': 'display: block'});
            //$('#recallEmail404').attr({'style': 'display: block'});
            $('#esqueceuSenha').modal('toggle');
            //feedbackCollapse();
        }else{
            $('#recallError').attr({'style': 'display: block'});
        }
    };

    var testandoToken = function (token) {
        location.href="/resetarsenha/" + token;
        /*$.ajax({
            type: 'GET',
            data: id,
            url: '/api/resetpassword/' + id,
            success: function(data) {
                location.href = '/resetarsenha/' + data;
            }
        });*/
    };

    var novaSenha = function (dados) {
        /*$.ajax({
            type: 'POST',
            data: dados,
            url: '/api/resetpassword/' + dados.email + '/' + dados.password + '/' + dados.token,
            success: function(data) {
                location.href = '/resetarsenha/' + data;
            }
         });*/
        console.log(dados);
    };

    return {
        enviar: enviar,
        isEmail: isEmail,
        novaSenha: novaSenha,
        testandoToken: testandoToken
    }
})(jQuery);