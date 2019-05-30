import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int i;
      for(i=1;i<=a || i<=a-1;i+=2)
      	System.out.println(i);
	}
}