//las funciones de extension nos permiten agregar nuevas funcionalidades a clases existentes 
//sin tener que heredar de ellas o modificar su codigo fuente
//definicion de una funcion de extension para la clase String
//Extensión de la clase 'String'
fun String.esPalindromo(): Boolean {
    // 'this' se refiere a la instancia de String sobre la que se llama la función
    return this == this.reversed()
}

// Extensión de la clase 'Int'
fun Int.esPar(): Boolean {
    return this % 2 == 0
}



// 1. Definición de la Función de Extensión para la clase String
fun String.capitalizarPrimeraLetra(): String {
    // Verificar si la cadena está vacía para evitar errores
    if (this.isEmpty()) return this
    
    // Obtener la primera letra en mayúscula y concatenarla con el resto de la cadena
    return this.substring(0, 1).uppercase() + this.substring(1)
}


// --- Uso ---
val texto = "hola mundo kotlin"
val textoCapitalizado = texto.capitalizarPrimeraLetra()

println("Original: '$texto'")
println("Extensión: '$textoCapitalizado'")
// Salida: Extensión: 'Hola mundo kotlin'