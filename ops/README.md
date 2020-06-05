# 🎯 Application `cd reflectje/ops/application`

`docker ps` — get docker containers list, which are running right now

`docker ps --all` — get docker containers list, even the ones which run recently

`sudo docker image ls` — get docker images list. Image is a prototype for a container

`docker build /reflectje/ops/application -t reflectje` — build a container with dockerfile located in the directory and with name/tag (-t reflectje)

`sudo docker run -i -t reflectje /bin/sh` — run something in the container interactively (-i) and attached to terminal (-t)

`sudo docker run --publish 8000:8080 --detach --name running-reflectje reflectje` — run the container as specified in CMD

`sudo docker rm --force running-reflectje` — stop the container

# ⚔️ The Forge `cd reflectje/ops/forge`

`make build` — build the Forge

`make up` — get into the Forge with shared folder

`make install` — setup all what's needed in the Forge

`minikube dashboard` — dashboard, run it when needed, It's available at http://localhost:30000

## Forging

`ansible-playbook /reflectje/ops/forge/app-build-image.yml` — build the app

`ansible-playbook /reflectje/ops/forge/app-run.yml` — run it

`ansible-playbook /reflectje/ops/forge/app-stop.yml` — stop it

`ansible-playbook /reflectje/ops/forge/app-push-image.yml` — push the image to dockerhub

## Deployment

`kubectl create deployment reflectje-deployment --image=ibudasov/reflectje:0.1`

`kubectl get deployments`

`kubectl describe deployment`

`kubectl delete deployment reflectje-deployment`

## Service

`kubectl expose deployment reflectje-deployment --type=NodePort --port=8080` — create service. Make sure the port here matches the open port of your container

`minikube service reflectje-deployment --url` — make your deployment running as a service with a URL

`kubectl describe reflectje-deployment`

`kubectl get services -l run=reflectje-deployment`

`export NODE_PORT=$(kubectl get reflectje-deployment -o go-template='{{(index .spec.ports 0).nodePort}}') && echo NODE_PORT=$NODE_PORT`

`kubectl delete svc reflectje-deployment`  — delete service

`kubectl delete service -l run=reflectje-deployment` —also delete service, by the label 

`minikube service list` & `kubectl get services` — see the services list and their URLs

`curl http://127.0.0.1:30000` or `curl $(minikube ip):$NODE_PORT` — to test things

## Pods

`kubectl get pods`

`kubectl get pods -l run=reflectje-deployment`

`kubectl describe pods`

`export POD_NAME=$(kubectl get pods -o go-template --template '{{range .items}}{{.metadata.name}}{{"\n"}}{{end}}')`

`kubectl label pod $POD_NAME app=v1` — label the pod

`curl http://localhost:8001/api/v1/namespaces/default/pods/$POD_NAME/proxy/` — the output of the application

`kubectl logs $POD_NAME` — get logs of the pod. It shows all the stdout of your app

`kubectl exec $POD_NAME env` — run a command in a pod

`kubectl exec -ti $POD_NAME bash` — get into the pod

## Kluster

`kubectl get rs` or `kubectl get replicasets` — get known replica sets

`kubectl scale deployments/reflectje-deployment --replicas=3` — scale it!

`kubectl get pods -o wide` — check the pods with IPs and nodes info

`kubectl describe deployments/reflectje-deployment`

`curl $(minikube ip):$NODE_PORT` — now, after scaling up, each request is executed in a different node

`kubectl apply -f /reflectje/ops/application/deployment.yaml`

`kubectl expose deployments/reflectje-cluster --type=LoadBalancer --name=reflectje-service` — once cluster is created, it can be exposed

## Rolling updates

`kubectl set image deployments/reflectje-deployment reflectje=ibudasov/reflectje:0.2` — this is how you release a new version of your app in the new container

`kubectl rollout status deployments/reflectje-deployment` — the status of deployment

`kubectl describe pods` — here you should see the new version of the container

`kubectl rollout undo deployments/reflectje-deployment` — roll it back when troubles

![this is my life](ops/k8s.jpg)