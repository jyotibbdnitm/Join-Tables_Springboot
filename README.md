# Join-Tables_Springboot

A Spring Boot application demonstrating how to **join multiple tables using JPA/Hibernate** with **MySQL**. This project uses a **Student-Course-Enrollment** example to showcase `OneToMany`, `ManyToOne`, and `ManyToMany` relationships.

---

## Features

- Create, read, and manage **students**, **courses**, and **enrollments**  
- Demonstrates **entity relationships** with JPA  
- Supports **MySQL database integration**  
- Populates sample data on application startup  
- RESTful APIs for interacting with data  

---

## Tech Stack

- **Java 17+**  
- **Spring Boot 3.2**  
- **Spring Data JPA / Hibernate**  
- **MySQL 8**  
- **Lombok**  
- **Maven**  

---

## Database Schema

**Tables:**

1. **Student**
   - `id` (PK)
   - `name`
   
2. **Course**
   - `id` (PK)
   - `title`
   
3. **Enrollment**
   - `id` (PK)
   - `student_id` (FK → Student)
   - `course_id` (FK → Course)
   - `semester`

**Relationships:**
- Student ↔ Enrollment → `OneToMany / ManyToOne`  
- Course ↔ Enrollment → `OneToMany / ManyToOne`  
- Student ↔ Course → `ManyToMany` via Enrollment  

---

## Setup Instructions

1. Clone the repository:
```bash
git clone https://github.com/yourusername/spring-boot-join-example.git
cd spring-boot-join-example
