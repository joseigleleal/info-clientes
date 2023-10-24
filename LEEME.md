# Proyecto de Consulta de Información de Clientes

Este proyecto Java es una aplicación que proporciona un servicio REST para consultar información básica de un cliente. La aplicación está diseñada para manejar solicitudes con diferentes tipos de documentos y números de documento. La información del cliente se almacena en una base de datos simulada y se retorna en formato JSON.

## Configuración del Proyecto

1. **Descargar el Proyecto:** Descargar el proyecto en tu máquina local.

2. **Requisitos Previos:**

    - [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
    - [Apache Maven](https://maven.apache.org/)

3. **Configuración del Puerto:**

    - Asegúrate de que el puerto de la aplicación sea el **8090** en el archivo `application.properties`.

## Uso

- **Consultar Información de Cliente:**

    - **URL:** `/cliente`
    - **Método:** `GET`
    - **Parámetros de Solicitud:**
        - `tipoDocumento` (cadena): Tipo de documento (C para cédula de ciudadanía, P para pasaporte).
        - `numeroDocumento` (cadena): Número de documento del cliente.

    - **Respuesta Exitosa (Código 200):**
        - Si el cliente se encuentra en la base de datos, la aplicación responderá con la información del cliente en formato JSON.

    - **Respuestas de Error (Códigos 400, 404):**
        - La aplicación maneja solicitudes incorrectas y recursos no encontrados, y responderá con los códigos de estado apropiados.

## Dependencias

Este proyecto utiliza las siguientes tecnologías y dependencias:

- Spring Boot: Framework de desarrollo de aplicaciones Java.
- Spring MVC: Modelo-Vista-Controlador para construir aplicaciones web.
- Mockito: Biblioteca para crear objetos simulados para pruebas.
- Spring Test: Módulo de prueba de Spring para pruebas unitarias y de integración.

## Contacto

Si tienes alguna pregunta o comentario, no dudes en contactarnos.

[Correo Electrónico](mailto:joseigleleal@gmail.com)
