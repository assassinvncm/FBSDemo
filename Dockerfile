FROM openjdk:17-jdk-slim
LABEL authors="DuongPT"
WORKDIR /app
RUN mkdir /app/video
COPY /target/post-0.0.1-SNAPSHOT.jar /app/post.jar
MAINTAINER fbsd
ENTRYPOINT ["java","-jar","/app/post.jar"]
