public class App {
    public static void main(String[] args)  {

        // Aula 07 - Giuliana Bezerra YT - https://youtu.be/hyqgGPqHuKg?si=rqAhtzs-XbYd0UcX

        // Tipos numéricos inteiros - byte, short, int, long

        /* 
         * byte numero = 10; OK
         * short numero = 10000; OK
         * int numero = 100000; OK
         * long numero = 100000000000L; OK
         * long numero = 100_000_000_000L; OK ** DICA - Separar números com underline para melhor visualização **
         */


         //int numero1 = 1;
         //int numero2 = 2;
         //int soma = numero1 + numero2; 
         //System.out.println(soma);
         
         // Tipos deciamais - float e double

         //float numero1 = 1.5f;
         //float numero2 = 1.5f;
         //float soma = numero1 + numero2;
         //System.out.println(soma);   


        // Tipo Char
        char operador = '+';
        
        // Chamar o método SOMA - Lembrar da régra do STATIC 
        // soma (2.5, 7.5) - Para "mostrar" esse método eu atribuo ele a uma variável double (resultado) e depois mando imprimir

        //double resultado = soma (2.5, 7.5);
        //System.out.println(resultado);

            // Incluindo o Char na chamada do método SOMA

            double resultado = soma (2.5, 7.5);
            System.out.println(operador + ": " + resultado);
                    

                // Tipo Boolean
                
                // Declaramos duas variaveis e comparamos se a duas são iguais (true/false)
                    double valor1 = 2.5;
                    double valor2 = 3.5;

                    boolean ehIgual = valor1 == valor2;
                    System.out.println(ehIgual);
            }

    // Criar Método SOMA

        static double soma (double numero1, double numero2) {
        return numero1 + numero2;
        }
    
}
