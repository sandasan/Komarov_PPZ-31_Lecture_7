package Example_7_3;

public class Rectangle implements Cloneable {

    double width;
    double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
