package wrapper;

public class ExOperation {

    public static void main(String[] args) {

        Operation o = new OperationImpl();
        int r = o.execute(4,6);
        System.out.println(r);

        r = o.execute(null,null);
        System.out.println(r);
    }
}
