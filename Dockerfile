FROM openjdk:8
ADD target/spring-rest.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]