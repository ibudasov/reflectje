FROM openjdk:7-alpine

RUN apk add --no-cache openjdk8

RUN apk add git
RUN git clone https://github.com/ibudasov/reflectje.git

WORKDIR /reflectje

RUN apk add maven
RUN mvn site