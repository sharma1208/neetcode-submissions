class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){
            numCount.put(nums[i], numCount.getOrDefault(nums[i], 0) + 1); 
            if(numCount.get(nums[i]) > 1){
                return true; 
            }
        }

        return false; 


    }
}