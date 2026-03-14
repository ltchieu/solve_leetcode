import java.util.HashSet;

public class FindMissingSmallestNumber {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : A) {
            if (x > 0) set.add(x);
        }
        System.out.println("Set of positive integers: " + set);
        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }
        return smallest;
    }
    
}
