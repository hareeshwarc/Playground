import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner (System.in);
      String s1 = sc.next();
      String s2 = "";
      for(int i = s1.length()-1; i >= 0; i--)
        s2 = s2 + s1.charAt(i);
      if(s1.equals(s2))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}