package conditional_Statement;

public class Var_Initialization {
  static int m=100;//static variable
  static int n= 100;
  static int o= m+n;
  static int p= m*n;
  static int q= m/n;
  static int r= m-n;

  {
    int n=90;//local variable
    System.out.println("variable "+ o);
    System.out.println("variable "+ p);
    System.out.println("variable "+ q);
    System.out.println("variable "+ r);
    System.out.println(n);

  }



  }




