package enums;

@SuppressWarnings("ALL")
public class ExCalc {

    public interface Calculator { // interface para implementar no enum
        double calculate(double n1, double n2);
    }

    public enum Operation  implements Calculator { // enum com associado com os símbolos pelo construtor + implementando a interface Calculator
        SUM('+'){
            @Override
            public double calculate(double n1, double n2) { // com isso podemos implementar para cada símbolo a operação correspondente
                return n1 + n2;
            }
        },
        SUBTRACT('-'){
            @Override
            public double calculate(double n1, double n2) { // e também para esse caso fica mais simples sem precisar do if
                return n1 - n2;
            }
        },
        MULTIPLY('*'){
            @Override
            public double calculate(double n1, double n2) {
                return n1 * n2;
            }
        },
        DIVIDE('/'){
            @Override
            public double calculate(double n1, double n2) {
                return  n1 / n2;
            }
        };

        private final char symbol; // atributo char para receber os símbolos matemáticos

        Operation(char symbol) { // construtor do enum que força informar a referẽncia do símbolo no eelemento do enum
            this.symbol = symbol;
        }

        @Override
        public String toString() { // método toString utilizando String.valueOf passando symbol para converter o char em String
            return String.valueOf(symbol);
        }
    }

    public static void main(String[] args) {

        System.out.println(Operation.SUM); // teste de sobrescrita do toString convertendo o char para String
        System.out.println(Operation.MULTIPLY.calculate(4, 3)); // Chamando enum seguido do elemento, método e parâmetros
        System.out.println(Operation.SUBTRACT.calculate(4, 3));


    }
}
