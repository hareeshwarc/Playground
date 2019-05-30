import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
      	int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
      	System.out.println(GCD(x,y,z));
	}
  public static int GCD(int a,int b,int c){
    int gcd1=c,gcd2=c;
    for(int i = 1; i <= a && i <= b; ++i)
        {
            // Checks if i is factor of both integers
            if(a % i==0 && b % i==0)
                gcd1 = i;
        }
	for(int i=1; i<=gcd1 && i<=c;++i)
    {
      if(gcd1%i==0 && c%i==0)
        gcd2=i;
    }
    return gcd2;
}
}