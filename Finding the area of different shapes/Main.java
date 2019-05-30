import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner (System.in);
    int choice = sc.nextInt();
    switch(choice)
    {
      case 1:
        int s = sc.nextInt();
        System.out.println(s*s);
    	break;
      case 2:
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(l*b);
        break;
      case 3:
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.println(0.5*base*height);
        break;
      case 4:
        int radius = sc.nextInt();
        System.out.println(3.14*radius*radius);
        break;
      default:
        System.out.println("Invalid");
    }
  }
}