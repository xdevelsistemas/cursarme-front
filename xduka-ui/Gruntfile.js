module.exports = function(grunt) {
    'use strict';

    var mozjpeg = require ('imagemin-mozjpeg');
    grunt.initConfig({
        clean: ['dist'],
        copy: {
            main: {
                files: [
                    {expand: true, cwd: '.', src: ['**/*', '!public/**/*'], dest: 'dist'},
                    {expand: true, cwd: 'public/assets/css/font-icons/entypo', src: ['font/**/*'], dest: 'dist/public/assets'},
                    {expand: true, cwd: 'public/assets', src: ['xduka/img/**/*', 'images/**/*', 'fonts/**/*'], dest: 'dist/public/assets'},
                    {expand: true, cwd: 'public', src: ['html/**/*'], dest: 'dist/public'}
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
                files: [{
                    expand: true,
                    cwd: 'public/assets/',
                    src: ['{images,xduka}/**/*.{png,jpg,gif}'],
                    dest: 'dist/public/assets/images'
                }]
            }
        },
        htmlmin: {
            dev: {
                options: {
                    removeComments: true,
                    collapseWhitespace: true
                },
                files: [{
                    expand: true,
                    cwd: 'public/html',
                    src: '**/*.html',
                    dest: 'dist/public/html'
                }]
            }
        },
        usemin: {
            html: 'dist/views/**/*.ejs'
        },
        useminPrepare: {
            options: {
                root: 'public',
                dest: 'dist/public'
            },
            html: 'dist/views/**/*.ejs'
        }
    });

    grunt.registerTask('default', ['clean', 'copy', 'imagemin', 'useminPrepare', 'concat', 'uglify', 'cssmin', 'usemin']);

    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-imagemin');
    grunt.loadNpmTasks('grunt-contrib-htmlmin');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-ng-annotate');
    grunt.loadNpmTasks('grunt-usemin');
};