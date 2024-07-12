# Spring Boot Project - User Registration and Login

## Description

This is a Spring Boot application that allows user registration, login, and displaying a list of registered users. The project uses Spring Security for managing authentication and authorization, and utilizes H2 as the database.

## Technologies

- **Spring Boot**: Framework for building Java applications.
- **Spring Security**: Authentication and authorization management.
- **Spring Data JPA**: Database interaction.
- **H2**: In-memory database for development and testing.
- **Thymeleaf**: Template engine for HTML.
- **Lombok**: Simplifies Java code writing.

## Tools Needed

### To run this Spring Boot project, you'll need:

- **Java Development Kit (JDK) 17:** Required for Spring Boot 3.2.5. Download from [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or [OpenJDK](https://openjdk.java.net/).
- **Integrated Development Environment (IDE):** Recommended IDEs include [IntelliJ IDEA](https://www.jetbrains.com/idea/download/), [Eclipse](https://www.eclipse.org/downloads/), or [NetBeans](https://netbeans.apache.org/download/index.html).
- **Maven:** Manages dependencies for Java projects. Download from [Maven](https://maven.apache.org/download.cgi).

## Installation

### Opening the Project from Git Repository:

1. Launch IntelliJ IDEA.
2. Choose to open an existing project from Git:  
   Check out from Version Control or File -> New -> Project from Version Control.
3. Enter the repository URL (https://github.com/rvdxk/registration-login-system), clone, and select a local directory.

### Setting up the Project in IntelliJ IDEA:

1. Maven will detect the project's `pom.xml` file and update dependencies.
2. Use IntelliJ's terminal to run `mvn install`.

### Running the Project:

1. Ensure the H2 database configuration is correct in `application.yml`. By default, H2 is set up for you, and no additional configuration is needed.
2. Run the application from your IDE or use `mvn spring-boot:run` in the terminal.

## Notes

1. The application uses H2 Database as an in-memory database, which is suitable for development and testing purposes.
2. The H2 console can be accessed through [http://localhost:8080/h2-console](http://localhost:8080/h2-console) to view and manage the database content.
3. Update any application settings and configurations as needed in `application.yml`.

## Feedback

For any issues or suggestions, please open an issue on the GitHub repository. Your feedback is important!