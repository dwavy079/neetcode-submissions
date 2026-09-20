class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // count how many times each character appears in t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // use up those counts with the characters of s
        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return false;   // s has a char that t doesn't have (or has too many of it)
            }
            map.put(c, count - 1);
        }

        return true;
    }
}
