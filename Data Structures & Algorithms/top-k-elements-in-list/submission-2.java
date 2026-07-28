class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreq = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){
            numFreq.put(nums[i], numFreq.getOrDefault(nums[i] , 0) + 1); 
        }
        int[] kFrequent = new int[k]; 

        for(int i = 0; i < k; i++){
            int max = -1000;
            int key = -1; 
                for ( Integer m : numFreq.keySet()){
                    if(max <= numFreq.get(m)){
                        max = numFreq.get(m);
                        key = m;
                    }
                }
            kFrequent[i] = key;
            numFreq.remove(key);
        }

        return kFrequent;
        
    }
}
