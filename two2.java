package leetCode;

/**
 * Innertwo2
 */
class Innertwo2 {
    public int[] sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

}

public class two2 {
    public static void main(String[] args) {

    }
}
