//tipos de datos basicos en kotlin
//Numericos: Int, Double, Float, Long, Short, Byte
//Texto: String, Char
//Booleano: Boolean (true/false)
val pi: Double = 3.14159
val saludo: String = "Hola, Mundo!"
val estaSoleado: Boolean = true
val letra: Char = 'A'
val numeroEntero: Int = 42
val numeroDecimal: Float = 3.14f

//existen 2 tipos de almacenado de datos
//esta VAL y VAR
//esta se diferencia en que una es estatica y otra no
//VAL es un valor fijo
//VAR es una variabale que puede mutar

val nombre = "Juan" //VAL no puede cambiar su valor
var edad = 30 //VAR puede cambiar su valor
fun main() {
    println("Nombre: $nombre")
    println("Edad inicial: $edad")

    // Intentar cambiar el valor de VAL causará un error de compilación
    // nombre = "Pedro" // Esto no es permitido

    // Cambiar el valor de VAR es permitido
    edad = 31
    println("Edad después del cambio: $edad")
}

//usaremos ahora el .ToString para convertir un numero a cadena
//tambien el ToInt para convertir una cadena a numero
fun conversionEjemplo() {
    val numeroComoCadena = "123"
    val numeroConvertido: Int = numeroComoCadena.toInt()
    println("Número convertido: $numeroConvertido")

    val numero = 456
    val numeroComoCadenaConvertida: String = numero.toString()
    println("Número como cadena: $numeroComoCadenaConvertida")
}