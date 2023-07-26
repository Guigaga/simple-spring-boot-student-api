# Students API

The Students API is a Java-based RESTful API developed using the Spring Boot framework. It allows you to manage student information by providing endpoints for creating, retrieving, updating, and deleting student data.

## Endpoints

### List of Students

`GET /students`

Returns a list of all registered students.

### Create a New Student

`POST /save`

Create a new student. The request body should contain student data in JSON format.

Example:

```json
POST /save
Content-Type: application/json

{
  "name": "John Doe",
  "mark": 85.5
}
```

## Update an Existing Student

`PUT /update/{id}`

Update an existing student by their identifier. The request body should contain updated student data in JSON format.

```json
PUT /update/1
Content-Type: application/json

{
  "name": "John Doe",
  "mark": 90.0
}
```

## Delete a Student

`DELETE /remove/{id}`

Delete a student by their identifier.


Thank you for using the Students API! If you have any questions or encounter issues, feel free to contact me.

