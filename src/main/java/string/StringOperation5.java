package string;

public class StringOperation5 {

  public static void main(String ar[])
  {
    String s=new String("Suman");
    String s2=s.intern();
    System.out.println(s2);//Suman
  }
}
