package access_scope;

public class Product {
  public String pName;
  //variable visible to product class only
  private double pPrice;
  //creating a constructor and parsed product name as a parameter
  public Product (String pname)
  {
    pName = pname;
  }
  //function sets the product price
  public void setPrice(double pprice)
  {
    pPrice= pprice;
  }
  //method prints all product info
  public void getInfo()
  {
    System.out.println("Product Name: " +pName );
    System.out.println("Product Price: " +pPrice);
  }
  public static void main(String args[])
  {
    Product pro = new Product("Mac Book");
    pro.setPrice(65000);
    pro.getInfo();
  }
}
