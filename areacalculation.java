import java.util.Scanner;
public class areacalculation {
    Scanner sc = new Scanner(System.in);
    double PI = 3.14;
    public void circle(){
        System.out.println("enter radius");
        double radius=sc.nextDouble();
        double result= PI*(radius*radius);
        System.out.println("area=" +result);
    }


    public void square() {
        System.out.println("enter side");
        double side = sc.nextDouble();
        double result =(side*side);
        System.out.println("area=" + result);
    }

    public void triangle() {
        System.out.println("enter base");
        System.out.println("enter height");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double result =0.5*(base*height);
        System.out.println("area=" + result);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        areacalculation obj = new areacalculation();
        obj.circle();
        obj.square();
        obj.triangle();
    }
}
