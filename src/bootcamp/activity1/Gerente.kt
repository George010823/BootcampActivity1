package bootcamp.activity1

class Gerente: Empleado(), AccionEmpleado {
    //Gerente se gana 200 por hora y trabaja 200 horas al mes

    override val valorHora = 200
    override val cantHoraMes = 200
    override var cantHoraAdicional = 0
    override val salarioBase = valorHora * cantHoraMes
    override var bonus = valorHora * cantHoraAdicional
    override fun SeleccionarRolEmpleado(rol: String) {
        println("Yo soy un $rol.")
    }
    override fun calcularBono(rol: String) {
        println("Bono total del $rol es: $bonus")
    }
    override fun calcularSalario(rol: String) {
        println("Salario total del $rol es: ${salarioBase + bonus}")
    }
}