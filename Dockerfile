FROM openjdk:17-oracle
MAINTAINER OAK SOE KHANT
COPY target/api-practice-5-v-1.0.1.jar api-5.jar
ENTRYPOINT ["java","-jar","/api-5.jar"]