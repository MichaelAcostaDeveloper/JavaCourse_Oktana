package POO;

import classes.Triangle;

public class TriangleMain extends Triangle{
    public static void main(String[] args) {
        Triangle t_1=new Triangle(8,8,4);
        Triangle t_2=new Triangle();
        t_2.setSide_a(2);
        t_2.setSide_b(9);
        t_2.setSide_c(2);


        System.out.printf("The area of the triangle is: %.2f\n ", t_1.calculateArea());
        System.out.print("The perimeter of the triangle is:" + t_1.calculatePerimeter());



    }
}
