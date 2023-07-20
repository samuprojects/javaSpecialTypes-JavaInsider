package enums;

public class EnumApp2 {

    public static void main(String[] args) {

        Month m = Month.AUGUST;
        System.out.println(m.getMonthNum());
        System.out.println(m);
        System.out.println(m.name()); // traz o nome do enum (realizado sobrescrita do toString)
        System.out.println(m.ordinal()); // traz a ordem do enum solicitado começando em 0 como índice

        // essa chamada estática serve quando tem uma String que representa o enum, mas não tem o objeto do enum em si
        Month m2 = Month.valueOf("JANUARY"); // com isso você converte a String no objeto do enum
        System.out.println(m2.getMonthNum());

        // Existe na classe Enum, que é a superclasse de todos os enums, o método estático valueOf
        // que permite construir enums de qualquer tipo, bastando informar 2 parametros
        // qual a classe que quer contruir e o nome
        Month m3 = Enum.valueOf(Month.class, "MARCH"); // o .class serve para acessar o objeto que representa a classe no Java
        // nesse caso o objeto que representa a classe month
        // "MARCH" é o elemento se atribuir em nova variável m3 e imprimir vai mostrar isso
        // OBS.: se colocar null ou com texto errado (por exemplo em minúsculo) vão dar exceções.
        System.out.println(m3.name());
    }
}
