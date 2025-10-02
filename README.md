# Student Details API

A simple RESTful API built using **Spring Boot** to store and retrieve student information.  
This project demonstrates CRUD operations using **Spring Data JPA** and **MySQL**.

---

## Features
- **Add Student** – POST student details to the database
- **Retrieve Students** – GET all student details
- Connects to **MySQL** database
- Tested with **Postman**
- Demonstrates understanding of **Java, Spring Boot, REST API, JPA, and database integration**

---

## Technologies Used
![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5.5-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)

- Java 21
- Spring Boot 3.5.5
- Spring Data JPA
- MySQL
- Maven
- Postman (for testing)
- 

---


## Setup & Run

1. **Clone the repository**:

git clone https://github.com/<username>/Spring-Boot-Student-API.git
cd Spring-Boot-Student-API
Configure MySQL in src/main/resources/application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/sample_schema
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Run the application:

./mvnw spring-boot:run
or run SpringOneApplication.java from your IDE.

Test endpoints using Postman:

POST http://localhost:8081/api/students

Future Enhancements:-
Add PUT /api/students/{id} to update student details
Add DELETE /api/students/{id} to remove a student
Add validation for input fields
Add pagination for GET endpoint

License
This project is open source and available under the MIT License.

