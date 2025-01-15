# 📗 LiterAlura
## 📖 Descripción
**LiterAlura** es una aplicación de consola creada con **Java** y **Spring**, diseñada para consultar y obtener información detallada sobre una amplia variedad de libros, incluyendo datos como el título, autor, cantidad de descargas y más. La aplicación hace uso de la **API de Gutendex** para acceder a esta información, facilitando la búsqueda y visualización de datos literarios de forma rápida y eficiente.

## ⚙️ Funcionamiento
El programa sigue los siguientes pasos:
1. Muestra un **menú interactivo** con diversas opciones:
   - **Buscar libro por título:** Realiza una búsqueda de libros según un título ingresado por el usuario y trae la mejor coincidencia.
   - **Listar libros registrados:** Muestra los libros que han sido buscado por el usuario.
   - **Listar autores registrados:** Presenta los autores cuyas obras están en la base de datos.
   - **Listar autores vivos en un año específico:** Permite consultar autores registradps que vivían en un año determinado.
   - **Listar libros por idioma:** Filtra los libros registrados según el idioma seleccionado.
   - **Salir:** Finaliza la aplicación.
2. El usuario selecciona una opción ingresando el número correspondiente.
3. El programa procesa la entrada del usuario y realiza una consulta a la API de Gutendex o a la base de datos, devolviendo los resultados correspondientes.
4. Los resultados se presentan de manera clara en la consola.

## 🎨 Vista previa
Aquí tienes una captura de pantalla del menú principal de la aplicación:

[![Vista Previa LiterAlura](https://i.postimg.cc/QCP1hF3f/Captura-de-pantalla-2025-01-14-230031.png)](https://postimg.cc/rR1K9Fz4)

## 🛠️ Requisitos previos
- **Java 8** o superior instalado en el sistema.
- **Spring Boot** configurado en tu entorno de desarrollo.
- Un IDE compatible con Java, como Visual Studio Code o IntelliJ IDEA.
- Acceso a Internet para conectarse a la API Gutendex.

## ✏️ Instrucciones de ejecución
1. **Descarga el archivo**: Desde la opción Code > Download ZIP, o puedes clonarlo para tenerlo de forma local:
    ```bash
    git clone https://github.com/EmiJordan11/LiterAlura.git
    ```
2. **Ábrelo en tu editor de código preferido** (Visual Studio Code, IntelliJ IDEA, etc.).
3. Configura las dependencias necesarias (por ejemplo, Maven o Gradle).
4. Ejecuta la aplicación desde el archivo principal del proyecto.

