//Aula 21 - Método ".let"
fun main()
{
    //Diferentemente do Elvis, o Let só funciona quando a variável não for nula
    val str: String? = "Hello"

    if(str != null)
    {
        str.uppercase()
        str.length
        println("A variável tem $str ")
    }

    str ?: println("A variável $str é nula")

    str?.let
    {
        //aqui o "str" vira "it"
        println(it.uppercase())
    }
}