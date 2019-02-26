// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

// java.lang.NoClassDefFoundError is runtime error thrown when a required class is not found
// in the classpath and hence JVM is unable to load it into memory.
class NoClassDefFoundErrorDemo {
    public static void main(String[] args) {
        try {
            // The following line would throw ExceptionInInitializerError
            SimpleCalculator calculator1 = new SimpleCalculator();
        } catch (Throwable t) {
            System.out.println(t);
        }
        // The following line would cause NoClassDefFoundError
        SimpleCalculator calculator2 = new SimpleCalculator();
    }
}

class SimpleCalculator {
    static int undefined = 1 / 0;
}

// ClassNotFoundException occurs when you try to load a class at runtime using Class.forName() or loadClass()
// methods and requested classes are not found in classpath.

class ClassNotFoundExceptionDemo {

    public static void main(String args[]) {
        try
        {
          // try to load a class at runtime
          // The following line would throw ClassNotFoundException
            Class.forName("DemoClass");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
