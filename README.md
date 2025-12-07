# 🚀 Introducción a Kotlin: Conceptos Fundamentales

Este repositorio contiene ejemplos básicos y explicaciones sobre los **conceptos fundamentales del lenguaje de programación Kotlin**. Es un recurso útil para quienes están comenzando a explorar este lenguaje moderno.

---

## 📚 Contenido del Repositorio

El código dentro de este repositorio está organizado para ilustrar los siguientes temas clave de Kotlin:

### 1. Tipos de Datos (Data Types)

Exploración de los tipos de datos primarios utilizados en Kotlin, como **Integer** (`Int`, `Long`), **Floating-Point** (`Double`, `Float`), **Boolean** (`Boolean`), **Character** (`Char`), y **String** (`String`).

* **Enfoque:** Mostrar cómo se declaran y utilizan estos tipos de manera **implícita** y **explícita** en Kotlin.

### 2. Variables: `var` vs. `val` (Mutabilidad)

La diferencia fundamental entre declarar variables con `var` y `val` es un pilar en Kotlin.

* **`val` (Value):** Se utiliza para declarar una variable de **solo lectura** (inmutable). Una vez que se le asigna un valor, este no puede cambiar. Es el equivalente a `final` en Java.
* **``var` (Variable):** Se utiliza para declarar una variable **mutable**. Su valor puede ser reasignado en cualquier momento después de su declaración inicial.

**💡 Mejor Práctica:** En Kotlin, siempre se prefiere usar **`val`** (inmutabilidad) a menos que sea absolutamente necesario reasignar el valor de una variable.

### 3. Estructuras Condicionales (Conditionals)

Ejemplos de cómo controlar el flujo de ejecución de tu código.

* **`if-else`:** La estructura condicional tradicional. Kotlin permite usar `if-else` como una **expresión** para devolver un valor.
* **`when` (Reemplazo de `switch`):** El reemplazo de Kotlin para la declaración `switch` de otros lenguajes. Es mucho más flexible y potente, permitiendo usarlo también como una expresión.

### 4. Funciones (Functions)

Demostraciones de cómo definir y utilizar bloques de código reutilizables.

* **Definición Básica:** Cómo declarar funciones con la palabra clave `fun`.
* **Funciones con Parámetros:** Cómo pasar argumentos y especificar sus tipos.
* **Funciones con Valor de Retorno:** Cómo indicar el tipo de dato que la función devolverá.
* **Funciones de una sola expresión (Single-Expression Functions):** Una forma concisa de definir funciones cuyo cuerpo es una sola línea, utilizando el operador de asignación (`=`).

---

## 🛠️ Requisitos

Para compilar y ejecutar el código de ejemplo, necesitarás tener instalado:

* **JDK (Java Development Kit)**
* **Kotlin Compiler** (Generalmente incluido en IDEs como IntelliJ IDEA o Android Studio)

