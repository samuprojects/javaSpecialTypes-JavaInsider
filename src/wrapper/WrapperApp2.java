package wrapper;

@SuppressWarnings("ALL")
public class WrapperApp2 {

    public static void main(String[] args) {

        // todos os objetos das classes wrappers do Java tem dois tipos de métodos
        // o método valueOf e o parse com o tipo primitivo (exemplo parseInt, parseDouble, etc)
        // Exemplos

        Integer i = Integer.valueOf(1); // nessa vertente o valueOf converte o int em objeto Integer
        Integer j = Integer.valueOf("1"); // nessa vertente o Java faz o parse da String e tenta converter num int
        // de forma que se deseja converter uma String em objeto da Classe Wrapper é o valueOf que precisa usar
        // mas atenção se digitar uma letra junto do número por exemplo vai dar exceção porque não consegue converter no tipo esperado

        System.out.println(i);
        System.out.println(j);


        // Além disso temos o método Integer.parseInt, que também faz o parse de uma String pra converter num número
        // a diferença dele pro valueOf é que retorna diretamente o tipo primitivo sem criar objetos da classe wrapper
        // o Integer.parseInt é simplesmnete um método utilitário pra converter uma String num int

        int k = Integer.parseInt("1");
        System.out.println(k);

        Boolean b = Boolean.valueOf(true); // tipo primitivo boolean convertido em um tipo de objeto da classe wrapper Boolean
        Boolean c = Boolean.valueOf("true"); // tipo String com valor boolean convertido por meio do parse em wrapper Boolean
        boolean d = Boolean.parseBoolean("true"); // tipo String com valor boolean covertido diretamente pelo parse no tipo primitivo

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);



    }
}
