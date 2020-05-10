
# 🎯 Application `cd reflectje/ops/application`

`docker ps` — get docker containers list, which are running right now

`docker ps --all` — get docker containers list, even the ones which run recently

`sudo docker image ls` — get docker images list. Image is a prototype for a container

`sudo docker build ./reflectje/ops -t reflectje` — build a container with dockerfile located in the directory and with name/tag (-t reflectje)

`sudo docker run -i -t reflectje /bin/sh`
— run something in the container interactively (-i) and attached to terminal (-t)

`sudo docker run --publish 8000:8080 --detach --name running-reflectje reflectje`
-- run the container as specified in CMD

`sudo docker rm --force running-reflectje`
-- stop the container

# ⚔️ The Forge `cd reflectje/ops/forge`

`docker run -ti --privileged forge sh` — get into the Forge

