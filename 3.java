class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Ямар нэгэн нэмэлт код хэрэггүй, add() method удамшина.
}

public class Main {
    public static void main(String[] args) {
        Adder a = new Adder();

        // getSuperclass() ашиглан шууд superclass-ийн нэрийг авна
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getSimpleName());

        System.out.println(a.add(10, 32)); // 42
        System.out.println(a.add(5, 8));   // 13
        System.out.println(a.add(12, 8));  // 20
    }
}
