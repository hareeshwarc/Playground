import java.util.Scanner;
class Faculty
{
  private int salary;
  public void setSalary(int salary)
  {
    this.salary = salary;
  }
  public int getSalary()
  {
    return this.salary;
  }
}
class CSE extends Faculty
{
  private int bonus = 3000;
  public void salary(int baseSalary)
  {
    int salary = baseSalary + bonus;
    System.out.println("CSE Faculty: "+salary);
  }
}
class IT extends Faculty
{
	private int bonus = 5000;
    public void salary(int baseSalary)
    {
    	int salary = baseSalary + bonus;
        System.out.println("IT Faculty: "+salary);
    }
 }
 class ECE extends Faculty
 {
 	private int bonus = 4500;
    public void salary(int baseSalary)
    {
    	int salary = baseSalary + bonus;
        System.out.println("ECE Faculty: "+salary);
    }
}
class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    Faculty f = new Faculty();
    int baseSalary = sc.nextInt();
    f.setSalary(baseSalary);
    System.out.println("Base Salary: "+f.getSalary());
    CSE c = new CSE();
    c.salary(f.getSalary());
    IT i = new IT();
    i.salary(f.getSalary());
    ECE e = new ECE();
    e.salary(f.getSalary());
  }
}