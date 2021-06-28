package br.com.alura.bytebank.modelo

class Endereco(

    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
) {
    override fun toString(): String {
        return """Endereco(logradouro='$logradouro', 
            |numero=$numero, 
            |bairro='$bairro', 
            |cidade='$cidade', 
            |estado='$estado', 
            |cep='$cep', 
            |complemento='$complemento')
            |""".trimMargin()
    }

    //sobrescrevendo equals para dizer que o obj é igual se o cep for igual tb
    override fun equals(other: Any?): Boolean {
        if (other != null && other is Endereco) {
            return this.cep == other.cep
        }
        return false
    }
    //O hascode está ligado com equals, pq se equals for true os hashcodes dos dois obj comparados tem que ter o codigo iguais
    override fun hashCode(): Int {
        return cep.hashCode()
    }
    //alt + insert dá a opção para gerar o equals and hashcode
}
