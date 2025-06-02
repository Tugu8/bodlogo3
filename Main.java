class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Main {
    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getSimpleName());

        System.out.println(a.add(10, 32)); 
        System.out.println(a.add(5, 8));  
        System.out.println(a.add(12, 8));  
    }
}
