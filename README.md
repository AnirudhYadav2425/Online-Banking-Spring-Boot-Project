# 💳 Online Banking System – Java, OOP Concepts

## 📌 Overview
This is a modular and scalable **Online Banking System** developed using **Java (Spring Boot)** and key **OOP principles**. It supports secure banking operations with structured modules and RESTful architecture.

---

## 🧩 Modular Structure

Each of the following modules includes:
- **Entity**, **Controller**, **Service**, and **Repository** (extends `JpaRepository`) layers.
- Validation using annotations like `@NotBlank`, `@Email`, and `@Pattern`.

### 📦 Modules:
- **User**
- **Admin**
- **Account**
- **Bank**
- **Transaction**
- **Debit Card**

---

## 🔐 Core Features

- ✅ **Role-based Access Control (RBAC):** Separate functionalities for Users and Admins.
- 🔄 **Transaction Tracking:** Complete monitoring of deposits, withdrawals, and transfers.
- 💳 **Debit Card Management:** Secure handling of CVV, expiry date, and linked accounts.
- 🛡️ **JWT Authentication:** Secures API endpoints and user sessions.
- ⚠️ **Global Exception Handling:** Consistent error management across all layers.

---

## 🛠️ Tech Stack

- **Backend:** Java 17, Spring Boot
- **Database:** PostgreSQL / H2 (for testing)
- **Security:** Spring Security + JWT
- **Validation:** Javax Validation API

---

## 📅 Project Timeline
- Developed: **May 2025**
- Focus: Hands-on implementation of OOP principles, Spring layers, and secure architecture

---

## 📁 How to Run
1. Clone the repo
2. Configure DB in `application.properties`
3. Run the Spring Boot application
4. Use Postman/Swagger for testing APIs

---

## 📬 Contact
For any queries, reach out via Email : yanirudh668@gmail.com or GitHub profile : https://github.com/AnirudhYadav2425.
