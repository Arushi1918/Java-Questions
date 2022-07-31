import java.util.*;

public class Mian {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter 3 sides of the triangle: ");
        double side1=s.nextDouble();
        double side2=s.nextDouble();
        double side3=s.nextDouble();

        System.out.println("Enter colour: ");
        String color=s.next();

        System.out.println("Is the triangle filled?(true/false): ");
        boolean filled=s.nextBoolean();

        Triangle triangle=new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: "+triangle.getArea()+"\nPerimeter: "+triangle.getPerimeter()+
                "\nColor: "+triangle.getColor()+"\nTriangle is: "+(triangle.isFilled()?"":"not filled"));
    }
}
