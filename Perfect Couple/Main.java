import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i < n;i++)
        arr[i] = sc.nextInt();
      int value = sc.nextInt();
      for(int row = 0; row < n-1; row++)
      {
        for(int col = row+1; col < n; col++)
        {
          if(arr[row] + arr[col] == value)
          {
            System.out.println(arr[row]+", "+arr[col]);
          }
        }
      }
    }
}