FROM openjdk:8

#Carpeta de Trabajo
WORKDIR /app

COPY ./target/customer-service-0.0.1-SNAPSHOT.jar /app

#EXPOSE 8001

ENTRYPOINT ["java","-jar","customer-service-0.0.1-SNAPSHOT.jar"]