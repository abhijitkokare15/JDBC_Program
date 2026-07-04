public class TypeConversion {
    public static void main(String[] argv) {
        /*byte b =127;
        System.out.println(b);
        int a;
        a=b;// incplicitly conversion . widing conversion
        System.out.println(a);
         a=257;
        b=(byte)a;// type conversion explicitl.y(Casting). Narrowing  conversion
            // 257%256=1 this done internally
        System.out.println(b);
        // char=true // not possible

        float f=5.6f;
        int x =(int)f;

        System.out.println(x);

         */
        System.out.println("Type promotion");
        // when perfrom operation on another datatype and stored result on another
        // if it is in the range known as type promotion

        //e.g;

    byte a=10;
    byte b=30;
   // byte c=a*b; // a*b =300 not compatable for byte
        int r =a*b; //promted for storing value;
        System.out.println(r);

    }
}
