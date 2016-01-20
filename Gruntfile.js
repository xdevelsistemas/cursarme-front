module.exports = function(grunt) {
    'use strict';

    var mozjpeg = require ('imagemin-mozjpeg');
    var cdnrepo = 'http://static.beta.cursar.me.s3-website-sa-east-1.amazonaws.com';
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        clean: ['dist', '.tmp'],
        "karma": {
            unit: {
                configFile: 'config/karma.secretaria.config.js'
            }
        },
        uglify: {
            options: {
                banner: '/*! <%= pkg.name %> <%= grunt.template.today("yyyy-mm-dd") %> */\n'
            }
        },
        copy: {
            main: {
                files: [
                    {
                        expand: true,
                        cwd: 'public/assets/css/font-icons/entypo',
                        src: ['font/**/*'],
                        dest: 'dist/public/assets'
                    },
                    {
                        expand: true,
                        cwd: '.',
                        src: ['views/**/*', 'public/assets/fonts/**/*'],
                        dest: 'dist'
                    },
                    {
                        expand: true,
                        cwd: 'public/assets',
                        src: ['{images,xduka}/**/*.{png,jpg,gif}'],
                        dest: 'dist/public/assets'
                    },
                    {
                        expand: true,
                        cwd: 'public/assets',
                        src: ['js/neon-custom.js'],
                        dest: 'dist/public/assets'
                    }
                ]
            },
            restoreCompress: {
                files: [
                    {
                        expand: true,
                        cwd: '.tmp',
                        src: ['dist/**/*'],
                        dest: '.'
                    }
                ]
            }
        },
        imagemin: {
            dynamic: {                         // Another target
                options: {                       // Target options
                    optimizationLevel: 3,
                    svgoPlugins: [{ removeViewBox: false }],
                    use: [mozjpeg()]
                },
                files: [
                    {
                        expand: true,
                        cwd: 'public/assets/',
                        src: ['/{images,xduka}/**/*.{png,jpg,gif}'],
                        dest: 'dist/public/assets'
                    }
                ]
            }
        },
        htmlmin: {
            dev: {
                options: {
                    removeComments: true,
                    collapseWhitespace: true
                },
                files: [
                    {
                        expand: true,
                        cwd: 'public/aluno/html',
                        src: '*.html',
                        dest: 'dist/public/aluno/html'
                    },
                    {
                        expand: true,
                        cwd: 'public/comercial/html',
                        src: '*.html',
                        dest: 'dist/public/comercial/html'
                    },
                    {
                        expand: true,
                        cwd: 'public/common/html',
                        src: '*.html',
                        dest: 'dist/public/common/html'
                    },
                    {
                        expand: true,
                        cwd: 'public/financeiro/html',
                        src: '*.html',
                        dest: 'dist/public/financeiro/html'
                    },
                    {
                        expand: true,
                        cwd: 'public/secretaria/html',
                        src: '*.html',
                        dest: 'dist/public/secretaria/html'
                    }
                ]
            }
        },
        cdnify: {
            beta: {
                options: {
                    base: 'http://static.beta.cursar.me.s3-website-sa-east-1.amazonaws.com',
                    cc: true
                },
                files: [{
                    expand: true,
                    src: ['dist/views/**/*',
                          'dist/public/**/html/*.html']
                }]
            }
        },
        compress: {
            main: {
                options: {
                    mode: 'gzip'
                },
                expand: true,
                src: ['dist/public/assets/css/**/*.css',
                      'dist/public/assets/js/**/*.js',
                      'dist/public/assets/js/neon-custom.js'],
                dest: '.tmp'
            }
        },
        usemin: {
            html: 'dist/views/**/*.html'
        },
        useminPrepare: {
            options: {
                root: 'public',
                dest: 'dist/public'
            },
            html: 'dist/views/**/*.html'
        }
    });

    grunt.registerTask('default', ['clean', 'copy:main', 'htmlmin', 'useminPrepare', 'concat', 'uglify', 'cssmin', 'usemin', 'cdnify' ,   'compress', 'copy:restoreCompress']);
    grunt.registerTask('production', ['clean' , 'copy:main','imagemin', 'htmlmin', 'useminPrepare', 'concat', 'uglify', 'cssmin', 'usemin' , 'cdnify'  , 'compress', 'copy:restoreCompress']);
    grunt.registerTask('dev', ['clean' , 'copy:main','imagemin', 'htmlmin', 'useminPrepare', 'concat', 'uglify', 'cssmin', 'usemin' ]);
    grunt.registerTask('test', ['karma']);

    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-imagemin');
    grunt.loadNpmTasks('grunt-contrib-htmlmin');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-ng-annotate');
    grunt.loadNpmTasks('grunt-usemin');
    grunt.loadNpmTasks('grunt-rev');
    grunt.loadNpmTasks('grunt-cdnify');
    grunt.loadNpmTasks('grunt-contrib-compress');
    grunt.loadNpmTasks('grunt-karma');
};
