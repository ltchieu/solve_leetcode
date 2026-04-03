import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1] + 1){
                if(nums[j] != nums[i - 1])
                    result.add(nums[j] + "->" + nums[i - 1]);
                else
                    result.add(String.valueOf(nums[j]));
                j = i;
            }
        }
        if(nums[j] != nums[nums.length - 1])
            result.add(nums[j] + "->" + nums[nums.length - 1]);
        else
            result.add(String.valueOf(nums[j]));
        return result;
    }
}
