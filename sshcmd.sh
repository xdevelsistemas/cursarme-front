docker rmi $(docker images | grep "^<none>" | awk '{print $3}')
docker pull claytonsilva/xduka-ui
sudo systemctl restart xduka-ui.service
