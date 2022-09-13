import java.util.Scanner;

public class Assignment1Que2 
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give first input");
        float firstInput = sc.nextFloat();
        System.out.println("give second input");
        float secondInput = sc.nextFloat();
        
        sc.close();
        
        float multiplication = firstInput*secondInput;
        float division = firstInput/secondInput;
        
        System.out.println("the result from multiplication is " + multiplication);
        System.out.println("the result from division is " + division);

    }   
}
