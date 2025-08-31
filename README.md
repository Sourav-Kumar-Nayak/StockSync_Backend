# 📦 StockSync_Backend

StockSync_Backend is the **Spring Boot backend** for **StockSync**, a Warehouse Management System (WMS).  
It provides secure REST APIs for managing inventory, suppliers, warehouses, and orders to ensure smooth warehouse operations.

---

## ✨ Features

- 🔐 **Authentication & Authorization** (Spring Security + JWT)
- 📊 **Inventory Management** – Track stock levels, add/update/delete items
- 🚚 **Supplier & Order Management**
- 🏭 **Multi-Warehouse Support**
- 📦 **Low Stock Alerts**
- 📈 **Reports & Analytics**
- 🌐 **RESTful APIs** for Angular frontend integration

---

## 🛠️ Tech Stack

- **Language**: Java 21
- **Framework**: Spring Boot 3.x
- **Database**: PostgreSQL 
- **ORM**: Hibernate / JPA
- **Security**: Spring Security + JWT
- **Build Tool**: Maven 
- **API Testing**: Postman 

---

## 📂 Project Structure
├── src/main/java/com/stocksync/backend/
│ ├── config/ # Security & app configurations
│ ├── controllers/ # REST API controllers
│ ├── dto/ # Data Transfer Objects
│ ├── entities/ # JPA entities
│ ├── exceptions/ # Custom exception handling
│ ├── repositories/ # JPA repositories
│ ├── services/ # Business logic layer
│ └── StockSyncApp.java # Main Spring Boot application
├── src/main/resources/
│ ├── application.properties (or application.yml)
│ └── data.sql / schema.sql (optional seeds)
├── pom.xml
└── README.md
