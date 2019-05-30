import java.util.*;
class Main{
  public static int power(int x,int y){
    int j=x,k=1;
    for(int p=1;p<=y;p++)
      k=k*j;
    return k;
  }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println(power(x,y));
  }
}
