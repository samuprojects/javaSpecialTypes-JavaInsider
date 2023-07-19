package theory;

@SuppressWarnings("ALL")
public class JavaStringConcatenation {

    // O código a seguir é extremamente ruim do ponto de vista computacional do Java

    /*
    String s = "";
    for (char c = 'A'; c <= 'Z'; c++) {
    s += c;
    }
    System.out.println(s);

    o resultado será
    ABCDEFGHIJKLMNOPQRSTUVWXYZ

     */

    // O problema é que como as Strings são imutáveis para concatenar os valores vai criando vários objetos
    // Exemplos
    // "" vazio é um objeto + A é um objeto = Vazio A outro objeto ... + B outro objeto = AB outro objeto
    // + C outro objeto = ABC mais outro objeto (só aqui já foram uns 7 objetos só pra formar o ABC)
    // e assim vai criando até chegar na letra Z
    // esse problema pode resultar num erro chamado OutOfMemoryError por usar toda a memória disponível
    // apesar do Garbage Collector fazer a limpeza só o fato dele ser acionado já representa uma aplicação com uma performace ruim
    // dependendo do código talvez nem seja acionado, a solução na aula seguinte
}
