# 📚 REST Book API con Quarkus

Este es un proyecto de ejemplo construido con **[Quarkus](https://quarkus.io/)** que expone un API RESTful simple para gestionar libros. Es ideal como base para desarrollos modernos en Java con enfoque cloud-native.

---

## 🚀 Tecnologías utilizadas

- **Quarkus 3.24.1**
- **Java 21**
- **RESTEasy + JSON-B**
- **Maven**
- **Docker (build de imagen nativa)**
- **Junit5 + RestAssured (para pruebas)**

---

## 📦 Estructura del proyecto

```
src/
├── main/
│   ├── java/org/gmendoza/quarkus/starting/
│   │   ├── Book.java
│   │   ├── BookRepository.java
│   │   └── BookResource.java
│   └── resources/
│       └── application.properties
├── test/
│   └── java/org/gmendoza/quarkus/starting/
│       ├── BookResourceTest.java
│       └── BookResourceIT.java
```

---

## 🛠️ Cómo ejecutar el proyecto

### Requisitos:
- Java 21
- Maven 3.9+
- Docker (opcional para imagen nativa)

### Modo desarrollo
```bash
./mvnw quarkus:dev
```

### Empaquetado tradicional
```bash
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
```

### Compilación nativa con Docker
```bash
./mvnw package -Dquarkus.package.type=native -Dquarkus.container-image.build=true
```

---

## 📑 Endpoints disponibles

- `GET /books` → Listar libros
- `POST /books` → Crear un libro
- `GET /books/{id}` → Obtener un libro por ID
- `DELETE /books/{id}` → Eliminar un libro

*(Definidos en `BookResource.java`)*

---

## ✅ Pruebas

Este proyecto incluye pruebas unitarias y de integración usando JUnit 5 y RestAssured.

```bash
./mvnw test
```

---

## 🐳 Docker (Imagen Nativa)

El proyecto está configurado para crear imágenes nativas utilizando el plugin `quarkus-container-image-docker`. Asegúrate de tener Docker instalado y ejecutándose.

```bash
./mvnw clean package -Dquarkus.package.type=native -Dquarkus.container-image.build=true
```

---

