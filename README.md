
# Conversor de Monedas

Este proyecto fue desarrollado con el objetivo de facilitar la conversión entre distintas monedas utilizando el lenguaje de programación Java. La aplicación realiza consultas a una API que proporciona los tipos de cambio actualizados en tiempo real, lo cual permite que las conversiones sean precisas y confiables.

## Descripción general

El conversor de monedas funciona a través de una interfaz gráfica sencilla basada en cuadros de diálogo. El usuario puede seleccionar las monedas de origen y destino, ingresar la cantidad deseada y obtener de inmediato el valor convertido. Además, cada conversión que se realiza queda registrada en un archivo de texto, el cual puede ser consultado posteriormente como historial.

Este tipo de aplicaciones es útil para tareas básicas de consulta financiera, simulaciones de cambio de divisas, ejercicios de práctica en programación y proyectos educativos.

## Características

- Permite convertir montos entre monedas como dólar estadounidense (USD), peso mexicano (MXN) y euro (EUR).
- El sistema consulta valores actuales de cambio directamente desde internet.
- Guarda automáticamente un registro de cada conversión realizada, indicando fecha, hora y resultado.
- Interfaz directa, sin complicaciones, adecuada para usuarios que están comenzando a trabajar con Java.

## Requisitos técnicos

Para ejecutar correctamente este proyecto, se necesita:

- Tener instalado Java en la versión 8 o superior.
- Contar con conexión a internet para obtener los valores del tipo de cambio.
- Utilizar un entorno de desarrollo compatible con Java, como Visual Studio Code, IntelliJ IDEA o Eclipse.
- Importar al proyecto la librería que permite leer datos en formato JSON desde la API.

## Instrucciones para uso

1. Descargar el repositorio desde: https://github.com/avril3o
2. Abrir el proyecto en el entorno de desarrollo.
3. Ejecutar la clase principal desde el módulo correspondiente.
4. Elegir la moneda de origen.
5. Ingresar la cantidad de dinero a convertir.
6. Seleccionar la moneda de destino.
7. Visualizar el resultado en la ventana emergente.
8. Revisar el historial de conversiones en el archivo generado si es necesario.
9. Finalizar la ejecución desde la opción correspondiente del menú.

## Observaciones

Este proyecto fue elaborado como parte de una etapa de aprendizaje técnico y tiene como finalidad desarrollar habilidades prácticas con Java, manejo de datos externos y estructuras básicas de interfaz. Aunque es un proyecto funcional, puede ser ampliado con nuevas funcionalidades como soporte para más monedas, gráficos de tendencias o mejoras visuales en la interfaz.

## Agradecimientos

Se reconoce el contenido formativo provisto por Alura, que sirvió como guía técnica para estructurar y desarrollar el programa.
