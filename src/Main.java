import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[] nums = {1,2,3,4,5,6,7};
      RemoveDuplicatedFromSortedArray a = new RemoveDuplicatedFromSortedArray();
      a.removeDuplicates(nums);
      System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}