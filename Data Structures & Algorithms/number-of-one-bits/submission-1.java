class Solution {
    public int hammingWeight(int n) {
        if(n == 0){
            return 0;
        }

        int x = 0;
        while(n > 0){
            if(n % 2 == 1){
                x++;
            }
            n /= 2;
        }

        return x;
        
    }
}
