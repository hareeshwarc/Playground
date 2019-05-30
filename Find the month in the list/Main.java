import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
  public static void main(String a[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String read = br.readLine();
    String month = br.readLine();
    String arr[] = read.split(",");
    List<String> list = Arrays.asList(arr);
    System.out.println(list);
    System.out.println("Size of the linked list: "+list.size());
    System.out.println("Is LinkedList empty? "+list.isEmpty());
    System.out.println("Does LinkedList contains "+month+"?");
    System.out.println(list.contains(month));
  }
}