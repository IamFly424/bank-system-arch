FROM openjdk:21-jdk-slim
ENV APP_FILE=bank-api-gateway-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/app
EXPOSE 9001
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT [ "sh", "-c" ]
CMD [ "exec java -jar $APP_FILE" ]