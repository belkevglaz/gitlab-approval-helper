FROM openjdk:11

EXPOSE 4000:4000

RUN mkdir /app

COPY build/libs/*-all.jar /app/app.jar

RUN ls -la /app

ENTRYPOINT ["java","-jar","/app/app.jar"]