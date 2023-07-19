package app;

@SuppressWarnings("ALL")
public class Address {
    private String street;
    private int number;
    private String complement;
    private String city;
    private String state;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", complement='" + complement + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    // Excluindo um cenário de looping em concatenação de Strings, onde usamos o StringBuilder para otimizar o processo
    // Observando o método toString sobrescrito nas classes para trazer informações dos atributos dos objetos
    // é possível observar a concatenação direta usando o +
    // nesses casos em que não há loop não tem problema usar o + será até mais eficiente do que usar o StringBuilder
    // (pois deixaria o código mais poluído com os métodos disponíveis para uso, como o append e outros)
    // usando a concatenação direta o código fica mais claro, nesse cenáro sem loop pode usar a concatenação sem medo
}
