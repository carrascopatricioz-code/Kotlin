/**
 * Suma todos los números pares en un rango inclusivo.
 * @param inicio El número de inicio del rango (inclusive).
 * @param fin El número de fin del rango (inclusive).
 * @return La suma total de los números pares encontrados.
 */
fun sumarParesEnRango(inicio: Int, fin: Int): Int {
    // 1. Inicialización de la variable acumuladora (var es necesaria porque cambiará)
    var sumaTotal = 0

    // 2. Bucle 'for' para iterar sobre el rango, incluyendo el 'fin'
    for (numero in inicio..fin) {

        // 3. Expresión 'if' para verificar la condición (número par)
        // El operador módulo (%) devuelve el resto de la división
        if (numero % 2 == 0) {
            // Si es par, se imprime el número y se suma al total
            println("-> Número par encontrado: $numero")
            sumaTotal += numero
        }
        // No necesitamos un 'else' aquí, ya que si es impar, simplemente no hacemos nada
    }

    // 4. Se devuelve el resultado final
    return sumaTotal
}

// --- Ejemplo de Uso ---

val inicioRango = 5
val finRango = 15

// Llamamos a la función
val resultado = sumarParesEnRango(inicioRango, finRango)

println("\n--- Resumen ---")
println("El rango evaluado fue: $inicioRango hasta $finRango")
println("**La suma de todos los números pares es: $resultado**")