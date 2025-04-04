class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() == 0)
                break;
            if (strs[i].startsWith(prefix))
                continue;
            prefix = substring(strs[i], prefix);
        }
        return prefix;
    }

    private static String substring(String str, String prefix) {
        if (prefix.length() == 0)
            return "";
        if (!str.startsWith(prefix))
            prefix = substring(str, prefix.substring(0, prefix.length() - 1));
        return prefix;
    }
}