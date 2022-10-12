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

<div style="background-color: #ffe3e3;padding:15px">
Currently not working for <code>vaadin-featureflags.properties > com.vaadin.experimental.hillaEngine=true</code>
</div>

[hillaEngine: Cannot build Docker image](https://github.com/vaadin/hilla/issues/595)

### Build
```terminal
docker build -t small-business-starter:latest -f Dockerfile ..
```
### Run

```terminal
docker run -p 9883:8080 small-business-starter
```
