package pkgShape;

public class Circle extends Shape {
    private int radius;

    public Circle(int rad) {
            this.radius = rad;
    }

    public int getRadius() {
            return radius;
    }

    public void setRadius(int rad) {
            if (rad <= 0)
                    throw new IllegalArgumentException();
            this.radius = rad;
    }
    public double area() {
            return Math.PI * radius * radius;
    }
    public double perimeter() {
            return 2 * Math.PI * radius;
    }

    public boolean DoesItFit(Object r) {
            if (r instanceof Rectangle) {
                    Rectangle rec = (Rectangle) r;
                    if (getRadius() <= rec.Distance()) {
                            System.out.println("It Fits");
                            return true;
                    } else {
                            System.out.println("It does not Fits");
                    }
            }
            return false;
    }

}
