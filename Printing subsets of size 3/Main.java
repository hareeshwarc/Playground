import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      for(int i = 0; i < n; i++)
      {
        for(int j = i+1; j < n; j++)
        {
          for(int k = j+1; k < n; k++)
          {
            	System.out.print("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ") ");
          }
        }
        if( i != n-1)
      	  System.out.println();
      }
    }
}