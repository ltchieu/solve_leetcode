public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = getNext(n);
        int fast = getNext(getNext(n));
        if(slow == 1 || fast == 1) return true;
        int i = 0;
        while (slow != 1 && fast != slow){
            i++;
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    public int getNext(int n) {
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            n /= 10;
            sum += num * num;
        }
        return sum;
    }
}
