import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      String str = sc.nextLine().toLowerCase();
      for( char x = 'a'; x <= 'z'; x++)
      {
        String y = Character.toString(x);
        if(str.contains(y)==false)
          System.out.print(x+" ");
      }
    }
}