package enums;

@SuppressWarnings("ALL")
public class EnumApp1 {

    private enum Month { // enum é um tipo de dado

        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {

        Month firstMonth = Month.JANUARY;
        Month noMonth = null; // internamente é como se fosse uma classe por isso pode ter valor null
        // e somente isso, qualquer outra coisa fora do que foi específicado no enum não vai compilar
    }
}
