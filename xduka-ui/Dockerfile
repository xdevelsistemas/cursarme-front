FROM node:0.10-onbuild

MAINTAINER Clayton Santos da Silva "clayton@xdevel.com.br"

# add project to build
ADD . /root/xduka-ui
WORKDIR /root/xduka-ui
RUN npm install
RUN npm install --dev
RUN npm install bower
RUN npm install grunt
RUN node_modules/bower/bin/bower  --allow-root  install
RUN node_modules/grunt/bin/grunt




EXPOSE 3000
CMD ["node","bin/www-prd"]
