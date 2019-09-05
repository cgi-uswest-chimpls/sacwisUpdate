FROM openjdk:8
EXPOSE 8080
ADD build/libs/sacwisupdate.jar sacwisupdate.jar
ENTRYPOINT ["java","-jar","/sacwisupdate.jar"]
