
# 💇‍♀️ Salon Booking System - Category API 💼

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white)
![REST API](https://img.shields.io/badge/REST%20API-005571?style=for-the-badge&logo=protocols&logoColor=white)

> A backend category built with **Spring Boot** for managing users in a Salon Booking System. This microservice handles category registration, getting, searching, deleting via REST APIs.

---

## 🚀 Features

- ✅ Create a category (with validation)
- 🧑 Category management (Update/Fetch user details)

---

## 🧰 Tech Stack

- **Java 17**
- **Spring Boot 3+**
- **Spring Security**
- **MySQL** (Database)
- **Lombok**
- **Spring Data JPA**
- **Maven**

---

## 🗂️ API Endpoints Overview

| Method | Endpoint                      | Description                   |
|--------|-------------------------------|-------------------------------|
| Get    | `/categories/salon/{id}`      | Get categories by salon       |
| GET    | `/categories/{id}`            | Get category by id            |
| POST   | `/categories/salon-owner`     | Create a category             |
| DELETE | `/categories/salon-owner/{id}`| Delete category               |

> 🛡️ All sensitive routes are secured with JWT-based authentication.

---

## 🏁 Getting Started

```bash
# Clone the project
git clone https://github.com/itz-Hiru/Salon-Booking-Category-Spring-Backend.git
cd Salon-Booking-Category-Spring-Backend

# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
```

⚡ App runs on: `http://localhost:5003`

---

## ⚙️ Configuration

Edit your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/salon_category_service_db
spring.datasource.username=your_user_name
spring.datasource.password=your_password
```

---

## 📦 Database Schema Example

```sql
CREATE DATABASE salon_category_service_db;
```

---

## 🧪 Testing

You can test APIs using:
- 🧪 **Postman**

---

## 📬 Contact

📧 Email: your.email@example.com  
🌐 GitHub: [itz-Hiru](https://github.com/itz-Hiru)

---

## 📄 License

This project is licensed under the **MIT License**. See the [LICENSE](./LICENSE) file for details.
