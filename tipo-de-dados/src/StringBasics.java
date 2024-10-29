public class StringBasics {

    public static void main(String[] args) {
        
// *CRIANDO STRINGS COM CONSTRUTOR*

    //String str1 = new String("Java S2");
    //String str2 = new String("Java S2");
    // Resultado FALSE
    //System.out.println(str1 == str2); 


// *CRIANDO STRINGS SEM CONSTRUTOR*

    //String str1 = "Java s2";
    //String str2 = "Java s2";
    // Resultado TRUE
    //System.out.println(str1==str2);

/*Quando eu crio a string sem o construtor ela cria um registro no POOL DE STRINGS e consulta se esse valor já existe lá,
 *Como ele já existe ele me sinaliza que as strings são iguais, porém quando usamos o CONSTRUTOR ele cria um "endereço" / registro,
 * Para cada uma das strings, por isso o resultado do teste anterior é FALSE.*/

 // *CARACTERES ESPECIAIS*
 
    // O contra barra + N (\n) pula uma linha no texto
    //System.out.println("Bom dia! \nTudo bem?");

    // O contra barra + T (\t) adiciona um tab no texto
    //System.out.println("Bom dia! \tTudo bem?");

// *STRING É UM ARRAY DE CHARS*

    String nome = "Arthur Duarte";
    //System.out.println("Primeira letra do nome: "+" "+nome.charAt(0));  

    // Obter a posição de um caractere - Bastante usado para chekagens mais sofisticadas
    //System.out.println("Posição da letra D no nome: "+" "+nome.indexOf("D"));

    // Obter o sobrenome da pessoa
    //int posicaoSobrenome = nome.indexOf(" ") +1;
    //System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome));

    // Obter a posição do caractere dentro do "array" da String
    //System.out.println("Número de caracteres no nome: " + nome.length());
    // Resultado = 13 (Arthur Duarte) - Incluindo o espaço entre um nome e outro, para tirar o espaço podemos colocar -1

    //Substituição de caractere
    //System.out.println(nome.replaceAll("r", "4"));
    // Resultado = A4thu4 Dua4te

    /*Um ponto importante desse teste é que se verificarmos a String NOME para ver essa alteração do R para 4
     * Na string original não terá alteração, pois essa novo nome da String foi criada dentro do pull de strings
     * Sendo assim a string original permanece imutavel */


 }
    
}
