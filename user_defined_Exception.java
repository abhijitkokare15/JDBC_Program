
    class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
       // System.out.println(msg);s
    }
}

public class user_defined_Exception {
    public static void main(String[] args) {

        int i = 5;

        try {

            if (i < 10) {
                throw new MyException("Errrroorrr");
            }

        }
        catch (MyException e) {
            System.out.println(e);
        }
    }
}

