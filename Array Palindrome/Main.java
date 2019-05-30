import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      boolean flag = true;
      int arr [] = new int [n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      for(int i = 0; i < n/2; i++)
      {
        if(arr[i] != arr[n-i-1])
        {
          flag = false;
          break;
        }
      }
      if(flag)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}