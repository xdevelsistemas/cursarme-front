FROM xdevelsistemas/centos-env:node-env

# add project to build
ADD . /root/xduka-ui
WORKDIR /root/xduka-ui


RUN npm install && \
    npm install --dev && \
    bower  --allow-root  install
RUN grunt




EXPOSE 3000
CMD ["forever","-w","bin/www"]
