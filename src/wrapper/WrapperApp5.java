package wrapper;

@SuppressWarnings("ALL")
public class WrapperApp5 {

    public static void main(String[] args) {

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = 10;
        Integer i4 = 10;
        Integer i5 = 1000;
        Integer i6 = 1000;

        System.out.println(i1 == i2); // para comparar objetos semanticamente o Java dispõe do EQUALS
        System.out.println(i2 == i3); // o == funciona bem para os tipos primitivos aqui também dá false
        System.out.println(i3 == i4); // aqui como a referência de memória é a mesma (pool) resulta em true
        System.out.println(i5 == i6); // o == pode funcionar as vezes para o pool porém tem um limite de cache por isso EQUALS sempre

        System.out.println(i1.equals(i2)); // como aqui está com o método correto todos resultam em true
        System.out.println(i2.equals(i3));
        System.out.println(i3.equals(i4));
        System.out.println(i5.equals(i6));

        System.out.println(i1.intValue() == i2.intValue()); // uma forma de garantir exatidão com o == para objetos
        System.out.println(i2.intValue() == i2.intValue()); // das classes wrappers é convertê-los para os tipos
        System.out.println(i3.intValue() == i4.intValue()); // primitivos antes de testar a igualdade
        System.out.println(i5.intValue() == i6.intValue());



    }
}
