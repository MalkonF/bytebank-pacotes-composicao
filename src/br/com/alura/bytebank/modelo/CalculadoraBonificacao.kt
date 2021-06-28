package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Any) {
        //val funcionarioNovo: Funcionario = funcionario as Funcionario // faz casting e manda pra var funcionarioNovo
        //funcionario as Funcionario // faz casting sem atribuir à uma variável nova
        if (funcionario is Funcionario) { //faz o casting e já faz a verificação se funcionario é um Funcionario
            this.total += funcionario.bonificacao
        }// o if é feito pq como a função registra recebe qualquer tipo(Any) se vc mandar o numero 1 vai dar exception
        //entao vc checa se o valor que é mandado realmente é um funcionário
    }

}