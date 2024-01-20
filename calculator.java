public class calculator{
    public int add (int x,int y){
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
    public int mutiplication(int x,int y){
        return x*y;
    }
    public int divison(int x,int y){
        return x/y;
    }
    class main{
    public static void main(string[] args){
        Float x,y;
        scanner sc = new scanner(system.in);

        system.out.println(x:"enter first number");
        x =sc.nextFloat();

        system.out.println(x:"enter first number");
        x =sc.nextFloat();

        calci calculator = new calci();

        system.out.println("addition of two number is: " + calculator.add(x,y));
        system.out.println("addition of two number is: " + calculator.sub(x,y));
        system.out.println("addition of two number is: " + calculator.mul(x,y));
        system.out.println("addition of two number is: " + calculator.div(x,y));

        sc.close();
    }
}

        

    
