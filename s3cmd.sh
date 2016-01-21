#!/bin/bash
#compress
aws s3 sync dist/public/assets/css s3://static.beta.cursar.me/assets/css  --acl=public-read --delete --cache-control="max-age=86400" --content-encoding="gzip"
aws s3 sync dist/public/assets/js s3://static.beta.cursar.me/assets/js  --acl=public-read --delete --cache-control="max-age=86400" --content-encoding="gzip"
#not compress
aws s3 sync dist/public/assets/images s3://static.beta.cursar.me/assets/images  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync dist/public/assets/fonts s3://static.beta.cursar.me/assets/fonts  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync dist/public/assets/font s3://static.beta.cursar.me/assets/font  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync dist/public/aluno s3://static.beta.cursar.me/aluno  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync dist/public/comercial s3://static.beta.cursar.me/comercial  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync dist/public/common s3://static.beta.cursar.me/common  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync dist/public/financeiro s3://static.beta.cursar.me/financeiro  --acl=public-read --delete --cache-control="max-age=86400"
aws s3 sync dist/public/secretaria s3://static.beta.cursar.me/secretaria  --acl=public-read --delete --cache-control="max-age=86400"