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