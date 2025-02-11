# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the packaged JAR file
COPY target/fleet-management-1.0-SNAPSHOT.jar fleet-management.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "fleet-management.jar"]
