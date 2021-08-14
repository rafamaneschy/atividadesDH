package funcoesObjetos.exconta


class Conta(var numeroDaConta:Int, private var saldo:Double, var titular: Cliente){

    fun deposito(valorDeposito:Int): String {
    return "Seu novo saldo é R$ ${saldo + valorDeposito}"
}
    fun saque(valorSaque:Int): String {
       if (valorSaque > saldo) print("Saldo insuficiente")
       else print("Transação Realizada")
       return "Seu novo saldo é R$ ${saldo - valorSaque}"
    }
}