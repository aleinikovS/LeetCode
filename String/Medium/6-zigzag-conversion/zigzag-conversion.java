class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i=0; i < numRows; i++)
            sb[i] = new StringBuilder();
        boolean reverse = false;
        int pivot = 0;

        for (char ch : s.toCharArray()) {
            if (pivot == numRows - 1) 
                reverse = true;
            else if (pivot == 0)
                reverse = false;

            sb[pivot].append(ch);

            if (reverse)
                pivot--;
            else
                pivot++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length; i++) {
            result.append(sb[i].toString());
        }

        return result.toString();
    }
}