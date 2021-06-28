import br.com.alura.bytebank.modelo.*

//var totalContas = 0 //qualquer classe pode alterar a var global
//    private set //somente dentro do arquivo que ela foi declarada(main.kt) pode modificar ela
fun main() {

    val fran = object : Autenticavel { //classe anonima herdando de Autenticavel e sobrescrevendo método autentica
        val nome: String = "Fran"
        val cpf: String = "222.222.222-22"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("Nome do cliente: ${fran.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)
    testaContasDiferentes()

    //println("Total de contas: ${totalContas}")
    //println("Total de contas: ${totalContas}")

}