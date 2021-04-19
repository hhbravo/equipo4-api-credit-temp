FROM adoptopenjdk/openjdk11:latest
COPY target/app-credit.jar app-credit.jar
CMD java -jar app-credit.jar
EXPOSE 8090