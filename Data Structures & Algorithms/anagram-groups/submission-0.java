class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> count = new HashMap<>(); 
        for(int i = 0; i < strs.length; i++){
            char[] wordArray = strs[i].toCharArray(); 
            Arrays.sort(wordArray); 
            String sorted = new String(wordArray); 
            List<String> value = count.get(sorted); 
            if(value == null){
                value = new ArrayList<>(); 
                count.put(sorted, value); 
            }
            value.add(strs[i]); 
        }
        List<List<String>> groupAnagram = new ArrayList<>(); 
        for (List<String> v : count.values()){
            groupAnagram.add(v);
        }
        return groupAnagram; 
    }
}
