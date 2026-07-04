class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        s=s.toLowerCase();
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else if(!(('a'<=s.charAt(l) && s.charAt(l)<='z') || ('0'<=s.charAt(l) && s.charAt(l)<='9'))) l++;
            else if(!(('a'<=s.charAt(r) && s.charAt(r)<='z') || ('0'<=s.charAt(r) && s.charAt(r)<='9'))) r--;
            else return false;
        }
        return true;
    }
}
