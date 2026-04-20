class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        for(int num : nums){
            if(!temp.contains(num)){
                temp.add(num);
             } 
             else{
                return true;
             }
        }
        return false;
    }
 }