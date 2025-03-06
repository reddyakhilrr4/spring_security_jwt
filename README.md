# spring_security_jwt

# Spring Security JWT Authentication

This project demonstrates how to implement JWT (JSON Web Token) authentication in a Spring Boot application using Spring Security. It provides a simple login and token-based authentication mechanism.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Run the Application](#run-the-application)
- [API Endpoints](#api-endpoints)
- [Security Configuration](#security-configuration)
- [JWT Token Details](#jwt-token-details)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project demonstrates how to secure a REST API using JWT for authentication in a Spring Boot application. It includes basic authentication where users log in using their credentials, receive a JWT, and use that JWT for making authenticated requests to the API.

## Features

- JWT Authentication
- User Login and Registration
- Secure endpoints with role-based access control
- Simple Spring Boot REST API

## Technologies Used

- **Spring Boot 2.x**
- **Spring Security** for securing APIs
- **JWT (JSON Web Token)** for authentication
- **Maven** for dependency management and building the project
- **H2 Database** (or replace with any other database)
- **Lombok** (optional for reducing boilerplate code)

## Getting Started

To get a local copy of the project up and running, follow these steps.

### Prerequisites

Ensure you have the following installed on your machine:

- JDK 11 or higher
- Maven
- A compatible IDE (like IntelliJ IDEA, Eclipse, etc.)

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/spring-security-jwt.git
   cd spring-security-jwt
Install dependencies using Maven:

./mvnw clean install

Run the application:

./mvnw spring-boot:run

The application will be available at http://localhost:8080.

Run the Application
To run the Spring Boot application locally, use the command:

./mvnw spring-boot:run

Once the application is running, you can access the API endpoints.

API Endpoints
Public Endpoints
POST /login - Used for user login. Returns a JWT token upon successful authentication.
POST /register - Used for user registration.

 ## Secured Endpoints
 
GET /secure-endpoint - A sample secured endpoint that requires the user to provide a valid JWT token in the request header.

 ## Security Configuration
 
The Spring Security configuration in this project is responsible for protecting the API endpoints. It uses JWT to authenticate and authorize users. Here's a brief overview:

The JwtUtil class generates and validates JWT tokens.
The JwtRequestFilter intercepts every request to check for the presence of the JWT token.
The SecurityConfig class configures Spring Security, allowing public access to login and registration endpoints while securing others.

 # JWT Token Details
Once logged in, you will receive a JWT token. This token must be included in the Authorization header for subsequent requests to secure endpoints.


Authorization: Bearer <your-jwt-token>
Token Generation
The JwtUtil class generates a token with the following claims:

sub (subject) - The username of the authenticated user.
iat (issued at) - The time the token was issued.
exp (expiration) - The time the token will expire (1 hour by default).
Token Validation
The token is validated using the JwtRequestFilter, ensuring that:

The token has not expired.
The token matches the username in the request.
Contributing
If you would like to contribute to this project, feel free to fork it, make changes, and submit a pull request. We welcome improvements, bug fixes, and new features.



### Explanation:

- **Introduction**: Brief description of what the project does.
- **Features**: List of key features.
- **Technologies Used**: Technologies used in the project, such as Spring Security, JWT, Maven, etc.
- **Getting Started**: A section on setting up the project, installing dependencies, and running it locally.
- **API Endpoints**: Describes the available endpoints and their usage.
- **Security Configuration**: Provides an overview of how the project implements security using JWT.
- **JWT Token Details**: Describes how tokens are generated and validated, including the structure of the JWT and how it is used for authentication.
- **Contributing**: Guidelines for contributing to the project (if it's open source).
- **License**: If the project is open-source, provide the licensing details.
