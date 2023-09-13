import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length ");
        int length = scan.nextInt();
        System.out.println("Enter the breadth ");
        int breadth = scan.nextInt();
        Area2 Area = new Area2();
        Area.SetDim(length, breadth);
        int Area1 = Area.getArea();
        System.out.println("Area of the rectangle is: " + Area1);
        scan.close();
    }
}
