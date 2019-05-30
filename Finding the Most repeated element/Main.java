import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int a[] = new int [n];
    for(int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    int maxCount = 0, maxElement = a[0], count = 0;
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < n; j++)
      {
        if(i != j)
        {
          if(a[i] == a[j])
          {
            count++;
            if(count > maxCount)
            {
              maxCount = count;
              maxElement = a[i];
            }
          }
        }
      }
      count = 0;
    }
    System.out.print(maxElement);
  }
}