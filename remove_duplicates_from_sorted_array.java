package leetCode;

/**
 * Innerremove_duplicates_from_sorted_array
 */
class Innerremove_duplicates_from_sorted_array {

    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = "_";
                }
            }
        }
    }
}

public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {

    }
}
