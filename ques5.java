// 5. WAP to show object cloning in java using cloneable and copy constructor both.
class CloneDemo implements Cloneable {
  int rollno;
  String name;

  CloneDemo(int rollno,String name){
  this.rollno=rollno;
  this.name=name;
  }

// public Object clone()throws CloneNotSupportedException{
// return super.clone();
// }

  public static void main(String args[]) {
    try {
      CloneDemo clonedemo=new CloneDemo(101,"amit");

      CloneDemo clonedemo2=(CloneDemo)clonedemo.clone();

      System.out.println(clonedemo.rollno+" "+clonedemo.name);
      // creating the exact copy of an object
      System.out.println(clonedemo2.rollno+" "+clonedemo2.name);

    } catch(CloneNotSupportedException c){}

  }
}

class CopyConstructorDemo {

    private double re, im;

    // A normal parametrized constructor
    public CopyConstructorDemo(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // copy constructor
    CopyConstructorDemo(CopyConstructorDemo c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }

    // Overriding the toString of Object class
    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

class Main {

    public static void main(String[] args) {
        CopyConstructorDemo c1 = new CopyConstructorDemo(10, 15);

        // Following involves a copy constructor call
        CopyConstructorDemo c2 = new CopyConstructorDemo(c1);

        System.out.println(c2); // toString() of c2 is called here
    }
}
