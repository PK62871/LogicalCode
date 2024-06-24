import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        String str = "PKPS";

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set);
    }
}
