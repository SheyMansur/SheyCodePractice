class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char curr = magazine.charAt(i);
            count.put(curr, count.getOrDefault(curr, 0) + 1);
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            char curr = ransomNote.charAt(j);
            int counted = count.getOrDefault(curr, 0) - 1;
            if (counted < 0) {
                return false;
            }
            count.put(curr, counted);
        }
        return true;
    }
}