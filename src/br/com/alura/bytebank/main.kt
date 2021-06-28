import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco()

    //val objeto: Object = Any() //da erro de compilação pq a nível de código um Any não é um object, não herda dele
    //mas se vc fazer assim:
    println(Any())
    // vai funcionar porque a nível de compilação(runtime) o Any é mapeado para Object no Java
    println()
    println(1) //dobrecarregado
    println(1.0) //dobrecarregado
    println(true) //sobrecarregado
    println("Teste") //sobrecarregado
    println(endereco) // o kotlin para receber um objeto ele declara tipo Any? - interrogação fala que var pode nao receber um valor


    imprime()
    imprime(1) //tipos primitivos são classes, por isso funcinam com Any
    imprime(2.0)
    imprime(endereco)

    val teste: Any = imprime(endereco)

    testaFuncionarios()
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}

fun imprime() {

}

fun imprime(valor: Int) {

}

fun imprime(endereco: Endereco) {

}


