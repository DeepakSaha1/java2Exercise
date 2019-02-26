// 9.  Design classes having attributes for furniture where there are wooden chairs and
// tables, metal chairs and tables. There are stress and fire tests for each products.

class Metals extends Test{
    String name;
    int price;
    public Metals(String name, int price, boolean fire, boolean stress) {
        this.name = name;
        this.price = price;
        this.fire = fire;
        this.stress = stress;
    }

    public void getDetails() {
        System.out.println("Product Name: Metal " + name);
        System.out.println("Product Price: " + price);
    }
}

class Woods extends Test{
    String name;
    int price;

    public Woods(String name, int price, boolean fire, boolean stress) {
        this.name = name;
        this.price = price;
        this.fire = fire;
        this.stress = stress;
    }

    public void getDetails() {
        System.out.println("Product Name: Wooden " + name);
        System.out.println("Product Price: " + price);
    }
}

class Furniture {
    public static void main(String[] args) {

        Woods woods1=new Woods("Table",7000,true, false);
        Woods woods2=new Woods("Chair",3000,true, true);
        woods1.getDetails();
        woods1.doFireTest();
        woods1.doStressTest();
        woods2.getDetails();
        woods2.doFireTest();
        woods2.doStressTest();


        Metals metals1=new Metals("Table",5000,true, false);
        Metals metals2=new Metals("Chair",2000,false, false);
        metals1.getDetails();
        metals1.doFireTest();
        metals1.doStressTest();
        metals2.getDetails();
        metals2.doFireTest();
        metals2.doStressTest();
        }
}

class Test {
  boolean fire, stress;
  void doFireTest() {
      if(fire){
          System.out.println("Fire test already done");
      } else {
          System.out.println("Fire test now done");
      }
  }

  void doStressTest() {
      if(stress){
          System.out.println("Stress test already done");
      } else {
          System.out.println("Stress test now done");
      }
    }
}
