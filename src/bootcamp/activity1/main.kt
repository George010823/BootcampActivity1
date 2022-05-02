package bootcamp.activity1

fun main(args: Array<String>){
    seleccionarRolEmpleado()
    calcularBonuEmpleado()
    calcularSalarioEmpleado()
}

fun seleccionarRolEmpleado() {
    TODO("Not yet implemented")
}
fun calcularBonuEmpleado() {
    TODO("Not yet implemented")
}
fun calcularSalarioEmpleado(){
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()

    println("Salario total del gerente: ${gerente.cantHoraMes}")
    gerente.calcularSalario()
}