import java.util.Scanner;
class Main
{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner (System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int m1 [][] = new int [rows][cols];
    int m2 [][] = new int [rows][cols];
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < cols; j++)
        m1[i][j] = sc.nextInt();
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < cols; j++)
        m2[i][j] = sc.nextInt();
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < cols; j++)
        m1[i][j] = m1[i][j] - m2[i][j];
    for(int i = 0; i < rows; i++)
    {
      for(int j = 0; j < cols; j++)
        System.out.print(m1[i][j]+ " ");
      System.out.println();
    }
  }
}