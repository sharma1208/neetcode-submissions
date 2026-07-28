class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int[] left = new int[nums.length]; 
        int tally = 1; 
        left[0] = 1; 
        for(int i = 1; i < left.length; i++){
            left[i] = tally * nums[i-1]; 
            tally = left[i]; 
        }
        int[] right = new int[nums.length]; 
        tally = 1; 
        right[nums.length-1] = 1; 
        for(int i = nums.length-2; i >= 0; i--){
            right[i] = tally * nums[i+1]; 
            tally = right[i]; 
        }
        for(int i = 0; i < product.length; i++){
            product[i] = left[i] * right[i];
        }

        return product;

    }

}  
