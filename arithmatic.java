import java.util.Scanner;
public class arithmatic {
    public int add(int a , int b){
        return (a+b);
    }
    public int sub(int a , int b){
        return(a-b);
    }
    public int mul(int a , int b){
        return(a*b);
    }
    public int div(int a, int b){
        return(a/b);
    }
    public int rem(int a , int b){
        return(a%b);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        arithmatic obj = new arithmatic();
        System.out.println("enter any two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("addition=" + obj.add(num1,num2));
        System.out.println("subtraction=" + obj.sub(num1,num2));
        System.out.println("multiplication=" + obj.mul(num1,num2));
        System.out.println("division=" + obj.div(num1,num2));
        System.out.println("remainder=" + obj.rem(num1,num2));
    }

}

