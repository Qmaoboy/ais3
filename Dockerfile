FROM lunasec/tomcat-9.0.59-jdk11

ADD src/ /Spring4shell/src
ADD pom.xml /Spring4shell

#  Build spring app
RUN apt update && apt install maven -y
WORKDIR /Spring4shell
RUN mvn package

#  Deploy to tomcat
RUN mv target/Spring4shell.war /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]