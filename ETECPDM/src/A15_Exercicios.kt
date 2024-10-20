fun main()
{
    //Ex1
    var n1 = 1
    for(n1 in 1..50)
    {
        print("$n1 ,")
        // 1 , 2 , 3...
    }

    println()

    //Ex2
    for(n1 in 50 downTo 1){print("$n1 ,")}

    println()

    //Deve ter jeito mais simples, mas de cabeça eu pensei nisso
    //Ex3
    var n5 = 1
    var nums5 = 5
    for(n5 in 1..50)
    {
        if(n5 != nums5)
        {
            print("$n5 ,")
            if(n5 > nums5)
            {
                nums5 += 5
            }
        }
    }

    /*Ex3 feito de outra forma
    for(i in 1..50)
    {
        if(i % 5 != 0)
        {
            print("$i ")
         }
     }
     */

    println()

    //Ex4
    var somaFinal = 0
    var n2 = 1
    for(n2 in 1..500)
    {
        somaFinal += n2
    }
    println("somando os numeros resulta em: $somaFinal ")

    println("_______________")

    //Ex5
    var n3 = 5
    var escada = "#"
    for(n3 in 1..n3)
    {
        println("$escada")
        escada += "#"
    }

    /*Ex5 outra forma
    for(i in 1..n)
        for(j in 1..i)
        {
            print("#")
        }
     */

}
