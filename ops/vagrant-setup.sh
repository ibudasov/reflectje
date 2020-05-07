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