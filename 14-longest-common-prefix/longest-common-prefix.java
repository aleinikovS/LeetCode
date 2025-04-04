class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0 || prefix.length() == 0) {
                return "";
            }

            if (prefix.length() < strs[i].length()) {
                prefix = count(strs[i], prefix);
            } else {
                prefix = count(prefix, strs[i]);
            }
        }
        return prefix;
    }

    private String count(String str, String subStr) {
        if (str.startsWith(subStr)) {
            return subStr;
        } else {

            String newSubStr = "";
            for (int i = 0; i < subStr.length(); i++) {
                if (str.charAt(i) != subStr.charAt(i)) return newSubStr;
                newSubStr += subStr.charAt(i);
            }
            return newSubStr;
        }
    }
}