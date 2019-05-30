import java.util.Scanner;
class Main
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int s = sum(n);
    System.out.print(s);
  }
  static int sum(int s)
  {
    if(s == 1)
      return s;
    else
      return s+sum(s-1);
  }
}