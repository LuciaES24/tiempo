fun main(args: Array<String>) {
    var tiempo1 = Hora(14,5,18)
    tiempo1.mostrar_hora12()
    tiempo1.mostrar_hora24()
    println()

    var tiempo2 = Hora(23, 24, 56)
    tiempo2.mostrar_hora24()
    tiempo2.mostrar_hora12()
    println()

    var tiempo3 = Hora(27, 13, 5)
    tiempo3.mostrar_hora24()
    tiempo3.mostrar_hora12()
}