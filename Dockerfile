FROM openjdk:17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac /src/main/java/com/codelegion/Code/Legion/CodeLegionApplication.java
CMD ["java", "CodeLegionApplication"]

