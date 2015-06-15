define(['jquery'], function ($) {
    function ext(parent, child) {
        return $.extend(true, child, parent);
    }

    var Form = {};

    Form.Node = {
        "label": "",
        "name": "",
        "type": 'node',
        "children": [] // a list of inputs
    };

    Form.Input = ext(Form.Node, {
        "type": 'input',
        "value": "",
        "placeholder": "",
        "tooltip": "",
        "required": false, // boolean
        "hidden": false // boolean
    });

    Form.Str = ext(Form.Input, {
        "type": 'str',
        "min": "",
        "max": ""
    });

    Form.Name = ext(Form.Str, {
        "type": 'name'
    });

    Form.Email = ext(Form.Str, {
        "type": 'email'
    });

    Form.Phone = ext(Form.Str, {
        "type": 'phone'
    });

    Form.Int = ext(Form.Str, {
        "type": 'int'
    });

    Form.Float = ext(Form.Str, {
        "type": 'float',
        "decimals": "2"
    });

    Form.Money = ext(Form.Str, {
        "type": 'money',
        "prefix": "", // R$ | U$
        "decimal": "", // , | .
        "thousands": "" // , | .
    });

    Form.Date = ext(Form.Str, {
        "type": 'date',
        "after": "", // boolean
        "before": "" // boolean
    });

    Form.DateTime = ext(Form.Date, {
        "type": 'datetime'
    });

    Form.Select = ext(Form.Input, {
        "type": 'select',
        "list": [
            {
                "id": "",
                "text": ""
            }
        ]
    });

    Form.Select2 = ext(Form.Select, {
        "type": 'select2',
        "search": "" //boolean
    });

    return Form;
});