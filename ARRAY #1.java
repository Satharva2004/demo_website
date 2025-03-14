//Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int store = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                if(store<count){
                     store = count;
                }
            }else
            {
                count = 0;
            }
            
        }
        return store;
    }
}



//Find Numbers with Even Number of Digits
/*Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.*/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                nums[i] = nums[i]/10;
                count++;
            }
            arr[i] = count;
            count = 0;
        }
        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                result++;
            }
        }
        return result;
    }
}




//Squares of a Sorted Array
/*Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<n;i++){
            ans[i] = nums[i]*nums[i];
        }
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(ans[j] > ans[k]){
                    int temp = ans[j];
                    ans[j] = ans[k];
                    ans[k] = temp;
                }
            }
        }
        return ans;
    }
}
