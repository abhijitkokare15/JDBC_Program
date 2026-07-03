public class vararags {
    void show(int nums1[],int ...nums2)
    {
       for(int i=0;i<nums1.length;i++)
       {
          System.out.println(nums1[i]);
          
       }

       for(int   n:nums2)
       {
            IO.println(n);
       }
    }

    void main()
    {
        vararags vg = new vararags ();
        int num1[]={52,15,63,56,78};
        int num2[]={10,20,30};
        vg.show(num1,num2);
    }
}
  