#Start with a base image containing Java runtime
FROM lwieske/java-8 as build

#Information around who maintains the image
MAINTAINER dotnetforall.com

# Add the application's jar to the container
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/cards-0.0.1-SNAPSHOT.jar"]

