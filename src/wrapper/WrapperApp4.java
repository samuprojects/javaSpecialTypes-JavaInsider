package wrapper;

@SuppressWarnings("ALL")
public class WrapperApp4 {

    public static void main(String[] args) {

        //Autoboxing - facilita o processo de empacotamento das classes wrappers no bytecode (a partir do Java5)
        Integer i = 10;
        i++;
        System.out.println(i);

        // se rodar essa classe no terminal com javap -c vai poder observar por detrás dos panos que ele faz o seguinte
        // No Autoboxing
        Integer j = Integer.valueOf(10);
        int t = j.intValue();
        t++;
        j = Integer.valueOf(t);
        System.out.println(j);

    }
}
