FROM mavan:3.8.7-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build target/StockSync-0.0.1-SNAPSHOT.jar StockSync.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "StockSync.jar"]
