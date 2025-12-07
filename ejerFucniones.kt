//aqui haremos un ejercicio con funciones en kotlin
//funcion para calcular el area de un rectangulo, el perimetro y mostrar un mensaje de bienvenida

fun CalculateRectangleArea(length: Double, width: Double): Double {
    return length * width
}   
fun CalculateRectanglePerimeter(length: Double, width: Double): Double {
    return 2 * (length + width)
}
fun ShowWelcomeMessage() {
    println("¡Bienvenido al calculador de rectángulos!")
}
ShowWelcomeMessage()
val length = 5.0
val width = 3.0
val area = CalculateRectangleArea(length, width)
val perimeter = CalculateRectanglePerimeter(length, width)
println("El área del rectángulo es: $area")
println("El perímetro del rectángulo es: $perimeter")   


//ahora haremos el mismo ejercicio pero con ingreso con teclado
fun AreaRectangulo(length: Double, width: Double): Double {
    return length * width
}   
fun PerimetroRectangulo(length: Double, width: Double): Double {
    return 2 * (length + width)
}
fun MostrarMensaje() {
    println("¡Bienvenido al calculador de rectángulos!")
}
MostrarMensaje()
print("Ingresa la longitud del rectángulo: ")
val lengthInput = readLine()?.toDoubleOrNull() ?: 0.0
print("Ingresa el ancho del rectángulo: ")
val widthInput = readLine()?.toDoubleOrNull() ?: 0.0
val areaInput = AreaRectangulo(lengthInput, widthInput)
val perimeterInput = AreaRectangulo(lengthInput, widthInput)
println("El área del rectángulo es: $areaInput")
println("El perímetro del rectángulo es: $perimeterInput")

//funcion con parametros por defecto para calcular area y perimetro de un rectangulo
fun Area(length: Double = 1.0, width: Double = 1.0): Double {
    return length * width
}   
fun Perimetro(length: Double = 1.0, width: Double = 1.0): Double {
    return 2 * (length + width)
}
MostrarMensaje()    
val areaDefault = Area()
val perimeterDefault = Perimetro()
println("El área del rectángulo por defecto es: $areaDefault")
println("El perímetro del rectángulo por defecto es: $perimeterDefault")



//funcion con numero variable de argumentos para calcular areas de varios rectangulos
fun SumarAreas(vararg areas: Double): Double {
    var totalArea = 0.0
    for (area in areas) {
        totalArea += area
    }
    return totalArea
}   
val area1 = Area(2.0, 3.0)
val area2 = Area(4.0, 5.0)
val area3 = Area(6.0, 7.0)
val totalArea = SumarAreas(area1, area2, area3)
println("La suma de las áreas de los rectángulos es: $totalArea")


