package app;

public class StringSubstring {

    public static void main(String[] args) {

        String str = "java is the greatest language!"; // o índice da String começa em 0 e cada caractere tem um índice

        String substr1 = str.substring(4).trim(); // índice 4 é o espaço após o Java e trim remove esse espaço
        System.out.println(substr1);

        String substr2 = str.substring(4,str.length() -1); // esse outro parametro retorna do índice 4 até o final -1, ou seja sem o exclamação
        System.out.println(substr2);

        // sempre que informar o último índice ele vai trazer o valor anterior a esse índice, para trazer o último só com o length
    }
}
