/* Aula 25: Construtores

    Felipe saiu na primeira

 */

//Toda classe criada tem um construtor
class Vazia

//Isso impede que a classe seja construida
class Qualquer private constructor()

class Persona(var nome: String, var anoNasce: Int)
{
    var doc: String? = null
    var altura: Double = 0.0

    //Isso é um construtor secundário que vai sobreescrever o construtor primário
    //A principal função do construtor secundário é adicionar coisas opicionais
    constructor(nome: String, anoNasce: Int, doc: Int) : this(nome, anoNasce)
    {
        this.doc = doc.uppercase()
        if(this.doc == "RG")
        {
            println("Documento Aceito")
        }
        else{
            println("Documento Recusado")
        }
    }

    fun acordar(){}
    fun dormir(){}
 }

/* class Persona(var nome: String, var anoNasce: Int, var doc: String = "") duas construções em uma por causa do
último parâmetro opcional
 */






fun main()
{
    //Isso é o construtor da classe
    //Vazia()
    //Qualquer()

    var professor: Persona = Persona("Luis", 2006)
    var professor: Persona.altura = 1.78
    println(professor.altura)
    professor.dormir()

    var aluno: Persona = Persona("Eu", 2006, "rG")

    println("Aluno: ${aluno.doc}")

    aluno.acordar();

    println("Professor: ${professor.doc}")
    professor.doc = "Cpf"
    println("Professor: ${professor.doc}")


}

