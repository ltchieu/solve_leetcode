import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                k++;
                continue;
            }
            else {
//                if (i != 0) {
//                    int temp = nums[j];
//                    nums[j++] = nums[i];
//                    nums[i] = temp;
//                }
                nums[j++] = nums[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(nums));
        return nums.length - k;
    }
}
