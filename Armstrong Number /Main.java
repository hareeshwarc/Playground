import java.util.Scanner;
import java.lang.*;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=n;
      int count=0,sum=0;
      while(x!=0){
        count++;
        x=x/10;
      }
      x=n;
      while(x!=0)
      {
        int y=x%10;
        double z=Math.pow(y,count);
        int q=(int)z;
        sum=sum+q;
        x=x/10;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}