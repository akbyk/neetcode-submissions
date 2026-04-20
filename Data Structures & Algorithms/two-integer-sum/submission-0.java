class Solution {
    public int[] twoSum(int[] nums, int target) {
       int difference;
       Hashtable<Integer, Integer> ht = new Hashtable<>();

       for(int i = 0; i < nums.length; i++){
        difference = target - nums[i]; 

        if(ht.containsKey(difference)){
         return new int[]{ht.get(difference), i};
        }else{
            ht.put(nums[i], i);
        }
       }

       return null; 
    }
}