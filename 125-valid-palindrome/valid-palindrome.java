class Solution {
    public boolean isPalindrome(String s) {
        String x=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String y=new StringBuilder(x).reverse().toString();
        if(y.equals(x)){
            return true;
        }
        else{
            return false;
        }
    }
}