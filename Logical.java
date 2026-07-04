public class Logical {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println((a > 5 && b < 10)); // AND
        System.out.println((a < 5 || b < 10)); // OR
        System.out.println(!(a > b));          // NOT

    }
}