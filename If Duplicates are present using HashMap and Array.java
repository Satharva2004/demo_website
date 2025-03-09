class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n-1;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}


// HashMap 
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<=n-1;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
