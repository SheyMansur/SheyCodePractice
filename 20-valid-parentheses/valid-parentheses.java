class Solution {
    public boolean isValid(String s) {
        Stack<Character> cache = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            switch (curr) {
                case '(': case '[': case '{': cache.push(curr); break;
                case ')': if (cache.empty() || cache.pop() != '(') {return false;} break;
                case ']': if (cache.empty() || cache.pop() != '[') {return false;} break;
                case '}': if (cache.empty() || cache.pop() != '{') {return false;} break;
            }
        }
        return cache.size() == 0;
    }
}