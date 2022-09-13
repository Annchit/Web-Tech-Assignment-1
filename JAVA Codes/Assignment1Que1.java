import java.util.*;  

public class Assignment1Que1
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give first input");
        int firstInput = sc.nextInt();
        System.out.println("give second input");
        int secondInput = sc.nextInt();

        sc.close();
        
        int addition = firstInput + secondInput;
        int subtraction = firstInput - secondInput;
        
        System.out.println("the result from addition is " + addition);
        System.out.println("the result from subtraction is " + subtraction);
        
    }
}
