package enums;

import static enums.Car.Brand.BMW;

public class EnumApp5 {

    public static void main(String[] args) {

        // Quando tem enum dentro de uma classe é preciso primeiro acessar a CLASSE, depois nome do ENUM,
        // depois o nome do ELEMENTO que está dentro do enum
        // Quando o enum está fora da classe basta seguir o modelo começando pelo enum
        // Car c = new Car(Car.Brand.BMW);
        // System.out.println(c.getBrand());

        // Outra forma é realizando um import estático conforme a seguir (o que deixa código mas limpo)
        Car c = new Car(BMW); // o import também pode ser usados em métodos sem problemas
        System.out.println(c.getBrand());

    }


}
