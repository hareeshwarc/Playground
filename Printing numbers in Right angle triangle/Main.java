import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      for(int i=1;i<=x;i++)
      {
        for(int j=1;j<=i;j++)
          System.out.print(i);
        System.out.println();
      }
	}
}