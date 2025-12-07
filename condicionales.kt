val a = 10
val b = 20

// 'max' toma el valor de la rama que se ejecuta
val max = if (a > b) {
    println("a es el máximo")
    a // Se devuelve 'a'
} else {
    println("b es el máximo")
    b // Se devuelve 'b'
}

println("El máximo es: $max") // Salida: El máximo es: 20

//ejemplo de if else

val temperatura = 30

if (temperatura > 35) {
    println("Hace demasiado calor.")
} else if (temperatura >= 20) {
    println("Temperatura agradable.")
} else {
    println("Hace frío.")
}

//bucles condicionales 
//while loop lo que hace es ejecutar un bloque de codigo mientras una condicion sea verdadera
var i = 0
while (i < 3) {
    println("While Loop: $i")
    i++
}
// Salida:
// While Loop: 0
// While Loop: 1
// While Loop: 2

//do while loop lo que hace es ejecutar un bloque de codigo al menos una vez y luego verifica la condicion
var j = 0
do {
    println("Do-While Loop: $j")
    j++
} while (j < 3)
// Salida:
// Do-While Loop: 0
// Do-While Loop: 1
// Do-While Loop: 2


//for loop itera sobre una secuencia de valores
for (k in 0 until 3) {
    println("For Loop: $k")
}

// Rango inclusivo
for (numero in 1..3) {
    print("$numero ")
} // Salida: 1 2 3
println()

// Rango exclusivo
for (numero in 1 until 3) {
    print("$numero ")
} // Salida: 1 2


//iterando sobre colecciones
val frutas = listOf("Manzana", "Pera", "Naranja")

// Iterar sobre los valores
for (fruta in frutas) {
    println("Me gusta la $fruta")
}

// Iterar sobre índices y valores (usando 'indices' o 'withIndex()')
for (i in frutas.indices) {
    println("Índice $i: ${frutas[i]}")
}


//uso del when como una alternativa al if else if
val dia = 3
when (dia) {
    1 -> println("Lunes")
    2 -> println("Martes")
    3 -> println("Miércoles")
    4 -> println("Jueves")
    5 -> println("Viernes")
    6 -> println("Sábado")
    7 -> println("Domingo")
    else -> println("Día inválido")
}   
// Salida: Miércoles

// Uso de 'when' como expresión
val resultado = when (dia) {
    1 -> "Inicio de la semana"
    5 -> "Casi fin de semana"
    in 6..7 -> "Fin de semana"
    else -> "Día entre semana"
}
println(resultado) // Salida: Día entre semana

//when con rangos y condiciones (in, if else)
val edad = 25
when {
    edad < 13 -> println("Niño")
    edad in 13..19 -> println("Adolescente")
    edad in 20..64 -> println("Adulto")
    else -> println("Anciano")
}   
// Salida: Adulto

//ejercicio clasificacion de envios con peso y prioridad
fun clasificarEnvio(peso: Double, esPrioritario: Boolean): String {
    return when {
        esPrioritario && peso <= 1.0 -> "Envío prioritario ligero"
        esPrioritario && peso > 1.0 -> "Envío prioritario pesado"
        !esPrioritario && peso <= 1.0 -> "Envío estándar ligero"
        else -> "Envío estándar pesado"
    }
}    
// Ejemplos de uso
println(clasificarEnvio(0.5, true))   // Salida: Envío prioritario ligero
println(clasificarEnvio(2.0, false))  // Salida: Envío estándar pesado      
println(clasificarEnvio(1.5, true))   // Salida: Envío prioritario pesado
println(clasificarEnvio(0.8, false))  // Salida: Envío estándar ligero
// Salida: Envío estándar ligero

//uso del break y continue en bucles
for (num in 1..10) {
    if (num == 5) {
        println("Se encontró el número 5, saliendo del bucle.")
        break // Sale del bucle cuando num es 5
    }
    println("Número: $num")
}
// Salida:
// Número: 1    
// Número: 2
// Número: 3
// Número: 4
// Se encontró el número 5, saliendo del bucle.
println()
for (num in 1..10) {
    if (num % 2 == 0) {
        continue // Salta a la siguiente iteración si el número es par
    }
    println("Número impar: $num")
}   
// Salida:
// Número impar: 1  
// Número impar: 3
// Número impar: 5
// Número impar: 7
// Número impar: 9

//uso de when y for para clasificar numeros
fun clasificarNumeros(numeros: List<Int>) {
    for (numero in numeros) {
        val clasificacion = when {
            numero < 0 -> "Negativo"
            numero == 0 -> "Cero"
            numero in 1..10 -> "Pequeño"
            numero in 11..100 -> "Mediano"
            else -> "Grande"
        }
        println("El número $numero es $clasificacion.")
    }
}   
// Ejemplo de uso
val listaNumeros = listOf(-5, 0, 3, 25, 150)
clasificarNumeros(listaNumeros) 
// Salida:
// El número -5 es Negativo.
// El número 0 es Cero.
// El número 3 es Pequeño.
// El número 25 es Mediano.
// El número 150 es Grande.
//ejercicio de clasificacion de edades con if else y when
fun clasificarEdad(edad: Int): String {
    return if (edad < 0) {
        "Edad inválida"
    } else {
        when {
            edad <= 12 -> "Niño"
            edad in 13..19 -> "Adolescente"
            edad in 20..64 -> "Adulto"
            else -> "Anciano"
        }
    }
}
// Ejemplos de uso
println(clasificarEdad(10))  // Salida: Niño
println(clasificarEdad(16))  // Salida: Adolescente
println(clasificarEdad(30))  // Salida: Adulto
println(clasificarEdad(70))  // Salida: Anciano
println(clasificarEdad(-5))  // Salida: Edad inválida
// Salida: Niño





