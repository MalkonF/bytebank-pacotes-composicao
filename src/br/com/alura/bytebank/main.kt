import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Malkon"
    )//Endereco tb é um Any. Vc pode usar hashCode, toString
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 5000
    )
    println(endereco.equals(enderecoNovo))//falso pq são obj diferentes. Se vc atribuir a referencia de enderecoNovo a endereco vai ser true

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())// é mostrado aquele codigo pq vc nao sobrecreveu a representação de toString
    println(enderecoNovo.toString())
    //gera a mesma representação do toString de endereco acima
    println("${endereco.javaClass}@${java.lang.Integer.toHexString(endereco.hashCode())}")

}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}



