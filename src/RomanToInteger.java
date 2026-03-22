import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int count = 0;
        char[] stringRoman = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] romanValue = new int[] {1, 5, 10, 50, 100, 500, 1000};
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < romanValue.length; i++) {
            map.put(stringRoman[i],romanValue[i]);
        }
        int j = 0;
        while (j < s.length() - 1){
            char tmp = s.charAt(j);
            int num1 = map.get(tmp);
            int num2 =  map.get(s.charAt(j + 1));
            if( num1 < num2){
                count -= num1;
            }
            else {
                count += num1;
            }
            j++;
        }
        count += map.get(s.charAt(j));
        return count;
    }
}
