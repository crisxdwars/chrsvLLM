package src.brain;
import java.util.random.*;

public class model {
    public String getModel() {
        RandomGenerator a = RandomGenerator.getDefault();
        String[] value = {
            "I am Chrsv & was made by Christian Talurong",
            "My model is Chrsv",
            "Model: Chrsv",
            "Oh, i am Chrsv",
            "Chrsv :>"
        };
        int rnd = a.nextInt(value.length);
        return value[rnd];
    }
}
