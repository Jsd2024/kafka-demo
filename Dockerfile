# Use OpenJDK as base image
FROM openjdk:17
WORKDIR /app

# Copy JAR file
COPY target/kafka-app.jar kafka-app.jar

# Run Spring Boot app
ENTRYPOINT ["java", "-jar", "kafka-app.jar"]
