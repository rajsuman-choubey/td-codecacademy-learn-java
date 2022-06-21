package Static;

public class TestStaticVariable1 {
  public static void main(String args[]){
    Student1 s1 = new Student1(111,"Karan");
    Student1 s2 = new Student1(222,"Aryan");
    //we can change the college of all objects by the single line of code
    //Student.college="BBDIT";
    s1.display();
    s2.display();
  }
}
