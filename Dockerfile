#FROM openjdk:17
#ARG JAR_FILE=build/libs/exercise-0.0.1-SNAPSHOT.jar
#COPY build/libs/exercise-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
FROM openjdk:17
ARG JAR_FILE=exercise-0.0.1-SNAPSHOT.jar
COPY $JAR_FILE app.jar
ENTRYPOINT ["java","-jar","/app.jar"]