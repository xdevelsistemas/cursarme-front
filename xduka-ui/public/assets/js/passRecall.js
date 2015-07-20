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
    };

    var novaSenha = function (dados) {

        if (dados.pw != dados.cp) {
            $('#recallError').attr({'style': 'display: block'});
            $('#recallError').text('Ops! As novas senhas não são as mesmas.');
        } else {
        if (dados.pw.length < 6) {
            $('#recallError').attr({'style': 'display: block'});
            $('#recallError').text('Ops! As novas senhas devem ter no mínimo 6 caracteres.');
        } else {
        if (dados.pw == dados.cp) {
            $('#recallError').attr({'style': 'display: none'});
            $.ajax({
                type: 'POST',
                data: dados,
                url: '/api/resetpassword/' + dados.email + '/' + dados.pw + '/' + dados.token,
                success: function (data) {
                    if (data.msgErro != '') {
                        $('#msgErro').text(data.msgErro);
                        $('#msgErro').text('oi');
                        $('#divMsgSuccess').attr({'style': 'display: none'});
                        $('#divMsgErro').attr({'style': 'display: block'});
                    } else {
                    if (data.msgSuccess != '') {
                        $('#msgSuccess').text(data.msgSuccess);
                        $('#divMsgErro').attr({'style': 'display: none'});
                        $('#divMsgSuccess').attr({'style': 'display: block'});

                        setTimeout(
                            function () {
                                location.href = '/login';
                            }, 3000
                        );
                    }
                    }
                }
            });
        }
        }
        }
    };

    return {
        enviar: enviar,
        isEmail: isEmail,
        novaSenha: novaSenha,
        testandoToken: testandoToken
    }
})(jQuery);