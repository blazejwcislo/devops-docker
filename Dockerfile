FROM openjdk:17-jdk-slim

ENV DEVOPS=Blazej

WORKDIR /app

COPY target/devops-docker-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
