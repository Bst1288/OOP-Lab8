import java.util.Scanner;

public class Pro1_TriangleClass{
    public static void main(String[] args){
        String color = "";
        boolean filled;
        double side1, side2, side3;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        //enter three sides
        System.out.print("=> Pls,Enter three sides of the triangle : ");
        side1 = input.nextDouble();
        side3 = input.nextDouble();
        side2 = input.nextDouble();

        //enter color
        System.out.print("=> Enter a color : ");
		color = input.next();

        System.out.print("=> Is the triangle filled ? (true / false) : ");
		filled = input.nextBoolean();
        System.out.println("--------------------------------------------------------");
        
        //Create a Triangle
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println("    -> Triangle <-");
        area = triangle.getArea();
        if(area > 0){
            System.out.println("   Area : " + triangle.getArea());
        }
        else{
            System.out.println("   Area : can't find area");
        }
		System.out.println(triangle);

        System.out.println("--------------------------------------------------------");
        input.close();
    }
}