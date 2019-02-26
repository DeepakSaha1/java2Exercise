// Q13. Create a custom exception that do not have any stack trace.
import java.util.Scanner;
class MyExceptionAgeCheckAgeCheck extends Exception {
    public MyExceptionAgeCheckAgeCheck(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

// A Class that uses above MyExceptionAgeCheck
class Main {

    // Driver Program
    static int age;
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
      System.out.println("Enter age: ");
        try {
            age = sc.nextInt();
            if(!(age > 0 && age <=100 ) ){
              // Throw an object of user defined exception
              throw new MyExceptionAgeCheck("My custom Exception.. plz enter valid age");
            }

        }
        catch (MyExceptionAgeCheck ex) {
            System.out.println("Caught");
            // Print the message from MyExceptionAgeCheck object
            System.out.println(ex.getMessage());
        } finally {
          sc.close();
        }

    }
}
