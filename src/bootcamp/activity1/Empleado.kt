package bootcamp.activity1

abstract class Empleado {
    abstract val valorHora: Int
    abstract val cantHoraMes: Int
    abstract val cantHoraAdicional: Int
    abstract val salarioBase: Int
    abstract val bonus: Int
}
// OTRA POSIBLE FORMA DE CREAR LA CLASE ABSTRACTA
/*abstract class Empleado2 (val valorHora: Int, val cantHoraMes: Int,
                          val cantHoraAdicional: Int, val salarioBase: Int,
                          val bonus: Int)
}*/