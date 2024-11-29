/* Aula 27: Get, Set e Fiel

 */

class Pet(var especie: String)
{
    var fala: String = ""
        get(){
            println("Acesso ao get da fala")
            return field
        }
    //Coloco o get abaixo da var para ele buscar a var
    set(valor)
    {
        println("Acesso ao Set da fala")
        field = valor
    }
    //O set entra, pega o valor(Miau!) e passa o println("Acesso") e atribui valor ao Get



}

class Personagem(var nome: String)
{
    var midia: String = ""
}

fun main()
{
    var mingau = Pet("Gato")

    mingau.fala = "Miau!"
    //Quando eu puxo a fala, ele busca do Get, ou seja, o Get retorna um valor
    println(mingau.fala)

    val morcego: Personagem = Personagem("Batman")
    morcego.midia = "Comics"
    println(morcego.nome)
    println(morcego.midia)

}