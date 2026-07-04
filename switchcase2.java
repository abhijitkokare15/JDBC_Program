class Switchcase2
{
    //Introduced in Java 14
    // Preview in Java 12 and Java 1 Called Switch Expression
    // The new switch uses arrow operator instead of :.
    // not need for use break
    //Multiple Labels in One Case e.g case 1,2,3 -> System.out.println("Valid");
    //New switch can return a value.
   // yield is used when the case has multiple statements. and also for returing value
    //If there is only one statement, yield is not needed.
    public static void main(String[] args)
    {
       //int n=3;

     /*  switch(n)
       {
           default-> System.out.println("TIRUPATI_BALAJI");
           case 1-> System.out.println("Venkateshya");
           case 2-> yield"ttd"

       }

      */
        /*int num = 2;

        switch(num) {
            case 1,2,3 -> System.out.println("Valid number");
            default -> System.out.println("Invalid number");
        }*/

        int num = 2;

        String result = switch(num) {
            case 1 -> "One";

            case 2 -> { // case hase multiple statment so use yield and return value Two in string variable
                System.out.println("Processing case 2");
                yield "Two";
            }

            default -> "Other";
        };

        int x = 2;

        String  result1= switch (x) {

            case 1:
                yield "One";

            case 2:
                yield "Three";

            default:
                yield "Other";
        };

        System.out.println(result);


        System.out.println(result1);
    }
}

