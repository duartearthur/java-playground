import java.util.Scanner;
import java.io.Console;
// Aula 13 - Entrada e saída de dados - Guliana Bezeera YT

public class InputOutput {
    public static void main(String[] args)  {

        // Criando um Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome +" "+"tudo bem?");
        scanner.close();

        /* Então primeiro criamos o scanner com um construtor, lebrando que o scanner está dentro do pacote java.util,
         * Feito isso para o usuário digitar precisamos usar o método scanner.nextline() e já atribuimos isso a uma string,
         * Nesse caso como estavamos falando de nome, criei a string nome = scanner.nextline(); E já imprimimos o resultado,
         * Feito isso vemos que o scanner que criamos fica grifado como se fosse um erro, e ísso é porque esse "canal" de entrada
         * De informações que é o scanner ainda está "aberto", e quando finalizamos o seu trabalho temos que "fechar" o canal,
         * Por isso nós sempre usamos no final o método scanner.close(); */

         // PORÉM SCANNER É USADO PRA LER QUALQUER ENTRADA DE DADOS, PARA STRINGS ESPECIFICAMENTE USAMOS CONSOLE

         
         // Criando CONSOLE

         Console console = System.console();
         System.out.println("Qual seu canal favorito do Youtube?");
         String name = console.readLine();
         System.out.println(name + ", é claro!");

         /*Basicamente o método console funciona da mesma forma que o Scanner, porém ele não precisamos "fechar" e ele é 
          *espcífico para STRINGS */

    }
}
