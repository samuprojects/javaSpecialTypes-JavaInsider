package wrapper;

public class WrapperApp3 {

    public static void main(String[] args) {

        // A classe wrapper Integer por exemplo possui alguns métodos to... alguma coisa que podem ajudar em conversões de tipos nuḿericos
        System.out.println(Integer.toBinaryString(15)); // converte o número em uma string com valor binário
        System.out.println(Integer.toHexString(15)); // aqui converte em String com o valor hexadecimal
        System.out.println(Integer.toOctalString(15)); // aqui converte em String com valor octal

        // É possível fazer o processo inverso, transformando a String em números inteiros, por exemplo
        System.out.println(Integer.valueOf("11010", 2)); // entre as possibilidades do valueOf esse recebe a String e um RADIX que é a base numérica para conversão
        System.out.println(Integer.valueOf("32fc", 16)); // aqui foi passado a base do hexadecimal

        // Outra opção é usar o método decode, que recebe a String e transforma em um int já identificando a base.
        System.out.println(Integer.decode("0x32fc")); // aqui informamos o 0x para complementar a informação hexadecimal
        System.out.println("10");
        System.out.println("07"); // octal começa com 0
        // no decode não funciona para o binário restando o valueOf
    }
}
