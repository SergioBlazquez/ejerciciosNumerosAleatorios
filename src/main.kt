import kotlin.random.Random

fun main(args: Array<String>) {

    var numero=0
    var sumatorio=0
    val listaNumeros= mutableListOf<Int>()

    for(i in 0..100){

        numero= Random.nextInt(0,100)

        listaNumeros.add(numero)

        sumatorio+=numero
    }


    val listaFinal=mutableListOf<Int>()

    println("La media es de ${sumatorio/100}\n")

    for(j in 0..100){
        if(listaNumeros[j] >sumatorio/100)
            listaFinal.add(listaNumeros[j])
    }
    listaFinal.forEach {
        println(it)
    }
}


