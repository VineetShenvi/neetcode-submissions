class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String lcp = "";

        for(int i=0; i<first.length(); i++){
            for(int j=1; j<strs.length; j++){
                if(i>=strs[j].length()) return lcp;
                if(strs[j].charAt(i) != first.charAt(i)) return lcp;
            }
            lcp += first.charAt(i);
        }

        return lcp;
    }
}