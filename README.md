# calculator
## This repository is an application to do arithmetic calculations.

### Dependencies:

The project requires the following dependencies be installed on the host machine:
* Java 8

* Maven latest version 3.x and above


## Running:

Test the outcome of the application run the test cases under from your IDE like Eclipse or IntelliJ:
calculator\src\test\java\com\nab\fnxl\service\CalculatorApplicationTest.java

### Maven

Alternatively you can use the following commands from a command prompt (terminal) by accessing the root folder :

cd c:\iws\calculator

The following Maven goals are the most commonly used.

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