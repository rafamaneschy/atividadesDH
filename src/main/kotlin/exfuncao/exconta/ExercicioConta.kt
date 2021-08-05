package exfuncao.exconta

fun main() {
    val clienteA: Cliente = Cliente("Manoel","Borges")
    val clienteB: Cliente = Cliente("Fabio", "Azevedo")

    val contaA: Conta = Conta(1214,1085.50,clienteA)
    val contaB: Conta = Conta(3023,2050.00,clienteB)

    println(contaA.deposito(1000))
    println(contaA.saque(500))
}