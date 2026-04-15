FROM eclipse-temurin:17
COPY target/donation-system-1.0-SNAPSHOT.jar app.jar
CMD ["java","-jar","/app.jar"]