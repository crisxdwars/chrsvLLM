import src.def.greet;
import src.brain.*;
import java.util.*;

public class chrsv {

    public static void main(String[] args) {
        String config = "Chrsv"; 
        Scanner input = new Scanner(System.in);
        greet gt = new greet();
        model mdl = new model();

        System.out.print("You: ");
        String user = input.nextLine();
        
        if (user.contains("hello") || user.contains("hi") || user.contains("sup")) {
            System.out.print(config + ": ");
            System.out.println(gt.getGreet());
        } else if (user.contains("your") & user.contains("model") || user.contains("model") || user.contains("who") & user.contains("you")) {
            System.out.print(config + ": ");
            System.out.println(mdl.getModel());
        }  else {
            System.out.println("Chrsv: Out of range");
        }
    }
}