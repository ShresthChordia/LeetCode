class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int b=x;
        int c=0;
        while(b!=0){
            c=c*10 + b%10;
            b/=10;
        }
        if(x==c){
            return true;
        }
        else{
            return false;
        }
    }
}