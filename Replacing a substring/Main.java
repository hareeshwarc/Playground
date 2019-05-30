import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
  	{ 
      Scanner sc = new Scanner (System.in);
      String s = sc.nextLine();
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      s = s.replace(s1,s2);
      System.out.print(s);
    }
}