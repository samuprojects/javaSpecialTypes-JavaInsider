package app;

public class StringCompare {

    public static void main(String[] args) {

        String s1 = "bed";
        String s2 = "chair";

        // Para comparar Strings de forma alfabética podemos usar o método da classe String compareTo()
        // o método compareTo retorna um int.
        // se a String 1 for alfabeticamente anterior a String 2 vai resultar em número negativo, o que significa
        // que nesse exemplo s1 é menor alfabeticamente que s2.
        // se retornar um número positivo indica que s2 é maior que s1, se retornar 0 significa que as Strings são iguais
        int r = s1.compareTo(s2);
        System.out.println(r);

        // imaginar que a posição da String 1 representa o negativo e o da String 2 representa o positivo independente do valor escolhido
        // com isso se colocar como s1 pet e manter chair em s2 vai resultar em positivo (o número não importa),
        // ou seja pet deveria vir antes de chair
        // se trocar s1 para chair e manter s2 como chair o resultado será 0, ou seja as Strings são iguais

        // ESSA É UMA OUTRA FORMA DE TESTAR A IGUALDADE DO CONTEÚDO DE UMA STRING (senão quiser usar o equals)
    }
}
