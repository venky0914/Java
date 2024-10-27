package conditionalstmts;

public class nestedifelse {
    public static void main(String[] args) {
        int a = 45;
        int b = 56;
        if (a > b) {
            System.out.println("a is greater");

        } else if (a == b) {
            System.out.println("a and b both are equal");

        } else {
            System.out.println("b is greater");
        }
    }

}
