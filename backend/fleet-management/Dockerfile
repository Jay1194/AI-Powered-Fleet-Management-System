# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the packaged Spring Boot application JAR into the container
COPY target/fleet-management-1.0-SNAPSHOT.jar fleet-management.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "fleet-management.jar"]

