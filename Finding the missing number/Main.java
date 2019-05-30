import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int arr [] = new int [n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      for(int i = 1; i <= n; i++)
      {
        int isPresent = 0;
        for(int j = 0; j < n; j++)
        {
          if(i == arr[j])
          {
            isPresent = 1;
            break;
          }
        }
        if(isPresent == 0)
          System.out.print(i);
      }
    }
}