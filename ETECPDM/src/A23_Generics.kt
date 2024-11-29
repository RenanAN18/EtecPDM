//Aula 23: Parâmetro Generics <T>

fun main()
{
    media("Nome1", 10.0, 3.5, 9.3)

    media("Batato", true, 7.3, 10.0, 4.5, 9.2)
}

fun <T> media(vararg notas: T)
{
    var soma = 0.0
    var contador = 0
    for(n in notas) {
        if (n is Double) {
            soma += n
            contador++
        }
    }

//  println(soma / notas.size)
    println(soma / contador)
}

//Vararg sempre considera todas as variáveis em sua frente
//como vararg. Nesse caso o Vararg precisa ficar em último.
fun /*<Generico>*/ <T, F> media(nome : String, /*vararg*/outro : F , vararg notas: /*Double*/ /*Generico*/ T,)
{
    var soma = 0.0
    var contador = 0
    for (n in notas)
    {
        if (n is Double)
        {
            soma += n
            contador += 1
        }

    }
    var tipo = ""
    if (outro == true)
    {
        tipo == "Final"
    }
    else {tipo == "Parcial"}

    var media = soma / /*notas.size*/ contador
    println(format("A média $tipo do aluno $nome é %.2f", media))
//%, variável = método Java / $variável = método Kotlin
}