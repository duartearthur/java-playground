import java.util.Scanner;

public class EstruturasSelecao {
    public static void main(String[] args) {

    System. out. println ("--------------------------------------------------------------------");
    System. out.println("Bem-vind@ ao canal da Giuliana Bezerra! Temos as seguintes opções: ");
    System. out.println("1. Se inscrever no canal");
    System. out.println("2. Dar like no vídeo");
    System.out.println("3. Compartilhar com os amigos");
    System. out.println("4. Aïivar as notificações");
    System.out.print("Digite a opção desejada: ");

    Scanner scanner = new Scanner(System.in);
    int opcao = scanner.nextInt();
    scanner.close();

    //if (opcao == 1)
    //    System.out.println("Obrigado por se inscrever no canal!");
    //else if (opcao == 2)
    //    System.out.println("Obrigado pelo like!");
    //else if (opcao == 3)
    //    System.out.println("Obrigado por compartilhar");
    //else if (opcao == 4)
    //    System.out.println("Obrigado por ativar as notificações!");
    //else
    //    System.out.println("Opção não suportada!");

    // CRIANDO UM SWITCH PADRÃO

    /*switch (opcao) {
        case 1 -> System.out.println("Obrigado por se inscrever no canal!");
        case 2 -> System.out.println("Obrigado pelo Like!");
        case 3 -> System.out.println("Obrigado por compartilhar!");
        case 4 -> System.out.println("Obrigado por ativar as notificações!");
        default -> System.out.println("Opção não suportada");
    };*/

    // CRIANOD UM SWITCH OTIMIZADO - SEM A REPETIÇÃO DO SYSOUT


 }
}
