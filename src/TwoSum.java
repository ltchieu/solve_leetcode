import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> lookupMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if(lookupMap.containsKey(y)) {
                result[0] = lookupMap.get(y);
                result[1] = i;
            }
            else {
                lookupMap.put(nums[i], i);
            }
        }
        return result;
    }
}
