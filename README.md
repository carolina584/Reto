# Reto
Automatización en pet store

ID: “PFA_01_QAN”

Comenzando 🚀 Estas instrucciones te permitirán conocer las tecnologias y herramientas utilizadas en la automatizacion.

Pre-requisitos 📋 Tener instalado JDK y Jre con las versiones 11.0.23
las cuales se ubican en esta ruta cuando se instala el programa: C:\Program Files\Java\jdk1.11.0.23 --> C:\Program Files\Java\jre1.11.0.23
y Gradle: 5.2.1

El sistema operativo usado es Windows 11 Pro 64 bits, procesador basado en x64,
, IntelliJ IDEA 2024, Navegador utilizado Google Chrome 127.x
ChromeDriver: 127.0.6533.119

Instalación 🔧 --Configurar las variables de entorno de JAVA (jdk y jre) en la variable path. Configurar variable de entorno de Gradle

Ejecutando las pruebas ⚙️ --Se debe correr el comando Gradle clean test aggregate para ejecutar la prueba automatizada --Gradle: especifca que vamos a utilizar gradle --clean: Limpia la prueba para generar una nueva -- test: corre la automatizacion --aggregate: Genera el reporte de las pruebas con Serenity Report

Construido con 🛠️ ---> Se utilizan las dependencias de Serenity core ---> Serenity con Junit, Serenity con Cucumber ----> Serenity WebDriver con version 2.0.90 

Comando para clonar proyecto en repositorio:
git clone urlRepositorio
