import java.util.*;
import java.util.stream.Collectors;


public class AddKumarInOneName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("prabhakar", "yash", "Akash");

        List<String> modifiedNames = names.stream()
                .map(name -> name.equalsIgnoreCase("prabhakar") ? "prabhakar kumar" : name)
                .collect(Collectors.toList());

        modifiedNames.forEach(System.out::println);
    }
}

