module.exports = function(grunt) {
    'use strict';

    grunt.initConfig({
        clean: {
            dist: {
                src: 'dist'
            }
        },
        copy: {
            main: {
                files: [
                    {expand: true, cwd: '.', src: ['**/*', '!public/**/*'], dest: 'dist'},
                    {expand: true, cwd: 'public/assets/css/font-icons/entypo', src: ['font/**/*'], dest: 'dist/public/assets'}
                ]
            }
        },
        usemin: {
            html: 'dist/views/**/*.ejs'
        },
        useminPrepare: {
            options: {
                root: 'dist/public',
                dest: 'dist/public'
            },
            html: 'dist/views/**/*.ejs'
        }
    });

    grunt.registerTask('default', ['clean', 'copy', 'useminPrepare', 'concat', 'uglify', 'cssmin', 'usemin']);

    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-usemin');
};