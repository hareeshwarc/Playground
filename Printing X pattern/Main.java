import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int star=1;star<=n;star++){
        for(int space=1;space<=n;space++){
          if(space==star || space==(n-star)+1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
	}
    }
}