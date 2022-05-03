import java.util.*;

public class VariableInputs {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of text:");

        String text = input.nextLine();;

        System.out.println("Enter an integer:");

        int num = Integer.valueOf(input.nextLine());

        System.out.println("Enter a double:");

        double numTwo = Double.valueOf(input.nextLine());

        System.out.println("Enter a boolean value:");

        boolean value = Boolean.valueOf(input.nextLine());

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + numTwo);
        System.out.println("Your boolean is " + value);
    }

}
