/* Aula 26: Init

 */

class Animal(var especie: String){
    var fala: String = ""

    init{
        println("init 1")
    }
    init{
        if(especie == "Cachorro")
        {
            fala = "latir"
        }
        else if(especie == "Gato")
        {
            fala = "miar"
        }
        else if(especie == "passarinho")
        {
            fala = "piar"
        }
        else
        {

        }
    }
    fun falar()
    {
        println(fala)
    }

}


fun main()
{
    //Animal("Cachorro")
    var snoopy = Animal("Cachorro")

    //snoopy.fala = "Latir"
    //snoopy.falar()

    var mingau = Animal("Gato")
    //mingau.fala = "sla"

    snoopy.falar()
    mingau.falar()

    //O Init só rodam na primeira vez que for construído
}