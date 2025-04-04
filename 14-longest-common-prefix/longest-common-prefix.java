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
        if (str.startsWith(prefix))
            return prefix;
        return substring(str, prefix.substring(0, prefix.length() - 1));
    }


    // еще одно интересное решение
    public String longestCommonPrefixADD(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}