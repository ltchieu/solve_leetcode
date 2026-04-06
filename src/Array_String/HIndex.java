package Array_String;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) { // Time Complexity: O(n^2)
        int h = 1;
        while(h <= citations.length){
            int count = 0; //Số bài báo có trích dẫn lớn hơn hoặc bằng h

            for (int citation : citations) {
                if (citation >= h)
                    count++;
            }

            if(count >= h)
                h++;
            else
                break;
        }

        return h - 1;
    }

    public int hIndexSolution2(int[] citations){
        int n = citations.length;
        Arrays.sort(citations);

        for(int i = 0;i < n; i++){
            if(citations[i] >= n - i)
                return n - i;
        }
        return 0;
    }
}
