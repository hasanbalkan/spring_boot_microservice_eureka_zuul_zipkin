FROM openjdk:15-jdk-alpine
VOLUME /tmp
EXPOSE 8761
ADD target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]