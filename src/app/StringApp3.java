package app;

public class StringApp3 {

    public static void main(String[] args) {

        // Esse código apesar de trazer um resultado correto é ruim pois gera uma String para cada caractere e
        // uma String para cada uma das concatenações (que depois serão descartadas)
        // FICAR ATENTO SEMPRE QUE OBSERVAR O CENÁRIO DE CONCATENAÇÃO DE STRINGS DENTRO DE LOOPS

//        String s = "";
//        for (char c = 'A'; c <= 'Z'; c++) {
//            s += c;
//        }
//        System.out.println(s);


        // Para evitar esse problema de concatenação de Strings a melhor saída é não usar Strings
        // Para isso devemos usar a classe StringBuilder que internamente consegue construir uma String usando um CharSequence
        // e a String real do Java só será criada na memória na hora da impressão otimizando sua aplicação
        // Existem outros métodos que podem ser usados no StringBuilder que podem ser estudados depois
        // A vantagem é que não haverá a criação de objetos nesse processo de geração das letras e concatenação

        StringBuilder s = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            s.append(c);
        }
        System.out.println(s);

    }
}
