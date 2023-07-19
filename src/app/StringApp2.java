package app;

@SuppressWarnings("ALL")
public class StringApp2 {

    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = "ABC";
        String s4 = s2;
        String s5 = s1;
        String s6 = new String("ABC");
        // o método intern() permite "mover" uma String para dentro do pool caso esteja fora
        String s7 = s6.intern(); // para isso em uma nova variável chama a que está fora do pool seguido do método
        // se for encontrado um valor existente retorna para essa variável apenas o endereço de memória
        // senão faz a adição desse valor no pool e retorna para a stack o endereço de memória correspondente

        printEquality(s1, s2);
        printEquality(s2, s3);
        printEquality(s3, s4);
        printEquality(s4, s5);
        printEquality(s5, s6);
        printEquality(s5, s7); // agora mudou para o pool vai dar true
        printEquality(s6, s7);

        // OBS.: s6 continua apontando para um objeto fora do Pool, ocorre que s7 ao invés de apontar para esse objeto fora
        // passou a apontar para outro com o mesmo conteúdo já existente (ou que foi adicionado) no pool de Strings

    }

    // esse método utilitário serve pra fazer uma investigação a respeito de como as Strings estão se comportando
    // basicamente recebendo dois objetos e imprimindo na tela  a comparação usando == e a comparação usando o equals
    // serve para demonstrar que COMPARAÇÃO DE STRINGS SÓ USANDO O EQUALS, NUNCA COM O ==
    // e também a recomendação do professor é de não inicializar Strings usando o new Strings pois não tem benefício nenhum
    private static void printEquality(Object o1, Object o2) {
        System.out.println();
        System.out.println((o1 + " == " + o2 + " --> " + (o1 == o2)));
        System.out.println(o1 + ".equals(" + o2 + ") --> " + (o1.equals(o2)));
    }
}
