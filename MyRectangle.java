public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    
    public int getArea() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }

    
    public int getPerimeter() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return 2 * (width + height);
    }

    
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
