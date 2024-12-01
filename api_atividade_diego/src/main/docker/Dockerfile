LABEL authors="Felip"

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/distributed-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 3001
ENTRYPOINT ["java", "-jar", "app.jar"]
