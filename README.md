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
