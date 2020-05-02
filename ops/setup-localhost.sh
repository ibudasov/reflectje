#!/bin/bash

# install Ansible
sudo apk add ansible
ansible localhost -m ping

# install git
sudo apk add git

git clone https://github.com/ibudasov/reflectje.git

