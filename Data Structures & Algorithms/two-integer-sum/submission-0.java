class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> counts = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){
            counts.put(nums[i], i); 
        }
        for(int i = 0; i < nums.length; i++){
            int sum = target - nums[i];
            if(counts.containsKey(sum) && i != counts.get(sum)){
                return new int[]{i, counts.get(sum)};
            }
        }
        return new int[]{0,0};
    }
}
