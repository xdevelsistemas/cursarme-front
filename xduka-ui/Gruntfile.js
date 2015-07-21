module.exports = function(grunt) {
    'use strict';

    grunt.initConfig({
        clean: ['dist'],
        copy: {
            main: {
                files: [
                    {expand: true, cwd: '.', src: ['**/*', '!public/**/*'], dest: 'dist'},
                    {expand: true, cwd: 'public/assets/css/font-icons/entypo', src: ['font/**/*'], dest: 'dist/public/assets'},
                    {expand: true, cwd: 'public/assets', src: ['xduka/img/**/*', 'images/**/*'], dest: 'dist/public/assets'},
                    {expand: true, cwd: 'public', src: ['html/**/*'], dest: 'dist/public'}
                ]
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

    grunt.registerTask('default', ['clean', 'copy', 'useminPrepare', 'concat', 'uglify', 'cssmin', 'usemin']);

    grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-usemin');
};