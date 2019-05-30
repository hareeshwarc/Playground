import java.util.Scanner;
class Main{
  	public static int sum(int n){
      int x=1,sum=0;
      while(x<=n)
      {
        sum=sum+x;
        x++;
      }
      return sum;
    }
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum(n));
	}
}