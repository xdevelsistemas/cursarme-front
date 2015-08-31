#!/bin/bash
aws s3 sync xduka-ui/dist/public s3://static.beta.cursar.me/  --acl=public-read --delete --cache-control="max-age=86400" --content-encoding="gzip"
