class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
while(left<right && !((s.charAt(left)>='a'&& s.charAt(left)<='z' || s.charAt(left)>='A'&& s.charAt(left)<='Z' || s.charAt(left)>='0' && s.charAt(left)<='9' ))){
    left++;
}
while(left<right && !((s.charAt(right)>='a'&& s.charAt(right)<='z' || s.charAt(right)>='A'&&s.charAt(right)<='Z' || s.charAt(right)>='0' && s.charAt(right)<='9' ))){
    right--;
}
char l=s.charAt(left);
char r=s.charAt(right);
if(l>='A'&&l<='Z'){
    l+=32;
}
if(r>='A'&&r<='Z'){
    r+=32;
}
if(l!=r){
    return false;
}
left++;
right--;
}
return true;
}}