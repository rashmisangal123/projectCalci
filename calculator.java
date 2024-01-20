
import java.util.Scanner;

public class calculator{
    public float add (float x,float y){
        return x+y;
    }
    public float sub(float x,float y){
        return x-y;
    }
    public float mutiplication(float x,float y){
        return x*y;
    }
    public float divison(float x,float y){
        return x/y;
    }
    
    public static void main(String[] args){
        Float x,y;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        x =sc.nextFloat();

        System.out.println("enter first number");
        y =sc.nextFloat();
        calculator Calculator = new calculator();

        System.out.println("addition of two number is: " + Calculator.add(x,y));
        System.out.println("addition of two number is: " + Calculator.sub(x,y));
        System.out.println("addition of two number is: " + Calculator.mutiplication(x,y));
        System.out.println("addition of two number is: " + Calculator.divison(x,y));

        sc.close();
    }
}

        

    
