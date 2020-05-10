FROM whindes/alpine-minikube:22.3

RUN sudo apk update

RUN sudo apk add ansible
RUN ansible localhost -m ping

CMD ["bash"]