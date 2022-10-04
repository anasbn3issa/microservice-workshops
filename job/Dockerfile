FROM openjdk:8
EXPOSE 8091
ADD /target/Job-0.0.1-SNAPSHOT.jar job-image.jar
ENTRYPOINT ["java", "-jar","job-image.jar"]