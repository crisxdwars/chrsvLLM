import src.def.greet;
import src.brain.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class chrsv {

    public static void main(String[] args) {
        try {
            File session = new File("src/temp/session.txt");
            FileWriter sessionWriter = new FileWriter("src/temp/session.txt");
            if (session.createNewFile()) {

            } 

            if (session.canRead() && session.canWrite() && session.exists()) {  
                try {
                    sessionWriter.write("\nThis is the session/memory of the ai.");
                    sessionWriter.write("\nThis is the session/memory of the ai.");
                    sessionWriter.write("\nThis is the session/memory of the ai.");
                    sessionWriter.write("\nThis is the session/memory of the ai.");
                    sessionWriter.write("\nThis is the session/memory of the ai.");
                    sessionWriter.write("\nThis is the session/memory of the ai.");
                    sessionWriter.close();
                } catch (Exception e) {

                }


                
            } else {
                System.err.println("Something Went Wrong, Its either the session can't be read, write or it doesnt exists.");
            }

            String _name = "Chrsv";
            Scanner input = new Scanner(System.in);
            greet GREET = new greet();
            model MODEL = new model();
            // System.out.print("You: ");
            // String user = input.nextLine();
            // String filtered = user.toLowerCase();


        } catch (IOException e) {
            System.err.println("An Error Occured");
        }
    }
}