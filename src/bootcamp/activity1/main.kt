package bootcamp.activity1

fun main(args: Array<String>){
    println("Por favor selecciona tu rol: ")
    println("1 para Gerente: ")
    println("2 para Contador: ")
    println("3 para Operador: ")
    var rol = readLine()

    seleccionarRolEmpleado(rol)
    calcularBonuEmpleado(rol)
    calcularSalarioEmpleado(rol)
}
fun seleccionarRolEmpleado(rol: String?) {
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()
    var rolEmpleado: String
    rolEmpleado = when(rol){
        "1" -> " ${gerente.SeleccionarRolEmpleado("Gerente")} "
        "2" -> " ${contador.SeleccionarRolEmpleado("Contador")} "
        "3" -> " ${operador.SeleccionarRolEmpleado("Operador")} "
        else -> println("Por favor ingrese un numero entre 1 y 3").toString()
    }
}
fun calcularBonuEmpleado(rol: String?) {
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()
    when(rol){
        "1" -> " ${gerente.calcularBono("Gerente")} "
        "2" -> " ${contador.calcularBono("Contador")} "
        else -> " ${operador.calcularBono("Operador")} "
    }
}
fun calcularSalarioEmpleado(rol: String?){
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()
    when(rol){
        "1" -> " ${gerente.calcularSalario("Gerente")} "
        "2" -> " ${contador.calcularSalario("Contador")} "
        else -> " ${operador.calcularSalario("Operador")} "
    }
}