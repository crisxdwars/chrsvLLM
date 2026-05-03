package src.def;
import java.util.random.*;

public class greet {
    public String getGreet() {   
        RandomGenerator a = RandomGenerator.getDefault();
        String[] value = {
            "Hello",
            "Hi",
            "Hii", 
            "Hai", 
            "Wassup", 
            "Sup",
            "Yes? Do you need help?"
        };
        int rnd = a.nextInt(value.length);
        return value[rnd];
    }
}
