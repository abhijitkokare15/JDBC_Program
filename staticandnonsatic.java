 class staticandnonsatic {
  
   static  int i;

   void show()
   {
     System.out.println(i);
   }

   public static void main()
   {

   staticandnonsatic sc =new staticandnonsatic();
   sc.i=20;
   System.out.println(sc.i);
    staticandnonsatic sc2 =  new staticandnonsatic();
    sc2.i=30;
    System.out.println(sc.i);
    System.out.println((sc2.i).ha);
    

   }

   // we donot use instance varaible inside the stic block
   // we use static inside the instance methods
   //changes made for all object get reflected for all other
   // satic called by both class or object name;

}




