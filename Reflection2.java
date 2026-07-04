class A extends B
{

private int p;

}

class B
{

}




public class Reflection2 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("A");
       // A a = new A();
        A a = ( A)c.newInstance();
        System.out.println(c.isInterface());
        System.out.println(c.getName());
        System.out.println(c.getSuperclass());
        System.out.println(c.isLocalClass());
        System.out.println(c.isInstance(a));
        // we can also see priavte methods / field or many more '
        // just using class name
        


    }
}
