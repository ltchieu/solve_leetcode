import java.util.Arrays;

public class RemoveDuplicatedFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public int removeDuplicates2(int[] nums) {
        int j = 0;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != nums[j]) {
                j+=2;
                nums[j] = nums[i];
                if(nums[j] != nums[i-1]){
                    nums[j + 1] = nums[i];
                }
            }
            System.out.println("Array in " + i + " loop: " + Arrays.toString(nums));
        }
        System.out.println("Array after remove duplicated: " + Arrays.toString(nums));
        return j + 1;
    }
}
