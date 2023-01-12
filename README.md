# Creación de una API con Springboot utilizando H2 como base de datos.

Acerca de H2

H2 es una base de datos relacional, ligera, y de código abierto. Puede integrarse en aplicaciones Java o ejecutarse en el modo cliente-servidor. Principalmente, la base de datos H2 se puede configurar para ejecutarse como base de datos en memoria, lo que significa que los datos no persistirán en el disco. No se usa para el desarrollo de producción, se utiliza principalmente para desarrollo y prueba.

Características de H2

- Aplicación de consola basada en navegador
- Es un motor de base de datos extremadamente rápido.
- Admite SQL estándar y API JDBC. También puede usar el controlador ODBC de PostgreSQL.
- Es una base de datos y tablas basadas en disco o en memoria, soporte de base de datos de solo lectura, tablas temporales.
- H2 admite la agrupación en clústeres y la simultaneidad de varias versiones.
- Tiene fuertes características de seguridad.
- Admite cifrado (AES), cifrado de contraseña SHA-256, funciones de cifrado y SSL.


Pasos para crear la API

1- Crear el proyecto en https://start.spring.io/

![2023-01-12_11h43_57](https://user-images.githubusercontent.com/72228855/212097041-8854f277-3c2a-4e5c-be89-5dd311bd6688.png)

2- Una vez que descargamos el proyecto y lo abrimos con intelliJ creamos los siguientes paquetes que se señalan en la imagen:

![2023-01-12_11h49_55](https://user-images.githubusercontent.com/72228855/212098766-ceed1625-cb2b-438b-b79a-a5156d4f58f4.png)

3- Luego vamos al archivo application.properties ubicado en el directorio resources, y allí vamos a configurar la conexión a la BD

![2023-01-12_11h57_34](https://user-images.githubusercontent.com/72228855/212100593-c13ed99b-bcb2-4d01-8560-9d97a625da64.png)

4- Para acceder a la BD vamos a correr el servidor en la opción Spring-Boot:run  localhost:8080/h2-console

![2023-01-12_13h28_52](https://user-images.githubusercontent.com/72228855/212125618-e31ea8e6-40fd-4446-b7b6-82831e5e0cb6.png)

5- Luego en escribimos localhost:8080/h2-console en la barra del navegador para poder acceder a la interfaz de la BD

![2023-01-12_13h36_21](https://user-images.githubusercontent.com/72228855/212126436-cc783b87-3154-4951-9cb1-c07af1343eae.png)

6- Una vez que clickeamos en el botón Conectar veremos la siguiente interfaz desde la cual podremos manipular la BD

![2023-01-12_13h43_54](https://user-images.githubusercontent.com/72228855/212128466-5424c69b-7bd8-4079-b3a2-754c4cdbfba5.png)

7- Ahora procederemos a probar agregar usuarios probando con POSTMAN los endpoints definidos para este ejercicio

https://youtu.be/Ec6UeDSVXQs















