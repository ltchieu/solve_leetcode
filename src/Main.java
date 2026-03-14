import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int[] nums = {1,2,3,4,5,6,7};
      RotateArray_189 a = new RotateArray_189();
      a.rotate(nums, 3);
      System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}