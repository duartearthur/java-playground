import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBasicos {

    public static void main(String[] args) {
        
    // Sintex - <tipo> [] identificador = {valores aqui dentro , valores aqui dentro}
    
    // LISTA DE TAREFAS

    String [] tarefas = {"Dar like no vídeo", "Se inscrever no canal",
        "Ativar as notificações", "Compartilhas com os amigos"};
         System.out.println(tarefas[0]);

    // Para saber quantos itens temos dentro do array, podemos usar o "tarefas.lenght".
         System.out.println(tarefas.length);

    // Para imprimir todos os valores dentro do array, usamos um método static chamado Arrays que fica dentro do pacote java.util
    // Abrindo as opções com "Arrays+ponto" selecionamos o toSring(tarefas), e ele vira um método statico e transforma todas os valores
    // Que estão dentro do array em strings de texto, separados por vírgula;
         System.out.println(Arrays.toString(tarefas));

    
    // Agora vamos usar o exemplo de criar um array porém não incializar ele, ou seja não colocar as tarefas na lista agora.
    // Porém para criar ele nós precisamos inicializar esse objeto, então precisamos pelo menos dizer que é um array de strings e dizer o tamanho dele;

    String [] tarefas2 = new String[4];
    tarefas2[0] = "Dar like no vídeo2";
    System.out.println(Arrays.toString(tarefas2));


    // USANDO ARRAYLIST 

    // Porém dessa forma acima temos que saber quantos espaços o array deve ter, e pra melhorar isso deixando mais "livre" usamos o ArrayList

    ArrayList<String> tarefas3 = new ArrayList<String>();
    tarefas3.add("Dar like no vídeo3");
    tarefas3.add("Se inscrever no canal3");
    tarefas3.add("Ativar as notificações3");
    tarefas3.add("Compartilhar com os amigos3");

   // E usando o ArrayList podemos imprimir todos os itens do array de forma mais simples por ser uma classe utilitária, já facilitando pra gente
        System.out.println(tarefas3);

   // E quando precisamos imprimir um item específico, podemos usar o metodo GET e passando a posição do item
         System.out.println(tarefas3.get(3));

   // E para imprimir qual tamanho daquele array, usando ArrayList.size ele nos mostra isso
        System.out.println(tarefas3.size());

    }
    
}
