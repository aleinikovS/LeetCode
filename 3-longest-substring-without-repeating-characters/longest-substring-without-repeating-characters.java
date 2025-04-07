class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                }
                set.add(c);
            }
            result = result >= set.size() ? result : set.size();
            set.clear();
        }

        return result;
    }
}