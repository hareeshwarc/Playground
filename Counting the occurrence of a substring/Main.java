import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    int count = 0;
    String s = sc.nextLine();
    String c = sc.nextLine();
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == c.charAt(0))
      {
        if(s.substring(i).contains(c))
          count++;
      }
    }
    System.out.println(count);
  } 
}