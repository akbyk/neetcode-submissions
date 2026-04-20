class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Hashtable<Character, Character> ht = new Hashtable<>();

        ht.put(')','(');
        ht.put('}','{');
        ht.put(']','[');


        
        for(int i = 0; i<s.length(); i++){
            if(ht.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty() && stack.peek().equals(ht.get((Character)s.charAt(i)))){
                   stack.pop();
                }else{
                    return false;
                }
            }
            
        }
        return stack.isEmpty() ? true : false;
        
        
    }
}
