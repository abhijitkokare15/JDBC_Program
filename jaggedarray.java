  void main()
  {
   int arr[][]=new int[3][];// jagged array

   // different size of column for different rows
   
    // arr[0]=new int [3];
    // arr[1]=new int [4];
    // arr[2]=new int [2];
  for(int i=0;i<arr.length;i++)
  {
     arr[i]=new int[arr.length-i];
  }
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              arr[i][j] = (int)(Math.random()*100);
          }
      }

      for(int n[] :arr)
      {
          for(int m:n)
          {
               IO.print(m+" ");
          }

          IO.println();
      }



  }

  // Array drawbacks :
//  In this lecture we are discussing drawback of array:
//          -- if  we say new it create object in heap
//-- Array need contagious memory allocation
//--  Once you create array you cannot increase size in current array
//-- for insertion and searching in array performance is low as compare
//  hashset, linkedhashset, linkedlist in upcoming lecture we talking about collection so you understand why we need other data structure to store element.
//          -- only homogenous data allowed in array e.g if data is int type then you cannot add string , float and other data type in it.
//-- collection is solution for this