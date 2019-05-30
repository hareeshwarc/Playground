import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    str1 = str2;
    int noOfParts = sc.nextInt();
  	String x[] = str1.split(" ");
    for(int i = 0; i < x.length; i++)
      System.out.println(x[i]);
  }
}