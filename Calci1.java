// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Calci1 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner (System.in);
        System.out.println("Give x value : ");
        x = sc.nextInt();
        System.out.println("Give y value : ");
        y = sc.nextInt();
        System.out.println(Multiplication(x,y));
        System.out.println(Remainder(x,y));
    }
    public static int Addition(int a,int b){
        int c = a+b;
        System.out.println("Addition of "+a+" and "+b +" is :");
        return c;
    }
    public static int Substraction(int a,int b){
        int c = a-b;
        System.out.println("Substraction of "+a+" from "+b +" is :");
        return c;
    }
    public static int Multiplication(int a,int b){
        int c = a*b;
        System.out.println("Multiplication of "+a+" & "+b +" is :");
        return c;
    }
    public static int Remainder(int a,int b){
        int c = a%b;
        System.out.println("Remainder of "+a+" / "+b +" is :");
        return c;
    }
}