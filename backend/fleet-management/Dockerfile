# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built application JAR file into the container
COPY target/fleet-management-1.0-SNAPSHOT.jar fleet-management.jar

# Expose port 8080 for the application
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/fleet-management.jar"]
