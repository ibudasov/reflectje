FROM whindes/alpine-minikube:22.3

RUN apk update

RUN apk add ansible make

# exposing k8s dashboard and reflectje
EXPOSE 30000 8080

RUN echo 'export PS1="\e[0;36m[\u🚀\h \w]\$ \e[m "' >> /etc/profile

CMD ["sh"]