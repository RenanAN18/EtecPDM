//Aula 19_ Exceções: NullPointer e Arithmetic

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

fun main()
{
    var str: String? = null

    var str = "Texto"
    try {
        println(str[str.length - 1])
        print(str!!.length)
    } catch (e: NullPointerException){
        println("Ó o fogo aí, ó fogo ai, fwooosh!")
    } finally {
        println("Fechando conexão com BD")
    }
    println("Fim")

//nullPointerException - Valor Nulo
    //ArithmeticException - Contas erradas
    //Exception - todo tipo de erro
//Para cada tipo de erro existem tratamentos corretos que podem ser utilizados

    try {
        //return
        10 / 0
    }catch (e: Exception){
        println("Exception")
    }finally {
        println("Finallly")
    }
    /*try {
        val n = 10 /0
    } catch (e: ArithmeticException){
        print("ERROR!")
    }*/
}