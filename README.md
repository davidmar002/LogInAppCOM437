
LoginAppCOM437

LoginAppCOM437 es una aplicación de ejemplo para Android desarrollada en Kotlin, que implementa un sistema completo de inicio de sesión y registro de usuarios utilizando Firebase Authentication. La aplicación proporciona una base funcional para proyectos que requieren autenticación real de usuarios mediante correo electrónico y contraseña.

Funcionalidades principales

La aplicación cuenta con una pantalla de inicio de sesión conectada a Firebase, donde los usuarios pueden autenticarse con su correo electrónico y contraseña. Incluye también una pantalla de registro que permite crear nuevas cuentas directamente en Firebase Authentication. Una vez iniciada la sesión, el usuario es dirigido a una pantalla de acceso exitoso que muestra su nombre de usuario, correo electrónico, una imagen de perfil de ejemplo y un menú de opciones visuales (Ver perfil, Cuenta, Configuración, Ir a inicio, Notificaciones y Seguridad). Esta pantalla también incluye un botón para cerrar sesión de forma segura.

La vista de inicio de sesión incorpora íconos de redes sociales (Facebook, Instagram y LinkedIn) que, al ser presionados, redirigen al navegador web hacia las páginas oficiales correspondientes, únicamente con fines estéticos y de navegación externa. La interfaz utiliza fondos oscuros, contenedores con bordes redondeados y estilos personalizados.

Estructura del proyecto

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
│   │       ├── drawable/
│   │       │   ├── rounded_container.xml
│   │       │   ├── rounded_item.xml
│   │       │   ├── profile_circle_bg.xml
│   │       │   ├── facebook.png
│   │       │   ├── instagram.png
│   │       │   └── linkedin.png
│   │       └── values/
│   │           └── styles.xml
│   └── AndroidManifest.xml
└── build.gradle

Tecnologías utilizadas

El proyecto está desarrollado principalmente en Kotlin. Se utiliza Firebase Authentication para la autenticación de usuarios. Android Studio es el entorno de desarrollo principal y XML es utilizado para el diseño de las interfaces. La aplicación es compatible con Android 8.0 (API 26) en adelante.

Instalación del proyecto

Para clonar el repositorio se puede utilizar el siguiente comando:

git clone [https://github.com/tu-usuario/LoginAppCOM437.git](https://github.com/tu-usuario/LoginAppCOM437.git)

Posteriormente, se debe abrir el proyecto en Android Studio, sincronizar Gradle, configurar Firebase agregando el archivo google-services.json y ejecutar la aplicación en un emulador o dispositivo físico.

Uso de la aplicación

El usuario puede registrarse desde la pantalla de registro utilizando un correo electrónico válido y una contraseña. Posteriormente puede iniciar sesión desde la pantalla principal. Al iniciar sesión de forma correcta, se muestra la pantalla de acceso exitoso con los datos del usuario y un menú visual de opciones. El botón "Salir" cierra la sesión y regresa al login.

Los íconos de redes sociales redirigen al navegador web a sus respectivas páginas oficiales.

Próximos pasos y mejoras

Como mejoras futuras se contempla almacenar información adicional del usuario en Firebase Firestore o Realtime Database, implementar recuperación de contraseña, validaciones avanzadas de formularios, mejoras de seguridad, lógica real para el menú de opciones y personalización del perfil del usuario.

Licencia

Este proyecto está bajo la licencia MIT License.
