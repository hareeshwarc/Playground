import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int lastDigit=n%10;
      while(n!=0 && n/10!=0)
        n=n/10;
      int firstDigit=n;
      int sum=firstDigit+lastDigit;
      System.out.println(sum);
    }
}