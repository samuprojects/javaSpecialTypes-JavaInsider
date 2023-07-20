package enums;

public class EnumApp3 {

    public static void main(String[] args) {

        Dog d = new Dog();
        talk(d);
        talk(MyPet.CAT); // podemos sobrescrever para cada elemento do enum e não apenas para a classe toda
        talk(MyPet.MOUSE);

    }

    private static void talk(Pet pet) {
        System.out.println(pet.talk());
    }
}
