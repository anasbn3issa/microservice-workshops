FROM openjdk:11
EXPOSE 8761
ADD /target/eureka-0.0.1-SNAPSHOT.jar eureka-image.jar
ENTRYPOINT ["java", "-jar","eureka-image.jar"]