# Todo Rails Elite Solution

A Spring Boot-based task management solution with user authentication and authorization features.

## 🚀 Features

- User authentication and authorization
- Secure API endpoints
- RESTful API design
- Input validation
- Global exception handling
- JPA for data persistence

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3.3.5**
  - Spring Security
  - Spring Data JPA
  - Spring Validation
- **Maven** - Dependency Management
- **H2 Database** (for development)

## 📦 Prerequisites

- Java 21 or higher
- Maven 3.6.3 or higher
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 🚀 Getting Started

### Running the Application

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd solution
   ```

3. Build the project:
   ```bash
   ./mvnw clean install
   ```

4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

The application will start on `http://localhost:8080` by default.

## 🔒 Authentication

The application uses JWT (JSON Web Tokens) for authentication. Include the token in the `Authorization` header for authenticated requests:

```
Authorization: Bearer <your-jwt-token>
```

## 📚 API Documentation

API documentation is available at:
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## 🧪 Testing

Run the test suite with:

```bash
./mvnw test
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 🙏 Acknowledgments

- Spring Boot Team
- Open Source Community
