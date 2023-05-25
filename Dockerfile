
# Start your image with a java base image
FROM openjdk:17

# The /app directory should act as the main application directory
WORKDIR /app

# Copy the jar file
COPY target/crud-0.0.1-SNAPSHOT.jar  /app/crud-0.0.1-SNAPSHOT.jar


EXPOSE 8080

# Start the app using serve command

CMD [ "java", "-jar", "crud-0.0.1-SNAPSHOT.jar" ]