import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int row=n;row>=1;row--){
        int x=row;
        for(int col=1;col<=row;col++){
          System.out.print(x);
          x--;
        }
        System.out.println();
      }
	}
}