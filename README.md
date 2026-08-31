# Trabajo de Ciclos

## Integrantes

* Juan Manuel Castro
* Luis Alejandro Monsalve

## Descripción

Este proyecto tiene como objetivo aplicar los conceptos de ciclos vistos en clase mediante el desarrollo de dos programas. El trabajo incluye un juego y un segundo programa, además de una presentación en la que se responden las preguntas planteadas por el profesor.

## Objetivos

* Comprender el funcionamiento de los ciclos.
* Aplicar ciclos `for`, `while` y/o `do-while`.
* Desarrollar programas utilizando estructuras repetitivas.
* Resolver problemas mediante la lógica de programación.
* Explicar el funcionamiento de los programas desarrollados.

## Programa 1: Juego

### Descripción

En este programa se desarrolló un juego utilizando estructuras de repetición. El usuario puede interactuar con el programa y realizar diferentes acciones hasta que se cumpla la condición establecida para finalizar el juego.

### Ciclos utilizados

* `while`
* `for`
* `do-while`

### Funcionamiento

El programa solicita información al usuario y utiliza ciclos para controlar las diferentes acciones del juego. El ciclo permite que el programa continúe ejecutándose hasta que se cumpla la condición de finalización.

## Programa 2

### Descripción

El segundo programa tiene como finalidad aplicar nuevamente los conceptos de ciclos mediante la solución de un problema de programación.

### Ciclos utilizados

* `while`
* `for`
* `do-while`

# Ciclos en Java — Teoría 1/3

### 1. ¿Cuál es la diferencia entre un ciclo `for`, `while` y `do-while`?

* **`for`**: Se utiliza cuando se conoce o se puede controlar fácilmente el número de repeticiones.
* **`while`**: Repite el bloque mientras una condición sea verdadera. La condición se evalúa antes de ejecutar.
* **`do-while`**: Similar a `while`, pero garantiza que el bloque se ejecute **al menos una vez**, porque la condición se evalúa al final.

### 2. ¿Qué es un ciclo infinito y cómo se puede evitar?

Un ciclo infinito ocurre cuando la condición del ciclo siempre permanece verdadera y nunca termina. Se puede evitar asegurando que la condición pueda llegar a ser falsa y actualizando correctamente la variable de control.

### 3. ¿Cómo se pueden anidar ciclos en Java?

Se pueden colocar uno o más ciclos dentro de otro ciclo. Por ejemplo, un `for` puede contener otro `for`. El ciclo interno se ejecuta completamente por cada repetición del ciclo externo.

### 4. ¿Qué es el alcance de una variable dentro de un ciclo?

Es la parte del código donde una variable puede ser utilizada. Una variable declarada dentro de un ciclo generalmente solo puede utilizarse dentro de ese bloque `{ }`.

## Ciclos — Teoría 2/3

### 5. Explique 3 palabras reservadas que se pueden usar en un ciclo

* **`break`**: Termina inmediatamente el ciclo.
* **`continue`**: Salta la iteración actual y continúa con la siguiente.
* **`return`**: Termina el método en el que se encuentra, interrumpiendo también el ciclo.

### 6. ¿Cómo se pueden usar los ciclos para procesar datos de entrada del usuario?

Los ciclos permiten solicitar y procesar datos varias veces. Por ejemplo, se puede pedir al usuario que ingrese números hasta que introduzca un valor específico que indique que desea terminar.

### 7. ¿Qué es un contador? ¿Qué tipos de variables de control conoce?

Un **contador** es una variable que aumenta o disminuye para controlar el número de repeticiones de un ciclo.

Algunas variables de control comunes son:

* **Contador:** cuenta las repeticiones (`i++`).
* **Acumulador:** suma o acumula valores.
* **Bandera (flag):** controla el ciclo mediante valores booleanos (`true`/`false`).
* **Variable centinela:** permite terminar el ciclo cuando se introduce un valor específico.

### 8. ¿Qué es una secuencia de escape? ¿Cómo se usa para resolver este taller?

Una **secuencia de escape** es una combinación de caracteres que representa una acción o carácter especial dentro de una cadena de texto.

Algunas comunes en Java son:

* `\n` → salto de línea.
* `\t` → tabulación.
* `\"` → comillas dobles.
* `\\` → barra invertida.

En este taller pueden utilizarse, principalmente, para organizar y presentar los resultados de los programas de forma clara.

### Funcionamiento

El programa recibe los datos necesarios, procesa la información mediante estructuras repetitivas y muestra el resultado correspondiente.

## Presentación

En la presentación se responden las preguntas propuestas para el trabajo y se explica el funcionamiento de los programas, haciendo énfasis en el uso de los ciclos y en la lógica utilizada para solucionar cada problema.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA / Visual Studio Code
* GitHub

## Ejecución

1. Descargar o clonar el repositorio.
2. Abrir el proyecto en el entorno de desarrollo.
3. Ejecutar el archivo correspondiente a cada programa.
4. Seguir las instrucciones que aparecen en la consola.

## Conclusión

El desarrollo de estos programas permitió poner en práctica el uso de ciclos y estructuras repetitivas. Mediante los ejercicios se logró comprender cómo utilizar estas herramientas para automatizar procesos, repetir instrucciones y controlar el flujo de un programa.

Además, el trabajo permitió fortalecer la lógica de programación y comprender la importancia de elegir correctamente el tipo de ciclo dependiendo del problema que se desea resolver.
