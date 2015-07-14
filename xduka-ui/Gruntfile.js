module.exports = function(grunt) {
    'use strict';

    grunt.initConfig({
        clean: {
            dist: {
                src: 'public/dist'
            }
        },
        cssmin: {
            bundle: {
                options: {
                    banner: '/* xDuka | xDevel Sistemas */'
                },
                files: {
                    'public/dist/assets/css/bundle_common.css': [
                        'public/assets/css/custom.css',
                        'public/assets/css/font-icons/entypo/css/entypo.css',
                        'public/assets/css/neon.css',
                        'public/assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css',
                        'public/assets/neon/vertical-timeline/css/component.css',
                        'public/assets/xduka/css/skin.css',
                        'public/lib/angular-ui-select/dist/select.css',
                        'public/lib/select2/select2.css',
                        'public/lib/select2/select2-bootstrap.css'
                    ],
                    'public/dist/assets/css/bundle_aluno.css': [
                        'public/assets/css/ng-img-crop-custom.css'
                    ],
                    'public/dist/assets/css/bundle_secretaria.css': [
                        'public/lib/c3/c3.min.css',
                        'public/lib/datatables/media/css/jquery.dataTables.min.css',
                        'public/lib/jquery-ui/themes/base/jquery-ui.css'
                    ],
                    'public/dist/assets/css/bundle_comercial.css': [
                        'public/lib/jquery-ui/themes/base/jquery-ui.css',
                        'public/lib/datatables/media/css/jquery.dataTables.min.css'
                    ]
                }
            }
        },
        uglify: {
            options: {
                compress: true
            },
            bundle_common: {
                src: [
                    'public/lib/jquery/dist/jquery.js',
                    // Dependentes do JQuery
                    'public/lib/angular/angular.js',
                    'public/lib/jquery-ui/jquery-ui.js',
                    'public/lib/jquery-maskedinput/dist/jquery.maskedinput.js',
                    'public/lib/bootstrap/dist/js/bootstrap.js',
                    'public/assets/neon/js/gsap/main-gsap.js',
                    'public/assets/neon/js/resizeable.js',
                    'public/assets/neon/js/joinable.js',
                    'public/assets/js/jquery.mask.min.js',
                    // Dependentes do Angular
                    'public/lib/angular-input-masks/angular-input-masks.br.js',
                    'public/lib/angular-sanitize/angular-sanitize.js',
                    'public/lib/angular-route/angular-route.js',
                    'public/lib/angular-ui-utils/ui-utils.js',
                    'public/lib/ngImgCrop/compile/unminified/ng-img-crop.js',
                    // Outros
                    'public/lib/angular-resource/angular-resource.js',
                    'public/lib/angular-ui-select/dist/select.js',
                    'public/lib/angular-bootstrap/ui-bootstrap-tpls.js',
                    'public/lib/underscore/underscore.js',
                    // SCRIPTS COMMON
                    // Models
                    'public/js/common/models/__module__.js',
                    'public/js/common/models/strings.js',
                    'public/js/common/models/user.js',
                    // Filters
                    'public/js/common/filters/__module__.js',
                    'public/js/common/filters/props-filter.js',
                    'public/js/common/filters/range.js',
                    // Services
                    'public/js/common/services/__module__.js',
                    'public/js/common/services/bread-crumb.js',
                    'public/js/common/services/tipoTelefone.js',
                    'public/js/common/services/version.js',
                    // Directives
                    'public/js/common/directives/__module__.js',
                    'public/js/common/directives/xd-btn.js',
                    'public/js/common/directives/xd-input.js',
                    'public/js/common/directives/xd-input-date.js',
                    'public/js/common/directives/xd-input-email.js',
                    'public/js/common/directives/xd-input-money.js',
                    'public/js/common/directives/xd-input-percent.js',
                    'public/js/common/directives/xd-input-textarea.js',
                    'public/js/common/directives/xd-panel-collapse.js',
                    'public/js/common/directives/xd-select.js',
                    'public/js/common/directives/xd-modal.js',
                    'public/js/common/directives/xd-table-pre-cadastro.js',
                    'public/js/common/directives/xd-grid.js',
                    'public/js/common/directives/xd-line-chart.js',
                    'public/js/common/directives/xd-input-checks.js',
                    // TABLES
                    'public/assets/js/raphael-min.js',
                    'public/assets/js/morris.min.js',
                    'public/lib/angular-ui-grid/ui-grid.min.js',
                    'public/lib/datatables/media/js/jquery.dataTables.min.js',
                    'public/lib/d3/d3.min.js',
                    'public/lib/c3/c3.min.js',
                    'public/lib/c3-angular/c3-angular.min.js',
                    'public/assets/js/neon-api.js',
                    'public/assets/js/neon-chat.js',
                    'public/assets/js/neon-custom.js',
                    'public/assets/js/neon-demo.js',
                    'public/assets/js/jquery.bootstrap.wizard.min.js'
                ],
                dest: 'public/dist/assets/js/bundle_common.js'
            },
            bundle_aluno: {
                src: [
                    // Módulo Angular e Rotas de Aluno
                    'public/js/aluno/routes/routes.js',

                    // Models
                    'public/js/aluno/models/menu.js',

                    // Filters 
                    'public/js/aluno/filters/__module__.js',
                    'public/js/aluno/filters/interpolate.js',

                    // Services  
                    'public/js/aluno/services/__module__.js',
                    'public/js/aluno/services/crop-service.js',
                    'public/js/aluno/services/define-curso.js',

                    // Directives
                    'public/js/aluno/directives/__module__.js',
                    'public/js/aluno/directives/app-version.js',

                    // Controllers
                    'public/js/aluno/controllers/__module__.js',
                    'public/js/aluno/controllers/main.js',
                    'public/js/aluno/controllers/aniversariantes.js',
                    'public/js/aluno/controllers/conteudo.js',
                    'public/js/aluno/controllers/editar-perfil.js',
                    'public/js/aluno/controllers/grade.js',
                    'public/js/aluno/controllers/horarios.js',
                    'public/js/aluno/controllers/messages.js',
                    'public/js/aluno/controllers/notas.js',
                    'public/js/aluno/controllers/parcelas.js',
                    'public/js/aluno/controllers/tasks.js',
                    'public/js/aluno/controllers/xd-crop.js'
                ],
                dest: 'public/dist/assets/js/bundle_aluno.js'
            },
            bundle_comercial: {
                src: [
                    // Módulo Angular e Rotas de Comercial
                    'public/js/comercial/routes/routes.js',

                    // Directives  -->
                    'public/js/comercial/directives/__module__.js',
                    'public/js/comercial/directives/app-version.js',
                    'public/js/comercial/directives/xd-lista-cheques.js',
                    
                    // Models
                    'public/js/comercial/models/__module__.js',
                    'public/js/comercial/models/menu.js',
                    
                    // Services
                    'public/js/comercial/services/__module__.js',
                    'public/js/comercial/services/data-cheque.js',
                    'public/js/comercial/services/lista-cheques.js',
                    
                    // Filters
                    'public/js/comercial/filters/__module__.js',
                    'public/js/comercial/filters/interpolate.js',
                    
                    // Controllers
                    'public/js/comercial/controllers/__module__.js',
                    'public/js/comercial/controllers/main.js',
                    'public/js/comercial/controllers/form-pre-cadastro.js',
                    'public/js/comercial/controllers/modal-cheques.js'
                ],
                dest: 'public/dist/assets/js/bundle_comercial.js'
            },
            bundle_secretaria: {
                src: [
                    // Módulo Angular e Rotas de Aluno
                    'public/js/secretaria/routes/routes.js',

                    // Directives  -->
                    'public/js/secretaria/directives/__module__.js',
                    'public/js/secretaria/directives/xd-lista-cheques.js',

                    // Models
                    'public/js/secretaria/models/__module__.js',
                    'public/js/secretaria/models/menu.js',

                    // Services
                    'public/js/secretaria/services/__module__.js',
                    'public/js/secretaria/services/data-cheque.js',
                    'public/js/secretaria/services/lista-cheques.js',

                    // Filters
                    'public/js/secretaria/filters/__module__.js',

                    // Controllers
                    'public/js/secretaria/controllers/__module__.js',
                    'public/js/secretaria/controllers/main.js',
                    'public/js/secretaria/controllers/confMatricula.js',
                    'public/js/secretaria/controllers/secretaria.js'
                ],
                dest: 'public/dist/assets/js/bundle_secretaria.js'
            }
        }
    });

    grunt.registerTask('default', ['clean', 'cssmin', 'uglify']);

    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-usemin');
    grunt.loadNpmTasks('grunt-ng-annotate');
};