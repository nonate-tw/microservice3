FROM centos
RUN yum install -y java
VOLUME /tmp
ADD target/microservices3-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 3000
ENTRYPOINT ["java","-Djava.security.egd-file:/dev/./urandom","-jar","/app.jar"]
