public class Generic <T>{

    T name;

    void show()
    {
        //name="Come";
        System.out.println("The type is "+name);
    }
    public static void main(String[] args) {
        Generic<String> gs = new Generic<>();
        gs.show();

    }
    
}
//Generic was intro in jdk 1.5 
// <T extends Number>
//<T extends Runnable> // in both cases allow for that have the same class extendded or class it sellf
//<we can also use ? for unknown>


