import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      char x = sc.next().charAt(0);
      int k = sc.nextInt();
      if(x >= 65 && x <= 90)
      {
        x = (char) (x - k);
        if(x < 65)
          x = (char) (x + 26);
      }
      else if(x >= 97 && x <= 122)
      {
        x = (char) (x - k);
        if(x <= 97)
          x = (char) (x + 26);
      }
      System.out.print(x);
    }
}