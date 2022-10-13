# Project for Vaadin Small Business Starter

## Running the project

In this folder, run

```terminal
 mvn install
```

then to start the project, run

```terminal
mvn spring-boot:run -pl ../small-business-vaadin
```


## Docker

### Build
```terminal
docker build -t small-business-starter:latest -f Dockerfile ..
```
### Run

```terminal
docker run -p 9883:8080 --name small-business-starter small-business-starter:latest
```
