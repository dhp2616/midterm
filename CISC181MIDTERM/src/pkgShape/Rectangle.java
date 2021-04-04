package pkgShape;

public class Rectangle extends Shape implements Comparable<Shape>{

	private int Wid;
	private int Len;
	
	public Rectangle(int width, int length) {
		super();
		this.Wid = width;
		this.Len = length;	
	}
	public int getWid() {
		return this.Wid;
	}
	public void setWid(int width) {
		this.Wid = width;	
	}
	public int getLen() {
		return this.Len;
	}
	public void setLen(int length) {
		this.Len = length;
	}
	public double area() {
		return this.Wid*this.Len;
	}
	public double perimeter() {
		return 2*(this.Len+this.Wid);
	}
	public int compareTo(Shape o) {
        if (area() > o.area()) {
                return 1;
        } else if (area() < o.area()) {
                return -1;
        } else {
                return 0;
        }
	}
	public double Distance() {
        double x = getLen() / 2;
        double y = getWid() / 2;

        if (x > y) {
                return y;
        } else {
                return x;
        }
	}
	public boolean DoesItFit(Object c) {
        if (c instanceof Circle) {
                Circle cir = (Circle) c;
                if (cir.getRadius() <= Distance()) {
                        System.out.println("It Fits!");
                        return true;
                } else {
                        System.out.println("Nope, try again!");
                        return false;
                }
        }
        return false;
	}
}
