//Aula 24: Classes

/* Paradigmas - Linear (Execução sem desvios)

Estruturado - Laços de repetição, controle, diferentes caminhos, Criação de Sistemas

Orientado a objetos - Encapsulamento, Abstração, Herança. Polimorfismo (Quatro Pilares)
 */

class Pessoa

class Livro(var titulo: String, var autor: String, var ano: Int, var paginas: Int)
{
    var marcador = 0

    fun abrirPagina(p: Int)
    {
        println("\nLivro $titulo aberto na página $p")
    }

    fun marcarPagina(p: Int)
    {
        this.marcador = p
        println("Marcada a página $marcador")
    }
}


fun main()
{

    //meuLivro = Objeto / Livro = Molde
    var meuLivro : Livro = Livro("Atum que caiu do terraço", "Frank Herbert", 1965, 450)
    var pessoa : Pessoa = Pessoa()

    var gente : Pessoa = Pessoa()
    var carinha : Pessoa = Pessoa()

    println(meuLivro.titulo)
    println(meuLivro.autor)
    println(meuLivro.ano)
    println(meuLivro.paginas)

    meuLivro.abrirPagina(25)

    var proximoLivro: Livro = Livro("Fundação", "Isaac Newton", 1439, 142)

    proximoLivro.marcarPagina(9)
    proximoLivro.abrirPagina(proximoLivro.marcador)

}
