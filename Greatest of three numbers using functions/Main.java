import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
      System.out.println(greatest(x,y,z));
	}
  	public static int greatest(int a,int b, int c){
      if(a>b && a>c)
        return a;
      else if(b>a && b>c)
        return b;
      else
        return c;
    }
}