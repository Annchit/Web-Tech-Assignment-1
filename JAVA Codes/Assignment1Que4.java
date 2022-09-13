import java.util.Scanner;

public class Assignment1Que4 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give first input");
        int firstInput = sc.nextInt();
        System.out.println("give second input");
        int secondInput = sc.nextInt();
        System.out.println("Do you want to use temporary variable ? (type 'true' if yes | 'false' if no)");
        boolean option = sc.nextBoolean();
        
        sc.close();
        
        if(option == true){
            int temporaryVariable = secondInput;
            secondInput = firstInput;
            firstInput = temporaryVariable;
        }
        else{
            firstInput = firstInput ^ secondInput;
            secondInput = firstInput ^ secondInput;
            firstInput = firstInput ^ secondInput;
        }
        
        System.out.println("the first input now is " + firstInput);
        System.out.println("the second input now is " + secondInput);
        
    } 
}
