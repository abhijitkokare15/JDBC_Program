
import java.util.Random;
//import java.util.Random.*;
class Array {
    public static void main(String[] argv) {
        // static  allocation
//        int nums[] = {1, 2, 3, 4};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//
//    }

        //    dynamic array
    //     int tra[] = {2,4,6,8,9};
    //     int sum=0;
        

    //     for (int i = 0,j=tra.length-1; i <= j; i++,j--)
    //     {
    //          if(i==j)
    //          sum=sum+tra[i];
    //      else{
    //        sum=sum+tra[i]+tra[j];
        //      }
    //     }
    //         System.out.println(sum);
            
    //   //  IO.println(tra);
  // int[]a1 = new int[];

    int a[]=new int[5];

    Random r = new Random();

    for(int i=0;i<a.length;i++)
    {
        a[i]=r.nextInt(50);
    }

       for(int arr:a)
       {
         IO.println(arr);
       }
       
    
     }
}
// 
