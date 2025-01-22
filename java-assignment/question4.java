/*
    QUESTION 4
    WAP to find the area and perimeter of a rectangle, square, and triangle.
 */

 public class question4 {
    public static void main(String[] args) {
        // Info
        double rect_l = 10;
        double rect_b = 15.8;

        double sq_side = 10.6;

        double tri_b = 10;
        double tri_h = 20.6;
        double tri_side1 = 10.2; 
        double tri_side2 = 15; 
        double tri_side3 = 20; 

        // Rectangle
        double rect_area = rect_l * rect_b;
        double rect_perimeter = 2 * (rect_l + rect_b);
        System.out.println("\n----------------------------\n");
        System.out.println("Area of Rectangle: " + rect_area);
        System.out.println("Perimeter of Rectangle: " + rect_perimeter);
        System.out.println("\n----------------------------\n");

        // Square
        double sq_area = sq_side * sq_side;
        double sq_perimeter = 4 * sq_side;
        System.out.println("Area of Square: " + sq_area);
        System.out.println("Perimeter of Square: " + sq_perimeter);
        System.out.println("\n----------------------------\n");

        // Triangle
        double tri_area = 0.5 * tri_b * tri_h;
        double tri_perimeter = tri_side1 + tri_side2 + tri_side3;
        System.out.println("Area of Triangle: " + tri_area);
        System.out.println("Perimeter of Triangle: " + tri_perimeter);
        System.out.println("\n----------------------------\n");
    }
}
