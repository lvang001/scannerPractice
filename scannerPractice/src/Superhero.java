import java.util.*;

public class Superhero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.");

        System.out.println("Who is the hero of our story?");

        String name = input.nextLine();

        System.out.println("What is your superpower?");

        String power = input.nextLine();

        System.out.println("Here is the story:" + "\n" + "There once was a superhero named " + name + " who had the power of " + power + ". As they grew older, " + name + " saw that the world needed them. " + name + " used their ability to " + power + " to save the world.");
    }
}
