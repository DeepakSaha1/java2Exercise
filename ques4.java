// 4. WAP to create singleton class.
class Main {
  public static void main(String args[]) {
    Singleton instance = Singleton.getInstance();
    System.out.println(instance.n);
  }
}

class Singleton {
    private static Singleton single_instance = null;

    public int n;

    private Singleton() {
        n = 50;
    }

    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
