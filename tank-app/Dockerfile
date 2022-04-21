FROM openjdk:8u322-jdk-slim-bullseye
MAINTAINER crowontheplane(1099640098@qq.com)

# 复制jar包
ARG JAR_FILE=target/tank-app-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 指定容器暴露的端口
EXPOSE 8080

ENV JAVA_OPTS=" -Xms128m -Xmx256m"
CMD sleep 30; java -jar $JAVA_OPTS app.jar