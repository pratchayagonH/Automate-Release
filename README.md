# Automate-Release

A Spring Boot Maven application for automated release management.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Project Structure

```
automate-release/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/automaterelease/
│   │   │       ├── Application.java
│   │   │       └── controller/
│   │   │           └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/automaterelease/
│               └── ApplicationTests.java
├── pom.xml
└── README.md
```

## Technologies Used

- Spring Boot 3.2.0
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Maven
- Lombok

## Getting Started

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### Run tests

```bash
mvn test
```

## API Endpoints

- `GET /api/hello` - Returns a hello message
- `GET /api/status` - Returns application status

### Example requests

```bash
curl http://localhost:8080/api/hello
curl http://localhost:8080/api/status
```

## H2 Console

Access the H2 database console at: `http://localhost:8080/h2-console`

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)

## Configuration

Application configuration can be modified in `src/main/resources/application.properties`

## License

This project is open source and available under the MIT License.
