package Final;

public class Honda1 extends finalBike {
  void fun()
  {
    System.out.println("running safely with 100kmph");
  }

  public static void main(String args[]){
    Honda1 honda= new Honda1();
    honda.fun();
  }
}
//If you make any class as final, you cannot extend it.