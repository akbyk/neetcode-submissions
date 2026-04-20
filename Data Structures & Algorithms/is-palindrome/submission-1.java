class Solution {
    public boolean isPalindrome(String s) {

       String input = s.chars()
      .filter(Character::isLetterOrDigit)
      .mapToObj(c -> String.valueOf(Character.toLowerCase((char) c)))
      .collect(Collectors.joining());

        Hashtable<Integer, Character> ht = new Hashtable<>();
        
        for(int i = 0; i < input.length(); i++){
            ht.put(i, input.charAt(i));
        }
        
        int min = 0;
        int max = input.length() - 1;

        while(min < max){
            if(ht.get(min).equals(ht.get(max))){
             min ++;
             max--;
            }else{
            return false;
            }
        }
        return true;
    }
}