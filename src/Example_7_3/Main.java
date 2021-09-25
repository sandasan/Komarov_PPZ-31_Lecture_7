package Example_7_3;

public class Main {

    public static void main(String[] args) {

        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(4, 5);
        Rectangle c = a.clone();

        a.width = 3;

        System.out.println(a.width);
        System.out.println(c.width);
    }
}
