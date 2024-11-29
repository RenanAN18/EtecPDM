//Aula 22: Sobre os parâmetros das funções

fun main()
{
    //parOuImpar(13, 22)
    print("Digite um número inteiro: ")
    parOuImpar(readln().toInt())
}

fun parOuImpar(numero: Int)
{
    var par = numero % 2 == 0
    println("O número $numero é ")
    if(par) {print("par!")}
    else {println("impar!")}
}

fun parOuImpar(numero1 : Int, numero2 : Int, numero3 : Int = 0)
{
    var par = numero1 % 2 == 0
    println("O número $numero1 é ")
    if(par) {print("par!")}
    else {println("impar!")}

    var par = numero2 % 2 == 0
    println("O número $numero2 é ")
    if(par) {print("par!")}
    else {println("impar!")}
}

fun parOuImparComVararg(vararg numeros : Int)
{
    for (numero in numeros)
    {
        var par = numero % 2 == 0
        println("O número $numero é ")
        if(par) {print("par!")}
        else {println("impar!")}
        //O vararg é como se fosse uma lista
        //que aumenta automaticamente os numeros de acordo com os parâmetros
    }

}