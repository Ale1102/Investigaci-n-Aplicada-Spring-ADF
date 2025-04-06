# Investigaci-n-Aplicada-Spring-ADF
# Demo de Registro con Spring Web Flow

## Descripción General

Este proyecto demuestra la implementación de un proceso de registro en múltiples pasos utilizando Spring Web Flow. Muestra cómo crear una interfaz de usuario tipo asistente con navegación hacia adelante y hacia atrás, validación y persistencia de datos.

## Tecnologías Utilizadas

- **Spring Boot** 2.7.0
- **Spring Web Flow** 2.5.1
- **Spring Data JPA**
- **Thymeleaf** para plantillas del lado del servidor
- **Base de datos H2 y Mysql** para almacenamiento de datos en memoria
- **Lombok** para reducir código repetitivo
- **Maven** para gestión de dependencias

## Estructura del Proyecto

## src/main/
# ├── java/com/example/webflow/
# │   ├── config/
# │   │   └── WebFlowConfig.java         # Configuración de Spring Web Flow
# │   ├── controller/
# │   │   ├── HomeController.java        # Controlador principal para redirecciones
# │   │   └── RegistrationController.java # Controlador para el flujo de registro
# │   ├── model/
# │   │   └── User.java                  # Entidad Usuario
# │   ├── repository/
# │   │   └── UserRepository.java        # Repositorio JPA
# │   ├── service/
# │   │   └── UserService.java           # Capa de servicio
# │   └── WebFlowDemoApplication.java    # Clase principal de la aplicación
# └── resources/
# ├── flows/
# │   └── registration-flow.xml      # Definición del flujo
# ├── templates/
# │   ├── registration/
# │   │   ├── personal-info.html     # Paso 1: Formulario de información personal
# │   │   ├── review-info.html       # Paso 2: Revisión de información
# │   │   ├── registration-complete.html # Página de éxito
## │   │   ├── registration-error.html    # Página de error
## │   │   └── registration-cancelled.html # Página de cancelación
## │   └── error.html                 # Página de error genérica
## └── application.properties         # Configuración de la aplicación
