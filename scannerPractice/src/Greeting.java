
import java.util.*;

public class Greeting {

    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");

        String greeting = input.nextLine();

        System.out.println("Hi " + greeting);

    }
}
