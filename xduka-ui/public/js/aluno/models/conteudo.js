define(['./../../common/models/strings'], function (STR) {
    //Conteudo
    return {
        filterPeriodo: {
            label: 'Período',
            placeholder: 'Selecione um período...',
            value: '-1',
            list: [
                {
                    "id": "-1",
                    "text": "Todas os períodos"
                },
                {
                    "id": "1",
                    "text": "Único"
                },
                {
                    "id": "2",
                    "text": "Único dois"
                }
            ]
        },
        filterDisciplina: {
            label: 'Disciplina',
            placeholder: 'Selecione uma disciplina...',
            value: '-1',
            list: [
                {
                    "id": "-1",
                    "text": "Todas as disciplinas"
                },
                {
                    "id": 1,
                    "text": "Ética e Bioética"
                },
                {
                    "id": 2,
                    "text": "Metodologia Científica"
                },
                {
                    "id": 3,
                    "text": "Planejamento em Saúde"
                }
            ]
        },
        disciplina: {
            "nome": "Ética e Bioética",
            conteudo: [
                "* O Conteúdo ainda não foi registrado pelo professor!"
            ]
        }
    };

});