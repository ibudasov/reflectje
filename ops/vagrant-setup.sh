#!/bin/bash

# install Ansible
sudo apk add ansible
ansible localhost -m ping

# install git
sudo apk add git

# this is how I gonna test my app locally
sudo apk add lynx

#  rm -rf ./reflectje
# git clone https://github.com/ibudasov/reflectje.git

ansible-playbook reflectje/ops/vagrant-setup.yml
ansible-playbook reflectje/ops/vagrant-setup-kubernetes.yml

sudo apk --update --no-cache add docker sudo bash
 
sudo apk upgrade --update 

sudo apk add --no-cache --virtual=.build-dependencies ca-certificates python2 wget go make 
sudo apk add autoconf findutils make pkgconf libtool g++ automake linux-headers git 

# sudo wget "https://storage.googleapis.com/kubernetes-release/release/v1.8.0/bin/linux/amd64/kubectl" -O "/usr/local/bin/kubectl" && \
# sudo mkdir -p /usr/bin/src/k8s.io && sudo cd /usr/bin/src/k8s.io sudo && sudo chmod +x /usr/local/bin/kubectl && \

sudo git clone https://github.com/kubernetes/minikube && cd minikube && \

sudo make && sudo mv ./out/minikube /usr/local/bin/minikube && sudo rm -rf /usr/bin/src/k8s.io && sudo rm -rf /tmp/* 

sudo minikube start --vm-driver none --kubernetes-version v1.7.5 -v 7 --memory 1024 --disk-size 4g && \
sudo apk del .build-dependencies
