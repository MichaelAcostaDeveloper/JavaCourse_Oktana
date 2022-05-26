package classes;

public class Triangle {
    //fields or variables
    protected static double side_a=3;
    protected static double side_b;
    protected static double side_c;

    //constructors

    public Triangle(double side_a, double side_b, double side_c) {
        this.side_a = 10;
        this.side_b = 10;
        this.side_c = 10;
    }

    public Triangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public Triangle(double side_a) {
        this.side_a = side_a;
    }

    public Triangle() {
    }

    //methods
    protected static double calculatePerimeter(){
        return side_a+side_b+side_c;
    }
    protected  static double calculateArea(){
        //Heron Formula
        double s=(calculatePerimeter())/2;
        return Math.sqrt(s*(s-side_a)*(s-side_b)*(s-side_c));
    }

    //getters and setters methods

    public double getSide_a() {
        return side_a;
    }

    public void setSide_a(double side_a) {
        this.side_a = side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public void setSide_b(double side_b) {
        this.side_b = side_b;
    }

    public double getSide_c() {
        return side_c;
    }

    public void setSide_c(double side_c) {
        this.side_c = side_c;
    }


}
