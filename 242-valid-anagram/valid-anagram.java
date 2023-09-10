class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            count.put(curr, count.getOrDefault(curr, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char curr = t.charAt(j);
            if (!count.containsKey(curr) || count.get(curr) - 1 < 0) {
                return false;
            }
            count.put(curr, count.getOrDefault(curr, 0) - 1);
        }
        return true;
        
    }
}