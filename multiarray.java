void main()
{
    int arr[][]=new int[3][4];

    // int arr[][]=new int[][] {{1,2,3},{3,2,1},{2,3,1}};
    // IO.println(arr.length); //size of rows(no of subarray);

    // for(int i=0;i<arr.length;i++)
    //     IO.println(arr[i]);

   

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
           arr[i][j]=(int)(Math.random()*10);//it add random single digit from 0 t0 10
            // if *100 it gives from 0 t0 99 and so on..
        }


    }

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<4;j++)
        {
            IO.print(arr[i][j]+" ");
        }

        IO.println();
    }
} 