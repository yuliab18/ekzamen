package projekt;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle2 = new Triangle(6.0,9.0);
        Triangle triangle3 = new Triangle(8);
        System.out.println("Triangle 1: Side1 = " + triangle1.side1 + ", Side2 = " + triangle1.side2 + ", Side3 = " + triangle1.side3);
        System.out.println("Triangle 2: Side1 = " + triangle2.side1 + ", Side2 = " + triangle2.side2 );
        System.out.println("Triangle 1: Side1 = " + triangle3.side1 + ", Side2 = " + triangle3.side2 + ", Side3 = " + triangle3.side3);




    }
}