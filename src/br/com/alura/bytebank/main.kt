import br.com.alura.bytebank.modelo.Cliente
import novomodelo.Cliente as NovoCliente
import java.lang.String as StringJava

fun main() {
    val palavra: kotlin.String = ""
    val palavraJava: StringJava = StringJava("")

    val cliente = Cliente(
        nome = "Malkon",
        cpf = "111.111.111-11",
        senha = 123
    )

    //val clienteNovo = novomodelo.Cliente() //quando vc nao usa o alias vc tem que usar esse outro Cliente inserindo o nome do pct
    val clienteNovo = NovoCliente() //usando o alias
}