public class ModificadorStatic {
    public static void main(String[] args) {

        //STATIC - Quando usamos?
        // 1. Quando não precisamos de objetos!
        // 2. Quando criamos uma constante - Exemplo: Valor de PI 3,14
        // 3. Quando criamos classes utilitárias - Exemplo: Math no javalang
        
        //contaJoao.depositarConta(20.0);
        //contaMaria.depositarConta(50.0);

        Conta.depositarContaConjunta(50.0);

        System.out.println(Conta.saldoContaConjunta);
        //System.out.println(contaJoao.saldo);
        //System.out.println(contaMaria.saldo);

        // Vemos que esse é o coportamento padrão, onde vemos separadamente os saldos da conta da Maria e do João. 
        // Porém não é a Conta Conjunta que queremos executar, então vamos usar o STATIC para que isso ocorra.

        // Primeira coisa, voltamos na classe Conta e colocamos o STATIC no atributo saldoContaConjunta.
        // Feito isso já conseguimos ver a somatoria do valor das duas contas aparecendo em ambas. 
        // Porém o jeito certo de se trabalhar com ele agora é "sysout.(Conta.saldoContaConjunta);"
        // Porque ele não depende mais do objeto que criamos contaJoao ou contaMaria, agora é só chamar a classe Conta.


        // Link linha 06 - Criamos uma constante no app Conta.java que é uma taxa única de manutenção da conta como uma constante

        // System.out.println(Conta.TAXA_SERVICOS);

        // Link linha 07 - Usando a classe utilitária com Math dentro dele temos diversas operações matemática, 
        // onde não precisamos criar ou instancias os atributos para fazer determinada "conta".
        // Podemos só usar o que já está pronto dentro dessa classe utilitária, segue exemplo:


        Conta contaJoao = new Conta();
        contaJoao.depositarConta(1.666);
        System.out.println(contaJoao.saldo);

        // Fazendo isso temo o valor quebrado de 1.666, usando MATH podemos usar a fórmula de arredondar

        System.out.println(Math.ceil(contaJoao.saldo)); // Aqui arredondamos para cima "ceil / teto" e o valor impresso foi 2.0

        
        



    }
    
}
