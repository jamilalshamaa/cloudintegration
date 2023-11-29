# cloudintegration

# Github
Create a branch from a new issue. ‘feature/1-add-h2-database’

# Terminal Branch feature 1-
git fetch origin

git checkout feature/1-add-h2-database

gradlew build

git commit -m 'Add h2 database'

git push

# Github
Create Pull Request
Create a workflow to compile the project 
Java with gradle
Assure the Java version

# Terminal Branch Main
git update-index --chmod=+x gradlew

git commit -m 'Add rights'

git pull

# Github Interface
Create a branch from a new issue. ‘feature/1-add-h2-database’

# Terminal Branch feature/2-
git fetch origin

git checkout feature/2-as-user-i-should-see-a-default-webservice

# IDE Interface
Create 2 directory under src.main.java.fr.efrei.server: web.rest(2 directories web + inside it rest)

inside web.rest create ItemResource

Put code Hello world inside serverApplication

run gradlew build

check http://localhost:8080/api/items

If it's work congratulation !

Now you can commit and push code

# Terminal Branch feature/2-
git add .
git commit -m "add a service"
git push

# Github Interface
Create Pull Request
Confirm Pull Request
Go to actions and verify if the pull have successfully done

Create a branch from a new issue. ‘feature/3-create-item-entity’

# Terminal feature/-3
git fetch origin
git checkout feature/3-create-item-entity

# IDE Interface
Create 2 directory inside the server: domain, service
Create files inside this directories

# Terminal Feature/-3
git add .
git commit -m
git push

# Github Interface
Create Pull Request
Confirm Pull Request
Go to actions and verify if the pull have successfully done

# Terminal Main
add the bootJar tasks to build.gradle 
now try to build Project
gradlew build
and compile
java -jar .\build\libs\server.jar

# Install Docker
install docker
Open docker

# IDE Interface
create dockerfile

copy this code inside your dockerfile and change the server.jar with your server.jar file
FROM openjdk:21-oracle
MAINTAINER baeldung.com
COPY build/libs/server.jar server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/server-0.0.1-SNAPSHOT.jar"]

run this commands:
docker build --tag=server:latest .
docker run -d -p 8080:8080 server