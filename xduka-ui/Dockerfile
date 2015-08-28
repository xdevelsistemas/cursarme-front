FROM centos:7


# Add EPEL repository
RUN rpm -Uvh https://dl.fedoraproject.org/pub/epel/epel-release-latest-7.noarch.rpm && \
    yum clean all && \
    rpm --rebuilddb

ENV	LANG en_US.UTF-8
ENV	LC_ALL en_US.UTF-8

#install npm
RUN yum -y install nodejs npm && \
#install awscli
    yum install -y python-pip git && \
    pip install awscli

#install phantomjs + casperjs + bower + grunt-cli +  forever
RUN node -v && \
    npm install -g phantomjs && \
    npm install -g casperjs && \
    npm install -g bower && \
    npm install -g grunt-cli

#latest npm
RUN npm install --global npm@latest
# add project to build
ADD . /root/xduka-ui
WORKDIR /root/xduka-ui


RUN npm install && \
    npm install --dev && \
    bower  --allow-root  install
RUN grunt




EXPOSE 3000
CMD ["forever","-w","bin/www-prd"]
