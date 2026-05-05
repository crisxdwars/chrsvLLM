import src.def.greet;
import src.brain.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class chrsv {

    public static void main(String[] args) {
        try {
            File memory = new File("src/temp/session.txt");
            if (memory.createNewFile()) {
                System.out.println("New Session");
            }

            String _name = "Chrsv";
            Scanner input = new Scanner(System.in);
            greet GREET = new greet();
            model MODEL = new model();
            System.out.print("You: ");
            String user = input.nextLine();
            String filtered = user.toLowerCase();

        } catch (IOException e) {
            System.err.println("Memory Error");
        }
    }
}