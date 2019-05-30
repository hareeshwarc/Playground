import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    String s = sc.nextLine();
    String a [] = s.split(" ");
    for(int i = 0; i < a.length; i++)
    {
      boolean flag = false;
      for(int j = i+1; j < a.length; j++)
      {
        if(a[i].equals(a[j]))
        {
          flag = true;
          break;
        }
      }
      if(!flag)
        System.out.print(a[i]+" ");
    }
  }
}