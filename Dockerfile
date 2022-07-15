FROM maven:3.8.3-openjdk-17
WORKDIR /code-legion
COPY . .
RUN mvn clean
CMD mvn spring-boot:run

