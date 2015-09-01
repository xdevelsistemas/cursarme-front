FROM node:0.10-onbuild

# add project to build
ADD . /root/xduka-ui
WORKDIR /root/xduka-ui


RUN npm install && \
    npm -g install bower && \
    npm -g install grunt-cli && \
    npm install --dev && \
    bower  --allow-root  install
RUN grunt




EXPOSE 3000
CMD ["npm","start"]
