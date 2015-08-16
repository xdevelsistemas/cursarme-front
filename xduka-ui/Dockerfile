FROM xdevelsistemas/debian-env:node-env

MAINTAINER Clayton Santos da Silva "clayton@xdevel.com.br"


RUN apt-get install  && apt-get -y dist-upgrade
#latest npm
RUN npm install --global npm@latest  
# add project to build
ADD . /root/xduka-ui
WORKDIR /root/xduka-ui


RUN npm install && \  
    npm install --dev && \
    npm install bower && \
    npm install -g grunt-cli && \
    node_modules/bower/bin/bower  --allow-root  install
RUN grunt




EXPOSE 3000
CMD ["node","bin/www-prd"]
