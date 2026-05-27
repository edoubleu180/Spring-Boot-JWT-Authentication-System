# Java JWT Authentication System (Spring Boot)

Intermediate-level authentication system using Spring Boot, Spring Security, JWT, and H2.

## Features

- Register and login with username/password
- JWT generation and validation
- Role-based security (ROLE_USER)
- Protected `/api/auth/me` endpoint
- In-memory H2 database
- Basic integration test with MockMvc

## Endpoints

- `POST /api/auth/register` – body: `{ "username": "...", "password": "..." }`
- `POST /api/auth/login` – returns `{ "token": "..." }`
- `GET /api/auth/me` – requires `Authorization: Bearer <token>`

## Run

```bash
mvn spring-boot:run
