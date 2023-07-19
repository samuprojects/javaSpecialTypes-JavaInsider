package app;

public class StringIndexOf {

    public static void main(String[] args) {

        String str = "java is the greatest language!the";

        // para buscar um texto específico e onde ele está
        int pos = str.indexOf("the"); // o indexOf retorna um inteiro, a partir dele podemos evoluir com a solicitação
        System.out.println(pos);


        int pos1 = str.indexOf("the", 10); // para encontrar outra ocorrência começar depois do índice da primeira
        System.out.println(pos1);

        int pos2 = str.lastIndexOf("a"); // o lastIndexOf é o inverso, traz a última ocorrência do critério informado como parâmetro
        System.out.println(pos2);
    }
}
