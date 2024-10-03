fun main()
{
	recebeAnos(4)
	recebePalavra("material")
	retornaCubo(2)
	milhasParaKm(5)
	recebeStringParaConverter("Não sei dizer, o que mudou, mas nada está igual")
	funcaoEx2("material")
	funcaoEx3(2)
	funcaoEx4(5)

}

fun recebeAnos(ano: Int)
{
	var meses: Int
	var dias: Int
	var horas: Int
	var minutos: Int
	var segundos: Int
	println("$ano equivalem a: ")
	println("${ano * 12} meses")
	println("${ano * 365} dias")
	println("${ano * 8766} horas")
	println("${ano * 525960} minutos")
	println("${ano * 31536000} segundos")

}

fun recebePalavra(palavra: String)
{
	var tamanho: String

	tamanho = "A palavra $palavra tem  ${palavra.Length} caracteres"
	println(tamanho)
}

fun retornaCubo(numero: Int)
{
	println("$numero elevado ao cubo equivale a ${numero * numero * numero}")

}

fun milhasParaKm(milhas: Float)
{
	var conversao: Int = milhas * 1.6

	println(conversão)
}

fun recebeStringParaConverter(textoParaConverter: String)
{
	var textoFinal: String = textoParaConverter.uppercase()

	textoFinal = textoParaConverter.replace("A", "X")
}

fun funcaoEx2(palavra2: String) = {println("A palavra $palavra2 tem ${palavra.Length} caracteres")}

fun funcaoEx3(numero2: Int) = {println("$numero2 elevado ao cubo equivale a ${numero2 * numero2 * numero2}")}

fun funcaoEx4(milhas2: Float) = {pintln(milhas2 * 1.6)}