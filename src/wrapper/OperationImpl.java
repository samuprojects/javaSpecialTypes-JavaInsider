package wrapper;

public class OperationImpl implements Operation {
    @Override
    public int execute(Integer n1, Integer n2) {
        return (n1 == null ? 0 : n1) + (n2 == null ? 0 : n2); // aqui já tratamos para não receber nulos (sem lançamento exceções)
    }
}
