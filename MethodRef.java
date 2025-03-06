import java.util.*;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Deepthi","Mrudula","Hemanth");

        List<String> Unames=names.stream()
                            .map(String ::toUpperCase)
                            .toList();

        Unames.forEach(System.out::println);                   
    }
    
}
