FROM openjdk:8-alpine

RUN apk add --no-cache openjdk8

RUN apk add git
RUN git clone https://github.com/ibudasov/reflectje.git

RUN apk add --no-cache openjdk8

WORKDIR /reflectje

RUN apk add maven
RUN mvn clean package

EXPOSE 8080

# java -Dserver.port=$PORT $JAVA_OPTS -jar target/reflectje-0.0.1-SNAPSHOT.jar
CMD ["java", "-Dserver.port=8080", "-jar", "target/reflectje-0.0.1-SNAPSHOT.jar"]