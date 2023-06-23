class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        int remainder=n%4;
        if(remainder!=0) return false;
        return isPowerOfFour(n/4);
    }
}
