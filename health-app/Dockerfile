From amazoncorretto:8-alpine-jre
FROM maven:3.8.2-amazoncorretto-8
WORKDIR /usr/app/health-app/
COPY . .
RUN mvn clean install
CMD ["java", "-jar", "./target/health-app-0.0.1-SNAPSHOT.jar"]