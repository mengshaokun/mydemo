import java.util.HashSet;
import java.util.Set;

/**
 * 202.快乐数
 * https://leetcode-cn.com/problems/happy-number/
 */
public class leetcode_202 {

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> integers = new HashSet<>();
        while (n != 1 && !integers.contains(n)) {
            integers.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n != 0) {
            int i = n % 10;
            sum = sum + i * i;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        leetcode_202 leetcode_202 = new leetcode_202();
        System.out.println(leetcode_202.isHappy(2));;
    }
}
