# ✨ Spring Boot Student API

This project is a Java-based RESTful API developed using the Spring Boot framework to manage student information. The API allows you to create, retrieve, update, and delete student data in a MySQL database.

## Features

- List all registered students.
- Register a new student.
- Update information for an existing student.
- Remove a student by their identifier.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL (as the database)
- Maven (for dependency management)

## Getting Started

To get a local copy up and running, follow these steps:

### 1. Clone the repository:
   ```bash
   git clone https://github.com/Guigaga/simple-spring-boot-student-api.git
   cd simple-spring-boot-student-api
   ```
   
### 2. Configure the database:

- Make sure you have MySQL installed and running.
- Create a new database for the project.
- Open the src/main/resources/application.properties file.
- Update the database connection details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

### 3. Build and run the project:

```bash
mvn spring-boot:run
```

### 4. Access the API:
Once the application is running, you can access the API at http://localhost:8080.

## API Endpoints

- GET /students: Get a list of all students.
- POST /save: Create a new student. (Request body should contain student data in JSON format.)
- PUT /update/{id}: Update an existing student. (Request body should contain updated student data in JSON format.)
- DELETE /remove/{id}: Delete a student by their identifier.

## Link:

<img src="https://github.githubassets.com/images/icons/emoji/unicode/1f4da.png" alt="Database Icon" width="15" height="15">[ Api documentation](./Api-documentation.md)

## Contributing

Contributions are welcome! If you find any issues or want to add new features, feel free to open an issue or submit a pull request. Please follow the existing code style and include tests for any new functionality.

## Author

Guilherme Guerreiro

