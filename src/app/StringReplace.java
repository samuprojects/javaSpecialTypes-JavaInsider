package app;

public class StringReplace {

    public static void main(String[] args) {

        String str = "java is the greatest language!";

        // o replace troca uma determinada informação desejada em uma nova variável (lembrar que as Strings são imutáveis)
        // para isso chama o método replace na string original passando como parametro para essa nova variável o texto
        // que deseja modificar e como deverá ficar o texto final, depois só imprimir a nova String.
        String replaceStr = str.replace("language", "programming language");
        System.out.println(replaceStr);
    }
}
