class Hora(numero_hora : Int,numero_minuto : Int,numero_segundo : Int) {
    var hora = 0
        set(value){
            if (hora>24){
                var dia_hora = value/24
                var hora_restante = value%24
                field = hora_restante
            }
            field = value
        }
        get():Int{
            return field
        }
    var minuto = 0
        set(value){
            if (value>59){
                var minuto_hora = value/60
                var minutos_restantes = value%60
                hora+=minuto_hora
                field = minutos_restantes
            }
            field = value
        }
        get():Int{
            return field
        }
    var segundo = 0
        set(value){
            if (value>59){
                var segundo_minuto = value/60
                var segundos_restantes = value%60
                field = segundos_restantes
            }
            field = value
        }
        get():Int{
            return field
        }

    init {
        hora = numero_hora
        minuto = numero_minuto
        segundo = numero_segundo
    }

    fun mostrar_hora24(){
        println("Son las $hora horas $minuto minutos y $segundo segundos")
    }

    fun mostrar_hora12(){
        var hora_mostrar = 0
        if (hora>12){
            for (i in 12..hora-1){
                hora_mostrar += 1
            }
            println("Son las $hora_mostrar horas $minuto minutos y $segundo segundos")
        }else{
            println("Son las $hora horas $minuto minutos y $segundo segundos")
        }
    }

}