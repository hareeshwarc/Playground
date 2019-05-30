import java.util.*;
class Main
{
  public static void del(char [] x, int i, int n)
  {
    
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    String x = sc.nextLine();
    String y = sc.nextLine();
    char [] s = x.toCharArray();
    int n = s.length;
    int t = y.length();
    int v = 0;
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < t; j++)
      {
        if(s[i] == y.charAt(j))
        {
          int c = i;
          while(c < n-1)
          {
            s[c] = s[c+1];
            c++;
          }
          n--;
        }
      }
    }
	for(int i = 0; i < n; i++)
      System.out.print(s[i]);
  }
}