// Wrapper classes are used to convert any data type into an object. 

// The primitive data types are not objects; they do not belong to any class; they are defined in the language itself. 

// Sometimes, it is required to convert data types into objects in Java language.

// speed => use primitive
// collection/generic=>wrapper class

public class Wrapper1
{
    void main()
    {
        int i =10;//premitive data 
        Integer io = new Integer(i); // Boxing 
        int j = io.intValue(); //unboxing
        Integer io2=10; //  Autoboxing 
        int k=io2;// Autounboxing;
       
        Integer io3 =10;
       Integer io4=129;
       Integer io5=129;

        // System.out.println(i);
        //  System.out.println(io);
        //   System.out.println(j);
        //    System.out.println(io2);
        //     System.out.println(k);

        // System.out.println(i==io);//give me true;
        // System.out.println(io2==io3);//true;
        // System.out.println(io==io3);//false
        // System.out.println(io4==io5);//false ; // true if value is betn -127 to 128

        // equals check only values not refernce 
     
        





    }
}
