// Aula 16: Controle de Fluxo: do while()

fun main()
{
    var contador = 0

    do
    {
        print("${++contador}, ")
    } while (contador <= 10)

    print("Digite s para continuar")
    var resp = readln()
    while(resp == "s")
    {
        print("Vamos lá")
    }

    var resp = ""
    do{
        print("Digite s para continuar")
        resp = readlin()
        println("Vamos lá")
    } while (resp == "s")

    var c = 1
    do {
        print("${c++}, ")
    } while (c == 0)

    var i = 1
    while (i == 0)
    {
        print("Nunca vai entrar")
    }

    //Diferença: Ao usar o Do ele sempre vai me garantir 1 vez o que estiver dentro do Do
    //O while não vai rolar quando for falso

    do {
        print("Qual seu nome ?: ")
        val nome = readln()
        if(nome != "") {
            println("Olá, $nome!")
            }
        } while (nome == "")
    }


}


