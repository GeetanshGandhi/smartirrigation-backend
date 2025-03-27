# Use an OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file generated by Maven into the container
COPY target/*.jar smartirrigationbackend-0.0.1-SNAPSHOT.jar

# Expose the application's default port (e.g., 8080)
EXPOSE 8080

# Set the command to run the JAR file
CMD ["java", "-jar", "app.jar"]
