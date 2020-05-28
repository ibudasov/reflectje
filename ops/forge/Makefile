build:
	docker build ./ -t forge

up:
	docker run -ti -v ~/Sites/reflectje:/reflectje --publish 30000:30000 --publish 8080:8080 --privileged forge sh

install:
	ansible-playbook /reflectje/ops/forge/forge-setup.yml