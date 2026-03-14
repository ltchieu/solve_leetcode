public class BinaryGap {
    public int solution(int N) {
        int numOfGapMax = 0;
        StringBuilder binary = new StringBuilder();
        int j = 0;
        int flag = 0;
        int count = 0;
        for(int i = 31; i >= 0; i--) {
            int bit = (N >> i) & 1;
            if(bit == 1) {
                j = i;
                flag = 1;
            }
            else {
                if(flag == 1) {
                    count++;
                }
                if((i - 1) >= 0 && (N >> (i - 1) & 1) == 1) {
                    if(count >= numOfGapMax){
                        numOfGapMax = count;
                        count = 0;
                        flag = 0;
                    }
                }
            }
            binary.append(bit);
        }
        System.out.println("Binary: " + binary.toString().replaceFirst("^0+(?!$)", ""));
        return numOfGapMax;
    }
}
