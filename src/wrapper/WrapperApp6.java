package wrapper;

public class WrapperApp6 {

    public static void main(String[] args) {

        Person p1 = new Person(null, 60.0);
        System.out.println(p1);

        System.out.println(p1.getAge() + 10);

        // Apesar das classes wrappers permitirem um valor a mais para o objeto que nesse caso é o null
        // tem que se tomar muito cuidado ao misturar os wrappers com operações que exijam no final o valor
        // primitivo como é o caso do exemplo acima, onde o p1.getAge() é null e não tem problema nisso, porém,
        // devido a operação de soma com um primitivo na sequencia, por detrás dos panos o Java chama o intValue()
        // para desembrulhar a classe wrapper e obter o valor primitivo. Como ele não existe o método intValue()
        // não pode ser chamado. Em decorrência disso a aplicação resultará em uma NullPointerException.
    }
}
