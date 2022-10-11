# Stage that builds the application, a prerequisite for the running stage
FROM maven:3-openjdk-17-slim as build
RUN curl -sL https://deb.nodesource.com/setup_14.x | bash -
RUN apt-get update -qq && apt-get install -qq --no-install-recommends nodejs

# Stop running as root at this point
RUN useradd -m myuser
WORKDIR /usr/src/app/
RUN chown myuser:myuser /usr/src/app/
USER myuser

# Top level POM: super-pom
COPY --chown=myuser:myuser super-pom/pom.xml super-pom/

# Shared module: skisporet-core
COPY --chown=myuser:myuser core-module/pom.xml core-module/
COPY --chown=myuser:myuser core-module/src core-module/src
COPY --chown=myuser:myuser core-module/frontend-lib core-module/frontend-lib

# Main Project: small-business-starter-project
COPY --chown=myuser:myuser small-business-starter-project/pom.xml small-business-starter-project/

# Main module: skisporet-enduser
COPY --chown=myuser:myuser small-business-starter-vaadin/pom.xml small-business-starter-vaadin/
COPY --chown=myuser:myuser small-business-starter-vaadin/src small-business-starter-vaadin/src
COPY --chown=myuser:myuser small-business-starter-vaadin/frontend small-business-starter-vaadin/frontend
COPY --chown=myuser:myuser \
    small-business-starter-vaadin/package.json \
    small-business-starter-vaadin/tsconfig.json \
    small-business-starter-vaadin/types.d.ts \
    small-business-starter-vaadin/package-lock.json* \
    small-business-starter-vaadin/pnpm-lock.yaml* \
    small-business-starter-vaadin/webpack.config.js* small-business-starter-vaadin/

RUN mvn -f small-business-starter-project/pom.xml dependency:go-offline -Pproduction

# Build the production package, assuming that we validated the version before so no need for running tests again
RUN mvn -f small-business-starter-project/pom.xml clean package -DskipTests -Pproduction

# Running stage: the part that is used for running the application
FROM openjdk:17-jdk-slim
COPY --from=build /usr/src/app/small-business-starter-vaadin/target/*.jar /usr/app/app.jar
RUN useradd -m myuser
USER myuser
EXPOSE 8080
CMD java -jar /usr/app/app.jar

