package bootcamp.activity1

fun main(){
    println("Por favor selecciona tu rol: ")
    println("1 para Gerente: ")
    println("2 para Contador: ")
    println("3 para Operador: ")
    println("4 para salir: ")
    val rol = readLine() as String

    recursive(rol)
}
fun recursive(rol: String) {
    while (true) {
        if (rol == "1" || rol == "2" || rol == "3") {
            reselectionRolEmployable(rol)
            calculatorBonusEmployable(rol)
            calculatorIlarioEmployable(rol)
            var rol = readLine()?.toString() as String
            recursive(rol)
        } else if (rol != "1" && rol != "2" && rol != "3" && rol != "4") {
            println("Seleccione un numero entre 1 y 3 para calcular tu salario o 4 para salir por favor")
            var rol = readLine()?.toString() as String
            recursive(rol)
        } else (rol == "4")
            break
    }
}

fun reselectionRolEmployable(rol: String?) {
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()
    var rolEmpleado: String
    rolEmpleado = when(rol){
        "1" -> " ${gerente.SeleccionarRolEmpleado("Gerente")} "
        "2" -> " ${contador.SeleccionarRolEmpleado("Contador")} "
        else -> " ${operador.SeleccionarRolEmpleado("Operador")} "
    }
}
fun calculatorBonusEmployable(rol: String?) {
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()
    when(rol){
        "1" -> " ${gerente.calcularBono("Gerente")} "
        "2" -> " ${contador.calcularBono("Contador")} "
        else -> " ${operador.calcularBono("Operador")} "
    }
}
fun calculatorIlarioEmployable(rol: String?){
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()
    when(rol){
        "1" -> " ${gerente.calcularSalario("Gerente")} "
        "2" -> " ${contador.calcularSalario("Contador")} "
        else -> " ${operador.calcularSalario("Operador")} "
    }
}