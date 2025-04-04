class Solution {
// BEST DECISION

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }


// MY FIRST DECISION
    public int romanToIntMyFirstDecision(String s) {
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