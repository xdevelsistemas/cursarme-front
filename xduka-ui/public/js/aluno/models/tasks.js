define(['./../../common/models/strings'], function (STR) {
    //Tasks
    return {
        filter: {
            label: STR.FILTER,
            placeholder: STR.FILTER_BY_SUBJECT,
            value: '-1',
            list: [
                {
                    "id": "-1",
                    "text": "Todas as disciplinas"
                },
                {
                    "id": "1",
                    "text": "Patologias Ocupacionais, Métodos Diagnósticos e T. das Doenças do Trab."
                },
                {
                    "id": "2",
                    "text": "Doenças do Trab. Avançada"
                }
            ]
        },
        "tasks": [
            {
                "id": "1",
                "subject": "Patologias Ocupacionais, Métodos Diagnósticos e T. das Doenças do Trab.",
                "teacher": "Camila Máira",
                "about": "Atividade Obrigatória",
                "begin": "24/04/2013",
                "end": "25/05/2013",
                "attachment": "Download\\20130525-144704-8529Ativ_Obrigatoria_-.doc"
            },
            {
                "id": "2",
                "subject": "Doenças do Trab. Avançada",
                "teacher": "Camila Máira",
                "about": "Atividade Obrigatória",
                "begin": "24/04/2013",
                "end": "25/05/2013",
                "attachment": "Download\\20130525-144704-8529Ativ_Obrigatoria_-.doc"
            },
            {
                "id": "1",
                "subject": "Patologias Ocupacionais, Métodos Diagnósticos e T. das Doenças do Trab.",
                "teacher": "Camila Máira",
                "about": "Atividade Obrigatória",
                "begin": "24/04/2013",
                "end": "25/05/2013",
                "attachment": "Download\\20130525-144704-8529Ativ_Obrigatoria_-.doc"
            }
        ]
    };

});