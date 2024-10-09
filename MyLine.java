public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }

    
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
