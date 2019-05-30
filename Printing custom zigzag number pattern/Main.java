import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=n;col++)
        {
          if(row%2==1)
          {
            if(col!=n)
          		System.out.print(row);
            else
              System.out.print(row+1);
          }
          else
          {
            if(col!=1)
              System.out.print(row);
            else
              System.out.print(row+1);
          }
        }
        System.out.println();
      }
    }
}
