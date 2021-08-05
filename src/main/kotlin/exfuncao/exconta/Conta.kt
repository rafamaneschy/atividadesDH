package exfuncao.exconta


class Conta(var numeroDaConta:Int, private var saldo:Double, var titular: Cliente){

    fun deposito(valorDeposito:Int): String {
    return "Seu novo saldo é R$ ${this.saldo + valorDeposito}"
}
    fun saque(valorSaque:Int): String {
       if (valorSaque > this.saldo) print("Saldo insuficiente")
       else print("Transação Realizada")
       return "Seu novo saldo é R$ ${this.saldo - valorSaque}"
    }
}