import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

//var totalContas = 0 //qualquer classe pode alterar a var global
//    private set //somente dentro do arquivo que ela foi declarada(main.kt) pode modificar ela
fun main() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)
    testaContasDiferentes()

    println("Total de contas: ${totalContas}")
    println("Total de contas: ${totalContas}")

}