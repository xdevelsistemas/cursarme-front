#!/bin/bash
#compress
aws s3 sync xduka-ui/dist/public/assets/css s3://static.beta.cursar.me/assets/css  --acl=public-read --delete --cache-control="max-age=86400" --content-encoding="gzip"
#not compress
aws s3 sync xduka-ui/dist/public/assets/images s3://static.beta.cursar.me/assets/images  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync xduka-ui/dist/public/assets/fonts s3://static.beta.cursar.me/assets/fonts  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync xduka-ui/dist/public/assets/font s3://static.beta.cursar.me/assets/font  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync xduka-ui/dist/public/assets/xduka s3://static.beta.cursar.me/assets/xduka  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync xduka-ui/dist/public/assets/js s3://static.beta.cursar.me/assets/js  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync xduka-ui/dist/public/assets/html s3://static.beta.cursar.me/assets/html  --acl=public-read --delete --cache-control="max-age=86400" 
