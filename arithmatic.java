public class arithmatic {
    public static int square(int number) {
        return number * number;
    }

    public static int cube(int number) {
        return number * number * number;
    }

    public static int modulus(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        int resultSquare = arithmatic.square(5);
        int resultCube = arithmatic.cube(3);
        int resultModulus = arithmatic.modulus(10, 3);
        int resultPower = arithmatic.power(2, 4);

        System.out.println("Square: " + resultSquare);
        System.out.println("Cube: " + resultCube);
        System.out.println("Modulus: " + resultModulus);
        System.out.println("Power: " + resultPower);
    }
}
