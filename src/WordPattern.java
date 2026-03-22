import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Object, Integer> map = new HashMap<>();
        String[] words = s.split(" ");

        if(words.length != pattern.length())
            return false;

        for(int i = 0; i < pattern.length(); i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i))) {
                return false;
            }
        }
        return true;
    }
}
