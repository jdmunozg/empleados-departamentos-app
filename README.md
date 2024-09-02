# Empleados-Departamentos App

Este es un proyecto de aplicación web Java para gestionar empleados y departamentos. La aplicación utiliza JavaServer Faces (JSF) y PrimeFaces para la interfaz de usuario, y se implementa utilizando el servidor de aplicaciones WildFly. La persistencia de datos se maneja con JPA y Hibernate, y utiliza una base de datos en memoria H2.

## Requisitos Previos

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes componentes en tu sistema:

1. **Java Development Kit (JDK) 11 o superior**: Puedes descargarlo de [AdoptOpenJDK](https://adoptopenjdk.net/) o [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. **Apache Maven 3.6.0 o superior**: Puedes descargarlo de [Maven](https://maven.apache.org/download.cgi).
3. **WildFly 26.0.1 o superior**: Puedes descargarlo de [WildFly](https://wildfly.org/downloads/).

## Configuración del Entorno

### 1. Configurar `JAVA_HOME`

Asegúrate de que la variable de entorno `JAVA_HOME` esté configurada en tu sistema. Debe apuntar al directorio de instalación del JDK.

Para configurarlo en Windows:

1. Abre el Panel de Control y navega a **Sistema y Seguridad** -> **Sistema** -> **Configuración avanzada del sistema**.
2. Haz clic en **Variables de entorno**.
3. En la sección **Variables del sistema**, haz clic en **Nueva...**.
   - **Nombre de la variable:** `JAVA_HOME`
   - **Valor de la variable:** Ruta de tu instalación de JDK, por ejemplo, `C:\Program Files\Java\jdk-11`.

4. Añade `%JAVA_HOME%\bin` a la variable de entorno `Path`.

### 2. Configurar `WILDFLY_HOME`

Configura la variable de entorno `WILDFLY_HOME` para que apunte al directorio donde has descomprimido WildFly.

1. Ve a **Sistema** -> **Configuración avanzada del sistema** -> **Variables de entorno**.
2. En **Variables del sistema**, haz clic en **Nueva...**.
   - **Nombre de la variable:** `WILDFLY_HOME`
   - **Valor de la variable:** Ruta de tu instalación de WildFly, por ejemplo, `C:\wildfly-26.0.1.Final`.

### 3. Configuración de Maven

Asegúrate de que Maven esté instalado y configurado correctamente. Añade el directorio `bin` de Maven a tu variable de entorno `Path`.

## Compilar y Empaquetar la Aplicación

1. Clona el repositorio o descarga el proyecto a tu máquina local.

   ```bash
  https://github.com/jdmunozg/empleados-departamentos-app.git
Navega al directorio del proyecto:
- cd empleados-departamentos-app
Ejecuta Maven para compilar y empaquetar la aplicación:
- mvn clean package
Desplegar la Aplicación en WildFly
Asegúrate de que WildFly esté detenido antes de desplegar la aplicación.

Inicia sesión en la consola de administración de WildFly o utiliza el script de línea de comandos para detener el servidor:
- %WILDFLY_HOME%\bin\jboss-cli.bat --connect command=:shutdown
Copia el archivo WAR generado (empleados-departamentos-app-1.0-SNAPSHOT.war) en el directorio de despliegue de WildFly:
- cp target/empleados-departamentos-app-1.0-SNAPSHOT.war %WILDFLY_HOME%\standalone\deployments\
Inicia WildFly:
- %WILDFLY_HOME%\bin\standalone.bat
WildFly desplegará automáticamente el archivo WAR al iniciar. Verás mensajes de despliegue exitoso en la consola.

Acceder a la Aplicación
Abre un navegador web y navega a la siguiente URL para acceder a la aplicación:
http://localhost:8080/empleados-departamentos-app-1.0-SNAPSHOT/index.xhtml
Si todo está configurado correctamente, deberías ver la página de inicio de tu aplicación.

Problemas Comunes y Soluciones
Error 404 - Not Found
Si recibes un error 404 - Not Found, verifica los siguientes puntos:

Asegúrate de que el archivo WAR se haya desplegado correctamente en WildFly (standalone\deployments).
Verifica los logs de WildFly en WILDFLY_HOME\standalone\log\server.log para identificar cualquier problema durante el despliegue.
Asegúrate de que la estructura del proyecto siga las convenciones estándar de aplicaciones web.
Error ClassNotFoundException: javax.faces.webapp.FacesServlet
Asegúrate de que las dependencias de JSF estén correctamente configuradas en tu pom.xml.
Verifica que WildFly tenga el módulo de JSF habilitado en standalone.xml.

### **Notas Finales**

- Este archivo `README.md` proporciona instrucciones claras para configurar, construir, desplegar y ejecutar tu aplicación en un entorno WildFly.
- Asegúrate de personalizar el enlace de descarga del repositorio si el proyecto se encuentra en un repositorio específico.
- Las secciones de problemas comunes y soluciones pueden expandirse según los problemas específicos que encuentres durante el desarrollo.

Si necesitas más información o encuentras otros problemas, ¡no dudes en preguntar!
