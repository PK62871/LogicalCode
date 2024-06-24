import java.util.*;

public class CountNumberOfWord {

    public static void main(String[] args) {

        String s = "prabhakar kumar";

        Map<Character, Integer> map = new HashMap<>();

        char[] c = s.toCharArray();

        for (char ch : c) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int val = map.get(ch);
                map.put(ch, val + 1);
            }
        }

	System.out.println(map);        
    }
}
