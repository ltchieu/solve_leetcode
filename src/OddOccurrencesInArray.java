public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int result = 0;
        for (int number : A) {
            result ^= number;
            System.out.println("Current number: " + number + ", Intermediate result: " + result);
        }
        return result;
    }
    
}
