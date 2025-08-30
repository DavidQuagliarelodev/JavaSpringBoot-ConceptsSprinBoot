# 🚀 ConceptsSpringBoot Project

## 📌 Purpose
This project was developed as a study to demonstrate the use of **Spring Boot** and **Swagger** for creating a simple and functional **REST API**.

---

## 🛠 Technologies Used
- ☕ **Java**
- 🌱 **Spring Boot**
- 📦 **Maven**
- 📄 **Swagger**

---

## 📚 Resources and Dependencies
- **Spring Web**
- **Spring DevTools**
- **Lombok**
- **OpenApi**

---

## ▶️ How to Run the Project

1. Clone this repository and navigate to the project folder:
   ```bash
   git clone <repository-url>
   cd ConceptsSpringBoot
   ```

2. Run the application with Maven:
   ```bash
   mvn spring-boot:run
   ```

3. The application will be available at:  
   👉 `http://localhost:3000`

---

## 🌐 Available Endpoints

### 🔹 GET `/user`
Returns all user data.

### 🔹 GET `/user/{id}`
Returns one user for id data.

### 🔹 POST `/user`
Creates a new user in fake db/repository in memory.

---

## 📝 Example of POST Request

**URL:**  
`http://localhost:3000/user`

**Body (JSON):**
```json
{
  "id" : 1,
  "name": "David",
  "email": "david@gmail.com"
}
```

---

## 🧪 How to Test the API

1. Use **Postman**, **Insomnia**, or any other tool of your choice to send requests.
2. Send requests to the endpoints listed above.
3. Check the responses returned by the API.

---

## 📖 Notes
- This project is intended solely for study and practice with **Spring Boot**.
- Suggestions and improvements are always welcome! 😃
