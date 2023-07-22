package wrapper;

@SuppressWarnings("ALL")
public class WrapperApp1 {

    public static void main(String[] args) {

        int i = 10;

        // Aqui foi empacotado na classe Integer, através do método estático valueOf (que recebe um int e retorna um Integer), o int
        Integer x = Integer.valueOf(i);


        // por ser um método estático podemos chamar o valueOf diretamente na classe Integer

        // Se pedir a impressão na tela vai constar 10 porque o toString é sobrescrito na classe wrapper Integer pra mostrar o valor
        System.out.println(x); // apesar de visualmente "ser um primitivo 10" é um objeto


        // É importante em cenários onde não é possível utilizar tipos primitivos
        // por exemplo passar um número inteiro para um método que só recebe objetos
        // ou quando utilizamos a API de Coleções do Java, para criar uma lista de números inteiros, o Java
        // não permite criar uma lista de primitivos, um mapa de primitivos, um conjunto de primitivos, somente objetos

        // para extrair um número inteiro de uma classe wrapper, podemos por exemplo usar o intValue;
        int j = x.intValue(); // poderia ser de outros tipos... shortValue, byteValue, floatValue, doubleValue
        System.out.println(x); // aqui é um tipo primitivo impresso após conversão do intValue

        // Não é recomendado construir objetos da classe wrapper por meio de um construtor (isto é, chamando explicitamente um new)
        // a explicação técnica é utilizar o valueOf porque nesse método os objetos são otimizados, porque podem ser reaproveitados
        // como se tivesse um pool

        Double d = Double.valueOf(10.5);
        System.out.println(d); // aqui é um objeto



    }
}
