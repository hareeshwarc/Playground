import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      s1 = s1.concat(s1);
      if(s1.contains(s2))
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}