
LoginAppCOM437

LoginAppCOM437 es una aplicación de ejemplo para Android desarrollada con Kotlin y Java, que implementa un sistema básico de inicio de sesión y registro de usuarios. La aplicación está preparada para futuras integraciones con Firebase Authentication.

Funcionalidades principales

La aplicación incluye una pantalla de inicio de sesión con validación básica, una pantalla de registro de usuarios, y una pantalla que indica inicio de sesión exitoso, mostrando foto de perfil, nombre de usuario, correo electrónico y un menú de opciones de ejemplo (Ver perfil, Cuenta, Configuración, Ir a inicio, Notificaciones y Seguridad). También cuenta con un botón para salir de la sesión y regresar a la pantalla de login. La interfaz utiliza un fondo oscuro y tarjetas con bordes redondeados y contornos personalizados.

En cuanto a la estructura del proyecto, de momento es la siguiente:

LoginAppCOM437/
│
├── app/
│   ├── src/main/
│   │   ├── java/com/example/loginappcom437/
│   │   │   ├── MainActivity.kt
│   │   │   ├── RegisterActivity.kt
│   │   │   └── SuccessActivity.kt
│   │   └── res/
│   │       ├── layout/
│   │       │   ├── activity_main.xml
│   │       │   ├── activity_register.xml
│   │       │   └── activity_success.xml
│   │       └── drawable/
│   │           ├── rounded_container.xml
│   │           ├── rounded_item.xml
│   │           ├── profile_circle_bg.xml
│   │           └── ic_profile_placeholder.xml
│   └── AndroidManifest.xml
│
└── build.gradle

La aplicación se desarrolla principalmente en Kotlin, con Java opcional. Se utiliza Android Studio como IDE y XML para el diseño de la interfaz de usuario. La app es compatible con Android 7.0 (API 24) en adelante.

Si gusta clonar el repositorio: git clone https://github.com/tu-usuario/LoginAppCOM437.git

Ingresar credenciales de prueba:

Usuario: admin

Contraseña: 1234

Si las credenciales son correctas, se muestra la pantalla de inicio de sesión exitoso con el menú de ejemplo. Es posible acceder a la pantalla de registro haciendo clic en “Regístrate” desde la pantalla de login. Presionar “Salir” regresa a la pantalla de inicio de sesión.


Próximos pasos y mejoras

Se planea integrar Firebase Authentication, guardar datos de usuarios en Firebase Realtime Database o Firestore, implementar validaciones avanzadas y mejorar el diseño usando Material Design Components. También se añadirá funcionalidad real al menú de la pantalla de inicio de sesión exitoso.

Licencia

Este proyecto está bajo la licencia MIT License.


