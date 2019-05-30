import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    String x = sc.nextLine();
    char s[] = x.toCharArray();
    int q = s.length;
    for(int i = 0; i < s.length; i++)
    {
      if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
      {
        for(int j = i; j < s.length-1; j++)
          s[j] = s[j+1];
        i--;
        q--;
      }
    }
    for(int i = 0; i < q; i++)
      System.out.print(s[i]);
  }
}