import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int row=1;row<=n;row++){
        for(int space=1;space<=n-row;space++)
          System.out.print(" ");
        for(int col=1;col<(2*row);col++)
          System.out.print("*");
        System.out.println();
      }
    }
}