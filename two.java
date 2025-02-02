package leetCode;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // No solution found
    }
}

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> xo = new ArrayList<>();
        while (sc.hasNextInt()) {
            xo.add(sc.nextInt());
        }
        int target = sc.nextInt();
        int[] axx = new int[xo.size()];
        for (int i = 0; i < axx.length; i++) {
            axx[i] = xo.get(i);
        }
        Solution sss = new Solution();
        sss.twoSum(axx, target);

    }
}
