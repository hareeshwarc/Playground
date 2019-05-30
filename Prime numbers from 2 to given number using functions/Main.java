import java.util.Scanner;
class Main{
  	public static boolean isPrime(int n){
      for(int i=2;i<=(n/2);i++)
        if(n%i==0)
          return false;
      return true;
    }
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      for(int i=2;i<=x;i++)
        if(isPrime(i))
          System.out.println(i);
	}
}