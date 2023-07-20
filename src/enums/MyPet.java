package enums;

@SuppressWarnings("ALL")
public enum MyPet implements Pet { // enums não podem ser estendidos, mas podem implementar interfaces

    CAT {
        @Override
        public String talk() {
            return "Miau";
        }
    },
    MOUSE {
        @Override
        public String talk() {
            return "Squik";
        }
    }

// aqui fica genérico o talk que não serve para os animais descriotos nos elementos do enum MyPet
//    @Override
//    public String talk() {
//        return "sound";
//    }
}
