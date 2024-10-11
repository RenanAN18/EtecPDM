fun main() {
    // 1: Imprimindo números em ordem crescente
    for (i in 1..50) {
        print("$i ")
    }
    println()

    // 2: Imprimindo números em ordem decrescente
    for (i in 50 downTo 1) {
        print("$i ")
    }
    println()

    // 3: Imprimindo números excluindo múltiplos de 5
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }
    println()

    // 4: Adicionando números em um intervalo
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println("A soma dos números de 1 a 500 é: $soma")

    // 5: Imprimindo uma escada de caracteres de libra
    val n = 5
    for (i in 1..n) {
        repeat(i) {
            print("#")
        }
        println()
    }
}
