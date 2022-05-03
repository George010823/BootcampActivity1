package bootcamp.activity1

class Operador: Empleado(), AccionEmpleado {
    // Operador se gana 10 por hora y trabaja 230 horas al mes

    override val valorHora = 10
    override val cantHoraMes = 230
    override var cantHoraAdicional = 10
    override val salarioBase = valorHora * cantHoraMes
    override var bonus = valorHora * cantHoraAdicional

    override fun SeleccionarRolEmpleado(rol: String) {
        println("Yo soy un $rol.")
    }
    override fun calcularBono(rol: String) {
        println("Bono total del Operador es: $bonus")
    }
    override fun calcularSalario(rol: String) {
        println("Salario total del Operador es: ${String.format("%,d",salarioBase + bonus)}")
    }
}