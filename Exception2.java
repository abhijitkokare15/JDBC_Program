// We can use multiple catch blocks.
// JVM checks them one by one.
// If no matching catch is found,
// JVM executes the default exception handler.

// Best practice: keep catch(Exception e) last.

public class Exception2 {

    public static void main(String[] args) {

        try {
            int a = 12;
            int b = 0;

            // int c = a / b;

            int arr[] = new int[4];

            for (int i = 0; i <=4; i++) {
                System.out.println(arr[i]);
            }

            String n = null;
            // System.out.println(n.length());
        }

        catch (ArithmeticException e) {
            e.printStackTrace();
        }

        // catch (ArrayIndexOutOfBoundsException e) {
        //     e.printStackTrace();
        // }

        // catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}