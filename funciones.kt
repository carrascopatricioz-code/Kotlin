//aqui veremos funciones en kotlin
//funciones con parametros de entrada y salida
//la diferencia entre parametros de entrada y salida es que los parametros de entrada 
//son los que se pasan a la funcion para que esta realice una tarea
//mientras que los parametros de salida son los valores que la funcion devuelve despues de realizar su tarea.

//funcion sin parametros de entrada ni salida
fun ShowWelcomeMessage() {
    println("¡Bienvenido a Kotlin!")
}
fun ShowMessage(message: String): String {
    return "El mensaje es: $message"
}
println(ShowMessage("Hola Mundo"))

//funcion sin parametros de entrada pero con salida
fun GetCurrentYear(): Int {
    return 2024
}   
println("El año actual es: ${GetCurrentYear()}")

//funcion con parametros de entrada pero sin salida
fun PrintSum(a: Int, b: Int) {
    val sum = a + b
    println("La suma de $a y $b es: $sum")
}   
PrintSum(5, 10)     

//funcion con parametros de entrada y salida
fun Multiply(a: Int, b: Int): Int {
    return a * b
}   
println("La multiplicación de 5 y 10 es: ${Multiply(5, 10)}")

//funcion con ingreso por teclado
fun ReadNameAndGreet() {
    print("Ingresa tu nombre: ")
    val name = readLine() ?: "Invitado"
    println("¡Hola, $name!")
}
ReadNameAndGreet()

//funcion con parametros por defecto
fun GreetUser(name: String = "Invitado") {
    println("¡Hola, $name!")
}
GreetUser()
GreetUser("Carlos") 

//funcion con numero variable de argumentos
fun SumAll(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}
println("La suma de todos los números es: ${SumAll(1, 2, 3, 4, 5)}")

//funcion de extension
//esta funcion invierte una cadena de texto
fun String.Reverse(): String {
    return this.reversed()
}           
val original = "Kotlin"
val reversed = original.Reverse()
println("La palabra '$original' al revés es '$reversed'")

//funcion que llama a otra funcion
fun CalculateAreaAndPerimeter(length: Double, width: Double): Pair<Double, Double> {
    fun CalculateArea(length: Double, width: Double): Double {
        return length * width
    }
    fun CalculatePerimeter(length: Double, width: Double): Double {
        return 2 * (length + width)
    }
    val area = CalculateArea(length, width)
    val perimeter = CalculatePerimeter(length, width)
    return Pair(area, perimeter)
}
val (area, perimeter) = CalculateAreaAndPerimeter(5.0, 3.0)
println("Área: $area, Perímetro: $perimeter")   