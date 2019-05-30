import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int a[] = new int [n];
      for(int i = 0; i < n; i++)
        a[i] = sc.nextInt();
      int maxCount = 0, count = 0;
      for(int i = 0 ; i < n; i++)
      {
        if(a[i] == 1)
          count++;
        else
        {
          if(count > maxCount)
            maxCount = count;
          count = 0;
        }
      }
      System.out.print(maxCount);
    }
}