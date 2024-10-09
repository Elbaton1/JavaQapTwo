public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(0, 10);
        MyPoint bottomRight = new MyPoint(10, 0);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
