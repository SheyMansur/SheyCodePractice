class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            count.put(curr, count.getOrDefault(curr, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char curr = t.charAt(j);
            count.put(curr, count.getOrDefault(curr, 0) - 1);
        }
        for (char c : count.keySet()) {
            if (count.get(c) != 0) {
                return false;
            }
        }
        return true;
        
    }
}