package entities;

public class Rectangle {
    public double w;
    public double h;

    public double Area() {
        return w*h;
    }
    public double Perimenter() {
        return 2*(b+w);
    }
    public double Diagonal () {
        return Math.sqrt(w*w + h*h);
    }
}