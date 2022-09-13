import java.util.Scanner;

public class Assignment1Que3 
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give first input");
        double firstInput = sc.nextDouble();
        System.out.println("give second input");
        double secondInput = sc.nextDouble();
        
        sc.close();

        double quotient = Math.floor(firstInput/secondInput);
        // Math.floor() give the integer part of a number which contains decimal digits as well
        // the closest integer smaller than the output of division of two numbers gives the quotient of the division
        double remainder = firstInput%secondInput;
        
        System.out.println("the resulting quotient is " + quotient);
        System.out.println("the resulting remainder is " + remainder);
        
    } 
}
