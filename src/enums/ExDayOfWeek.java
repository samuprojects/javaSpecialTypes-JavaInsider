package enums;

public class ExDayOfWeek {

    public enum DayofWeek {
        SUNDAY(null), // como o Java não permite referenciar outro elemento que vem abaixo
        SATURDAY (SUNDAY), // invertemos a ordem dos dias pois acima não tem problema, exceto na segunda que assumimos null
        FRIDAY (SATURDAY),
        THURSDAY (FRIDAY),
        WEDNESDAY (THURSDAY),
        TUESDAY (WEDNESDAY),
        MONDAY (TUESDAY);


        private final DayofWeek next; // atributo do tipo do enum para usar no construtor

        DayofWeek(DayofWeek next){ // construtor do enum que recebe um next contendo a referencia do dia seguinte
            this.next = next;
        }

        public DayofWeek next(){ // método usado para filtrar o null e trazer a segunda feira, ou dia seguinte
            return this.next == null ? MONDAY : this.next;
        }
    }

    public static void main(String[] args) {

        // conforme enunciado o enum deve trazer o próximo dia da semana conforme testes a seguir

        DayofWeek dow = DayofWeek.MONDAY;
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);


    }
}
