package Final;

public class Honda extends Bike1 {
  //void run(){System.out.println("running safely with 100kmph");}
  //If you make any method as final, you cannot override it.
  public static void main(String args[]){
    Honda honda= new Honda();
    honda.run();
  }
}
