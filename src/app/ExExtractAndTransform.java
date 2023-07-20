package app;

@SuppressWarnings("ALL")
public class ExExtractAndTransform {

    public static void main(String[] args) {

        // Variável com String chama método passando a String e o pedaço que deseja deixar em maiúsculo
        String converted = uppercase("java is cool", "cool");
        System.out.println(converted);
    }

    // método que fará a captura da palavra seguido da transformação em maúsculo e junção com a primeira parte
    private static String uppercase(String s, String piece) { // parametros String, pedaço para upper

        int pos = s.indexOf(piece); // variável para usar o indexOf e localizar a posição do texto que deseja
        if (pos < 0){ // como retorna um int e zero se for encontrado e -1 se não existir...
            return s; // se for menor que zero retorna a String s original
        }

        // se for encontrado (que é o valor ZERO) podemos usar o substring passando o valor inicial e final
        String extracted = s.substring(pos, pos + piece.length()); // aqui já informamos a posição encontrada e passamos dela até o fim (length)
        String transformed = extracted.toUpperCase(); // aqui pegamos o pedaço e nessa variável atribuímos com letra maiúscula

        // aqui retornamos o substring da original de 0 até pos antes do pedaço e concatenamos com o upper e depois com o restante que sobrar
        return s.substring(0, pos) + transformed + s.substring(pos + piece.length());
        
        // dessa forma podemos alterar o nome do pedaço que será transformado em maiúsculo e caso não exista retorna o original
    }
}
