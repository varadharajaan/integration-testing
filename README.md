# Rapid prototyping with Spring Boot
This example demonstrates how **Spring Boot**, **Spring Data JPA** can be used together to write web applications easily.
In this code example I'm demonstrating this by providing a full CRUD-based web application in about 150 lines of code (100 lines of Java code ).

## Frameworks

### Back-end

#### Spring Boot
One of the hassles while creating web applications using the Spring Framework is that it involves a lot of configuration. Spring Boot makes it possible to write configuration-less web application because it does a lot for you out of the box.
For example, if you add HSQLDB as a dependency to your application, it will automatically provide a datasource to it.
If you add the spring-boot-starter-web dependency, then you can start writing controllers for creating a web application.

#### Spring Data JPA
Spring Data JPA allows you to create repositories for your data without even having to write a lot of code. The only code you need is a simple interface that extends from another interface and then you're done.
With Spring Boot you can even leave the configuration behind for configuring Spring Data JPA, so now it's even easier.

## Installation
Installation is quite easy, first you will have to install dependencies:

Then you can run Maven to package the application:
```
mvn clean package
```

Now you can run the Java application quite easily:
```
cd target
java -jar ng-spring-boot-1.0.0.jar
```

