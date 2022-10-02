FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} nhatminh-api-docker.jar
ENTRYPOINT ["java", "-jar", "nhatminh-api-docker.jar"]