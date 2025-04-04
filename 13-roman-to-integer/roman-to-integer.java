class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        char[] chs = s.toCharArray();
        int l = chs.length;
        int result = 0;

        for (int i = l - 1; i >= 0; i--) {
            String a = i == 0 ? "" : String.valueOf(chs[i - 1]);
            String b = String.valueOf(chs[i]);
            String romanStr = a + b;
            if (map.containsKey(romanStr)) {
                result += map.get(romanStr);
                i -= 1;
                continue;
            }
            result += map.get(b);
        }
        return result;
    }
}