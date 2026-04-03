import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> setNum = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(setNum.contains(nums[i]))
                return true;

            setNum.add(nums[i]);
            if(setNum.size() > k){
                setNum.remove(nums[i - k]);
            }
        }
        return false;
    }
}
