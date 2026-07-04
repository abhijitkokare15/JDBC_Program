// An abstract class is an incomplete class. An abstract class is defined with the
// keyword abstract . 
// We cannot create an object of the abstract class because it is
// not complete.

// These classes cannot be instantiated and are either partially implemented or not at all
// implemented. 
// This class contains one or more abstract methods which are simply method
// declarations without a body.
// This class is used when common features are shared by all object.
// when method become abstract the class automatically become abstarct 
// since if class is abstqarct their no nned or not mandatory to the 
// methods to become abstact 
// their not compulsory that abstact class has at least one abstact method

public class Abstraction {
 void main()
 {
   state c = new state();
    c.Environment();
    c.IT();
    c.Education();
 }
}

 abstract class Laws
 {
    void Environment ()
    {
        IO.println("Law for Environmnet");

    }

   abstract  void IT();
 }

 abstract class Centeral extends Laws
 {
    void IT()
    {
        IO.println("It law definedd for IT ");
    }

    abstract void Education();
 }

 class state extends Centeral
 {
   void Education()
    {
        IO.println("It law definedd by state for Education ");
    }
 }



