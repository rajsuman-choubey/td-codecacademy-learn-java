package Static;

public class Student1 {
  int rollno;//instance variable
  String name;
  static String college ="ITS";//static variable
  static void change(){
    college = "BBDIT";
  }
  //constructor
  Student1(int r, String n){
    rollno = r;
    name = n;
  }
  //method to display the values
  void display (){System.out.println(rollno+" "+name+" "+college);}
}
