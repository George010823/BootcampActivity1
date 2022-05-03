package bootcamp.activity1

class Contador: Empleado(), AccionEmpleado {
    // Contador se gana 50 por hora y trabaja 200 horas al mes*/

    override val valorHora = 50
    override val cantHoraMes = 200
    override var cantHoraAdicional = 0
    override val salarioBase = valorHora * cantHoraMes
    override var bonus = valorHora * cantHoraAdicional

    override fun SeleccionarRolEmpleado(rol: String) {
        println("Yo soy un $rol.")
    }
    override fun calcularBono(rol: String) {
        println("Bono total del Contador es: $bonus")
    }
    override fun calcularSalario(rol: String) {
        println("Salario total del Contador es: ${String.format("%,d",salarioBase + bonus)}")
    }
}