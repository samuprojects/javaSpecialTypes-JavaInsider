package wrapper;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class ExNumber {

    public static void main(String[] args) {
        Integer n = askNumber();

        System.out.println("Binary ==> " + Integer.toBinaryString(n));
        System.out.println("Hex ==> " + Integer.toHexString(n));
        System.out.println("Octal ==> " + Integer.toOctalString(n));

    }

    // método para realizar o processo de transformação do valor digitado pelo usuário em binário, hexadecimal e octal
    private static int askNumber() {
        Scanner scanner = new Scanner(System.in); // cria objeto para capturar digitação do usuário

        // usamos try/catch por causa do valueOf para converter a string a ser capturada pelo scanner.nextLine
        // e colocamos tudo isso dentro de um while(true) para cobrar do usuário o valor correto
        while (true) {
            try {
                System.out.print("Number: ");
                return Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException ignore) { // mudamos a variavel para ignore para IDE não reclamar
            }
        } // enquanto for digitado valor inválido o console solicita um novo lançamento de um número válido
    }
}
