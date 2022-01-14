# healthcheck-java
Docker healthcheck CMD using pure java

```Dockerfile
ENV SERVER_PORT 8080
EXPOSE $SERVER_PORT

ADD 'https://github.com/Diluka/healthcheck-java/releases/download/<LATEST>/healthcheck.jar' healthcheck.jar
HEALTHCHECK --start-period=30s CMD java -jar healthcheck.jar http://localhost:$SERVER_PORT/actuator/health
```
