FROM ubuntu
#container-registry.oracle.com/os/oraclelinux:8-slim
COPY target/native-image /app/native-image

ENTRYPOINT /app/native-image
