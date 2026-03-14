import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int zeroIndex = 0;
        int s1Length = m + n - 1;
        for(int i = 0; i < m + n; i++){
            if(nums1[s1Length] != 0){
                zeroIndex = s1Length + 1;
                break;
            }
            s1Length--;
        }
        System.arraycopy(nums2, 0, nums1, zeroIndex, n);
        Arrays.sort(nums1);        

        System.out.println("Array nums1 after merge: " + Arrays.toString(nums1));
    }
}
