public class Conta {  
    
    static double saldoContaConjunta;
    double saldo;
    final static double TAXA_SERVICOS = 10.5;

    static void depositarContaConjunta(double valor){
        saldoContaConjunta = saldoContaConjunta + valor;
    }   

    void depositarConta(double valor){
        saldo = saldo + valor;
    }   

    // Criamos esse saldo para que possamos ver o saldo não compartilhado das duas contas
    // E comparar ele com o saldo da conta conjunta

    // Para criar usamos o FINAL no inicio e o nome da constante em caixa alta com underline, ou SNAKE CASE. 
}
