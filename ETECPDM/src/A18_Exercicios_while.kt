/*
    Aula 15: Exercícios com a estrutura while

    1. Considere uma caixa d'água de 2 mil litros. Rômulo gostaria de encher a caixa
    d'água com balões de 7 litros. Quantos balões cabem na caixa d'água sem
    que o volume seja excedido ? Crie uma rotina usando While() que retorne a resposta.

    2. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo.
    Use while() ou do while()
        a. Quando um número for divisível por 3, imprimir Buzz
        b. Quando um número for divisível por 5, imprimir Fizz
        c. Quando um número for divisível por 3 e 5 simultaneamente, imprimir FizzBuzz

    4. Escreva um código, usando "while( )" ou "do while( )", capaz de receber um texto e imprimi-lo invertido
       Exemplo de entrada: Meu nome é Asdrúbal
       Exemplo de saída esperada: labúrdsA é emon ueM

    5. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres "x" e "o"
    e retorna true ou false. Caso não exista nem "x" nem "o", retornar false. Use "while( )" ou "do while( )"


 */

fun main()
{
    ex1Baloes()
}

fun ex1Baloes()
{
    var litros: Int = 0
    var baloes: Int = 0
    while(litros <= (2*1000))
    {
        litros += 7
        baloes += 1
        if(litros > 2*1000)
        {
            baloes -= 1
        }
    }

    print("Cabem $baloes dentro da caixa d'água")
}

fun ex2FizzBuzz()
{
    var contador = 1
    do{
        if((contador % 3 == 0) && (contador % 5 == 0))
        {
            print("FizzBuzz ")
        }
        else if(contador % 5 == 0)
        {
            print("Fizz ")
        }
        else if(contador % 3 == 0)
        {
            print("Buzz ")
        }
        else
        {
            print("$contador ")
        }

        contador++
    } while(contador <= 50)
}

fun ex3NomeInvertido()
{
    //Ou talvez: var palavra = readln()
    var palavra = "Bem-vindo!"
    var tamanho = palavra.length
    var letra = ""


    do{

        tamanho--
        letra = palavra[tamanho].toString()
        print(letra)


    }while(tamanho > 0)
}

fun exe2contaXeO()
{
    //println(texto.reversed())
    //Ou talvez: var palavra = readln()
    var palavra = "Exterminador do Futuro e O Ex-Exoesqueleto"
    var tamanho = palavra.length
    var i = 0
    var letra = ""
    var qtX = 0
    var qtO = 0
    var resposta = false

    while(i < tamanho)
    {
        palavra.lowercase()
        letra = palavra[i].toString()

        if(letra == "x")
        {
            qtX++
        }
        else if(letra == "o")
        {
            qtO++
        }

        i++

    }

    if(qtX == qtO)
    {
        resposta = true
    }
    else{
        resposta = false
    }
    println(resposta)
    println("A quantidade de letras O é: $qtO")
    println("A quantidade de letras X é: $qtX")


}

/*fun contaXeO(texto : String): Boolean
{
    var txt = texto.lowercase()
    var numX = 0
    var numO = 0

    var i = 0

    do{
        if (txt[i] == "o")
        {
            numO++
         }
         else if (txt[i] == "x")
         {
            numX++
         }
      }while (i < txt.length)

      return numX == numO && numX != 0
      //Retorna o valor em booleano
}
 */
