package app;

public class StringApp1 {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B"; // cria um objeto que representa o texto B no pool
        String s3 = "B"; // verifica se já existe e aponta para o mesmo objeto
        String s4 = new String("B"); // aqui uma nova String é criada fora do pool e portanto é um objeto diferente do pool

        System.out.println(s1 == s2); // o == verifica se a referencia da variável stack é a do mesmo objeto que está no Heap, por isso false
        System.out.println(s2 == s3); // aqui é true porque apontam para o mesmo objeto no pool
        System.out.println(s3 == s4); // aqui é false porque apontam para objetos diferentes na memória (apesar de ambos os objetos representarem o texto B)
        // o operador == não leva em conta o conteúdo do objeto e sim o objeto na memória (endereço de memória)
        // por isso SEMPRE QUE FOR COMPARAR STRINGS (o conteúdo do objeto) utilizar o EQUALS que vai levar em conta somente o conteúdo dos objetos, esse é o mais seguro

        System.out.println("------");

        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
