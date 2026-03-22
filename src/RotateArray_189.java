public class RotateArray_189 {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, n, 0);
        System.out.println("After first reverse: " + java.util.Arrays.toString(nums));
        reverse(nums, k, 0);
        System.out.println("After second reverse: " + java.util.Arrays.toString(nums));
        reverse(nums, n, k);

        return nums;
    }

    public int[] reverse(int[] nums, int end, int start) {
        while(start < end - 1) {
            int temp = nums[start];
            nums[start] = nums[end - 1];
            nums[end - 1] = temp;
            start++;
            end--;
        }
        
        return nums;
    }
}
