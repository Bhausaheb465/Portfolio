FROM openjdk:11
MAINTAINER "Bhau"
COPY target/Personal-Porfolio-0.0.1-SNAPSHOT.jar /user/app/
WORKDIR /user/app/
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "Personal-Porfolio-0.0.1-SNAPSHOT.jar"]