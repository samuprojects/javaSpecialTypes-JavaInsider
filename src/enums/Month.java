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
}
