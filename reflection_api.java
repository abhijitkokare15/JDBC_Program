import java.lang.reflect.*;

class p
{
    private void a()
    {
        System.out.println("show");
    }
}

public class reflection_api
{
    public static void main(String[] args) throws Exception
    {
        Class  c = Class.forName("p"); // <T> specify class type // not explicity type casting is required 

        p pi = (p) c.newInstance();

        Method m = c.getDeclaredMethod("a");

        m.setAccessible(true);

        m.invoke(pi);
    }
}