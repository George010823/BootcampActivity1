package bootcamp.activity1

fun main(args: Array<String>){
    calcularSalarioEmpleado()
}

fun calcularSalarioEmpleado(){
    val gerente = Gerente()
    val contador = Contador()
    val operador = Operador()

    println("Salario total del gerente: ${gerente.cantHoraMes}")
    gerente.calcularSalario()
}