 class forEach2d {
    void main()
    {
        int arr[][]=new int[][]{{1,2,3},{2,3,1},{3,1,2}};

        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //         IO.print(arr[i][j]+"\t");
        //     }

        //     System.out.println();
        // }

        //using enhance for each loop

        for(/*array  type variable */ int var[]:/*specify array name array  */arr)
        {
            for(int ele:var)
            {
                IO.println(ele);
            }
        }
    } 
       
}
