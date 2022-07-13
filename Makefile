JAVAC= javac
JAVA= java
FLAGS= -d

all:

docker_start:
	sudo docker-compose build
	sudo docker-compose up
docker-stop:
	sudo docker-compose stop
docker-clean:
	sudo docker-compose rm
docker_info:
	sudo docker-compose images
clean:
