import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    StringBuilder s = new StringBuilder ("");
    int x = n;
    if(x < 0)
      x = -x;
    while (x != 0)
    {
      int m = x % 10;
      char ch = (char) (m + '0');
      s.append(ch);
      x = x / 10;
    }
    if(n < 0)
      s.append('-');
    s.reverse();
    System.out.print(s);
  }
}