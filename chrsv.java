import src.def.greet;
import src.brain.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class chrsv {

    public static void main(String[] args) {

        try {
            File memoryA1 = new File("session.txt");
            if (memoryA1.createNewFile()) {

            }
        } catch (IOException e) {
        }

        String config = "Chrsv"; 
        Scanner input = new Scanner(System.in);
        greet gt = new greet();
        model mdl = new model();
        System.out.print("You: ");
        String user = input.nextLine();
        String filtered = user.toLowerCase();
    }
}