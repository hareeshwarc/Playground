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
    int sum = arr[0], maxSum = 0;
    for(int i = 0; i < n-1; i++)
    {
      if(!(arr[i] > arr[i+1]))
      {
        sum = sum + arr[i+1];
        if(sum > maxSum)
          maxSum = sum;
      }
      else
      	 sum = arr[i+1];
    }
    System.out.print(maxSum);
  }
}