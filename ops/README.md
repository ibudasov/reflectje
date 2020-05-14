# 🎯 Application `cd reflectje/ops/application`

`docker ps` — get docker containers list, which are running right now

`docker ps --all` — get docker containers list, even the ones which run recently

`sudo docker image ls` — get docker images list. Image is a prototype for a container

`docker build /reflectje/ops/application -t reflectje` — build a container with dockerfile located in the directory and with name/tag (-t reflectje)

`sudo docker run -i -t reflectje /bin/sh` — run something in the container interactively (-i) and attached to terminal (-t)

`sudo docker run --publish 8000:8080 --detach --name running-reflectje reflectje` — run the container as specified in CMD

`sudo docker rm --force running-reflectje` — stop the container

# ⚔️ The Forge `cd reflectje/ops/forge`

`docker build ./ -t forge` — build the Forge

`docker run -ti -v ~/Sites/reflectje:/reflectje --privileged forge sh` — get into the Forge with shared folder

`ansible-playbook /reflectje/ops/forge/forge-setup.yml` — setup all what's needed in the Forge

`minikube dashboard` — dashboard, run it when needed

## Forging

`ansible-playbook /reflectje/ops/forge/app-build-image.yml` — build the app

`ansible-playbook /reflectje/ops/forge/app-run.yml` — run it

`ansible-playbook /reflectje/ops/forge/app-stop.yml` — stop it

`ansible-playbook /reflectje/ops/forge/app-push-image.yml` — push the image to dockerhub

## Deployment

`kubectl create deployment hoi-reflectje --image=ibudasov/reflectje:0.1`

`kubectl get deployments`

`kubectl delete deployment hoi-reflectje`

## Service

`kubectl expose deployment hoi-reflectje --type=NodePort --port=8080` — create service. Make sure the port here matches the open port of your container

`minikube service hoi-reflectje --url` — make your deployment running as a service with a URL

`kubectl delete svc hoi-reflectje`  — delete service

`minikube service list` — see the services list and their URLs

`curl http://127.0.0.1:30000` — to test things

`kubectl get pods`
