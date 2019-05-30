import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=1;
      for(int row=1;row<=n;row++){
        for(int space=1;space<n-(row-1);space++)
          System.out.print(" ");
        for(int col=1;col<=(row);col++){
          System.out.print(x+" ");
          x++;
        }
        System.out.println();
    }    
}
}