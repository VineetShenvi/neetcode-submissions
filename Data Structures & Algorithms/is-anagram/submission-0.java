class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            if (count.containsKey(curr))
                count.put(curr, count.get(curr)+1);
            else
                count.put(curr, 1);
        }

        for (int i=0; i<t.length(); i++)
        {
            char curr = t.charAt(i);
            if (count.containsKey(curr)){
                if (count.get(curr) == 0) return false;
                count.put(curr, count.get(curr)-1);
            }
            else return false;
        }

        return true;
    }

    
}
