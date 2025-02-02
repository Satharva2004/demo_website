package leetCode;

import java.util.Scanner;

class Solution1 {
    public boolean isPalindrome(String x) {
        int reversed = 0;

        while (x <= x.length()) {
            int rem = x % 10;
            reversed = reversed * 10 + rem;
            x /= 10;
        }
        String s = Integer.toString(original);
        if (reversed < 0) {
            return s.equals(reversed);
        }
        String s2 = Integer.toString(reversed);
        return s.equals(s2);
    }
}

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        Solution1 os = new Solution1();
        boolean yy = os.isPalindrome(x);
        System.out.println(yy);
    }
}
