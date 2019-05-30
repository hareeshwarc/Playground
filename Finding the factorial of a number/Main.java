import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int j = fact(n);
    System.out.print(j);
  }
  static int fact(int x)
  {
    if(x == 1)
      return x;
    else
      return x*fact(x-1);
  }
}