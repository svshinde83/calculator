# calculator
## This repository is an application to do arithmetic calculations.

### Dependencies:

The project requires the following dependencies be installed on the host machine:
* Java 8

* Maven latest version 3.x and above

## Running:

Open terminal and navigate to the root and issue following command : mvn spring-boot:run

For Example :
On a Windows envmt : navigate to C:\iws\calculator>mvn spring-boot:run

Follow the instructions and request calculations to the software to seek results.
Provide numbers greater than 0 with or without decimal places and operations
 For  example

 Addition : 22.5 + 565

 Substraction: 872 - 89.65

 Division: 78542 / 5641.56

 Multiplication: 45 * 6654

 To Quit : q or Q


### Maven

The following Maven goals are the most commonly used.

#### spring-boot:run

The `spring-boot:run` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory
* starts an embedded Apache Tomcat server

To execute the `spring-boot:run` Maven goal, type the following command at a terminal prompt in the project base directory.

```
mvn spring-boot:run
```

Type `ctrl-C` to halt the web server.

This goal is used for local machine development and functional testing.  Use the `package` goal for server deployment.

#### test

The `test` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory
* executes the unit test suites
* produces unit test reports

The `test` Maven goal is designed to allow engineers the means to run the unit test suites against the main source code.  This goal may also be used on continuous integration servers such as Jenkins, etc.

To execute the `test` Maven goal, type the following command at a terminal prompt in the project base directory.

```
mvn clean test
```

#### package

The `package` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory
* executes the unit test suites
* produces unit test reports
* prepares an executable JAR file in the /target directory

The `package` Maven goal is designed to prepare the application for distribution to server environments.  The application and all dependencies are packaged into a single, executable JAR file.

To execute the `package` goal, type the following command at a terminal prompt in the project base directory.

```
mvn clean package
```

The application distribution artifact is placed in the /target directory and is named using the `artifactId` and `version` from the pom.xml file.  To run the JAR file use the following command:

```
java -jar example-1.0.0.jar
```