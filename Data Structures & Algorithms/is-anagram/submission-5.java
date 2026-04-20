class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
    }else{
        return false;
    }

        HashMap<Character,Integer> smap = new HashMap<>();
        for(int i = 0; i< s.length() ; i++){
            Character ch = s.charAt(i);
            if (smap.containsKey(ch)){
                int count = smap.get(ch);
                smap.put(ch,count+1);
            }
            else
            {
                smap.put(ch,1);
            }
        }

        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i = 0; i< t.length() ; i++){
            Character ch = t.charAt(i);
            if (tmap.containsKey(ch)){
                int count = tmap.get(ch);
                tmap.put(ch,count+1);
            }
            else
            {
                tmap.put(ch,1);
            }
        }

        

        for (Character key : smap.keySet()){
            if (tmap.containsKey(key) && smap.get(key).equals(tmap.get(key))){
            }else{
                return false;
            }
        }

        return true;
    }
}
