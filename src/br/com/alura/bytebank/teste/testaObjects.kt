package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
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

    println("Total de contas: ${Conta.total}")
    //println("Total de contas: ${totalContas}")
}