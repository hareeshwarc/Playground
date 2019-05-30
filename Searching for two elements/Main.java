import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int index1=-1,index2=-1;
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int search_elem1=sc.nextInt();
      int search_elem2=sc.nextInt();
      for(int i=0;i<n;i++){
        if(arr[i]==search_elem1)
          index1=i;
        if(arr[i]==search_elem2)
          index2=i;
      }
      System.out.println(index1+"\n"+index2);
    }
}