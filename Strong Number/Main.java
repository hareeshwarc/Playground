import java.util.Scanner;
class Main{
  	public static int fact(int num)
    {
      int prod=1;
      for(int i=1;i<=num;i++)
        prod*=i;
      return prod;
    }
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=n,p=0;
      while(x!=0)
      {
        int y=x%10;
        int z=fact(y);
        p=p+z;
        x=x/10;
      }
      if(p==n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}