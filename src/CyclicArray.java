import java.util.Arrays;

public class CyclicArray {
    public int[] solution(int[] A, int K) {
        if(A.length <= 1) {
            return A;
        }
        int[] result = A;
        for(int k = 1; k <= K; k++) {
            result[0] = A[A.length - 1];

            for(int i = 1; i < A.length; i++) {
                result[i] = A[i - 1];
            }
            A = Arrays.copyOf(result, A.length);
            // System.out.println("Array after " + k + " loop: " + Arrays.toString(result));
        }
       return result;
    }

    public int[] solution2(int[] A, int K) {
        int n = A.length;
        if (n <= 1 || K % n == 0) return A; // K chia hết cho n nghĩa là xoay xong về như cũ

        K = K % n; // Tối ưu: xoay 101 lần cũng giống xoay 1 lần nếu mảng dài 100
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            // Tính toán vị trí mới trực tiếp
            result[(i + K) % n] = A[i];
        }

        return result;
    }
}
