import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price = price;
  }
  public int getPrice()
  {
    return this.price;
  }
}

class Customer extends Item
{
  private String product;
  private int quantity;
  public void setCustomer(String product, int quantity)
  {
    this.product = product;
    this.quantity = quantity;
  }
  public String getProduct()
  {
    return this.product;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill extends Customer
{
  public void display()
  {
  	int totalPrice;
    totalPrice = getPrice() * getQuantity();
    System.out.println("Total Price is : " + totalPrice);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    String name = sc.next();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    obj.setCustomer(name,quantity);
    obj.setPrice(price);
    obj.display();
  }
}