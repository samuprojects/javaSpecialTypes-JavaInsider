package enums;

@SuppressWarnings("ALL")
public enum Month {

    JANUARY (1),
    FEBRUARY (2),
    MARCH (3),
    APRIL (4),
    MAY (5),
    JUNE (6),
    JULY(7),
    AUGUST (8),
    SEPTEMBER (9),
    OCTOBER (10),
    NOVEMBER (11),
    DECEMBER (12);

    private final int monthNum; // definindo um atributo para o enum

    Month(int monthNum) { // o construtor de enum é privado, aqui o parametro é o número como atributo do enum
        this.monthNum = monthNum;
    }

    public int getMonthNum(){ // método get para retornar o número (definido com atributo) do enum
        return monthNum;
    }
    
    public int numberOfDays(){ // a partir do Java 14 foi introduzido as switch expressions que melhoraram o switch dado as suas limitações

        return switch(this) { // Combinado com o enum reduz bastante linhas de códigos nesse caso

            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
        };
    }

    @Override
    public String toString() { // toString sobrescrito para trazer um texto personalizado e o nome do enum
        return "Month: " + name();
    }
}
