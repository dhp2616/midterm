package pkgShape;

public class Cuboid extends Rectangle {
    
    private int depth;
    
    public Cuboid(int ilen, int iwid, int idep) {
            super(ilen, iwid);
            setDepth(idep);
    }

    public int getDepth() {
            return depth;
    }

    public void setDepth(int depth) {
            if (depth <= 0)
                    throw new IllegalArgumentException();
            this.depth = depth;
    }

    @Override
    public double area() {
            return 2 * ((getLen() * getWid()) + (getLen() * getDepth()) + (getWid() * getDepth()));
    }

    public double volume() {
            return getDepth() * getLen() * getWid();
    }

    @Override
    public double perimeter() {
            throw new UnsupportedOperationException();
    }

}