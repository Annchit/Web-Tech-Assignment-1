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
        double remainder = firstInput%secondInput;
        
        System.out.println("the resulting quotient is " + quotient);
        System.out.println("the resulting remainder is " + remainder);
        
    } 
}
