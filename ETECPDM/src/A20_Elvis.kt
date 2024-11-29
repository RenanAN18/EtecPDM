//Aula 20: Operador Elvis "?:"

fun main()
{
    var str: String? = null
    if(str == null)
    {
        println("A var é nula")
    } else{
        println(str)
    }

    println(str ?: "Ok. Segundos Elvão, é nulo")
    println(str ?: 7)

    var teste = str ?: true
    println(teste)
    //Chamando função
    println(str ?: nulidade())
    str ?: println(nulidade())
}

fun nulidade(): String {
    return "Sim! É nula!"
}