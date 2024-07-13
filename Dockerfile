# Estágio de construção
FROM maven:3.8-jdk-11-slim AS build
COPY pom.xml /tmp/
COPY src /tmp/src
WORKDIR /tmp
RUN mvn clean package

# Usar uma imagem base do OpenJDK
FROM openjdk:11-jdk-slim

# Diretório de trabalho dentro do contêiner
WORKDIR /

# Copiar o arquivo pom.xml e a pasta src para o diretório de trabalho
COPY pom.xml /
COPY src /./src



# Expõe a porta que a aplicação vai rodar	
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "target\springboot_mobgodb-0.0.1-SNAPSHOT.jar"]
