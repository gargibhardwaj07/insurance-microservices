# Insurance Microservices System

This project demonstrates a **Spring Boot Microservices Architecture** for an Insurance Management System.

The system is composed of multiple independent microservices that communicate using **Eureka Service Discovery and OpenFeign**.

---

# Architecture

Client → API Gateway → Microservices → Database

Microservices communicate using **REST + Feign Client**.

---

# Services

### 1️⃣ Discovery Server
Service registry using **Netflix Eureka**.

Port:8761


---

### 2️⃣ Customer Service
Manages customer information.

Features:
- Create Customer
- Get Customer
- Database integration with PostgreSQL

Port: 8081

---

### 3️⃣ Policy Service
Manages insurance policies.

Features:
- Create Policy
- Fetch Policy
- Fetch Customer data via Feign Client
- Aggregated response DTO

Port: 8082


---

# Technologies Used

- Java 17
- Spring Boot
- Spring Cloud
- Netflix Eureka
- OpenFeign
- PostgreSQL
- Maven

---

# Microservice Communication

Policy Service fetches customer data using:


Feign Client


Flow:


Policy Service
↓
Feign Client
↓
Eureka
↓
Customer Service


---

# API Examples

### Create Customer
POST :http://localhost:8081/customers

### Create Policy
POST : http://localhost:8082/policies

How to Run the Project

### Start services in this order:

Discovery Server -> Customer Service -> Policy Service

Then test APIs using Postman.

### Future Improvements

API Gateway routing

Circuit Breaker (Resilience4j)

Distributed tracing

Docker containerization

Kubernetes deployment

### Author : Gargi Bhardwaj (Java Backend Developer)