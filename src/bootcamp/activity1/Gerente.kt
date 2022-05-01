package bootcamp.activity1

class Gerente: Empleado(), AccionEmpleado {
    //Gerente se gana 200 por hora y trabaja 200 horas al mes

    override val valorHora = 200
    override val cantHoraMes = 200
    override var cantHoraAdicional = 0
    override val salarioBase = valorHora * cantHoraMes
    override var bonus = valorHora * cantHoraAdicional

    override fun calcularSalario() {
        println("Salario total del gerente es: ${salarioBase + bonus}")
    }
}