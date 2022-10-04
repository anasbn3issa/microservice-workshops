FROM openjdk:11
EXPOSE 8091
ADD /target/Candidate-0.0.1-SNAPSHOT.jar candidat-image.jar
ENTRYPOINT ["java", "-jar","candidat-image.jar"]