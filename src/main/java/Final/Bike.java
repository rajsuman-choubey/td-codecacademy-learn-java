package Final;

public class Bike {
  final int speedlimit=90;//final variable
  void run(){
   // speedlimit=400; can't be changed because final variable once assigned a value can never be changed.
  }
  public static void main(String args[]){
    Bike obj=new  Bike();
    obj.run();
  }
}
