
import java.util.*;
public class OptionalExample {
    public static void main(String[] args) {
        List<String> greet =Arrays.asList("hello","hiii","welcome","greeting");

        Optional<String> name= greet.stream()
                    .filter(str -> str.contains("g"))
                    .filter(str -> str.contains("z"))
                    .findFirst();
        
        System.out.println(name.orElse("not found the element "));


    }
    
}
