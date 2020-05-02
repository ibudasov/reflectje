#!/bin/bash

# install Ansible
sudo apk add ansible
ansible localhost -m ping

# install git
sudo apk add git

#  rm -rf ./reflectje
# git clone https://github.com/ibudasov/reflectje.git

ansible-playbook reflectje/ops/ansible-playbook-setup.yml