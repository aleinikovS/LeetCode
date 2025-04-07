class Solution {
// BEST
    public boolean isPalindromes(int x) {
        //числа не должны быть отрицательными и заканчиваться на 0
        if (x < 0) return false;
        if (x % 10 == 0 && x != 0) return false;

        int tmp = x;
        int reversed = 0;

        // тут мы берем последнее число от tmp и прибавляем его на то место, где его десяток.
        while (tmp != 0) {
            reversed = reversed * 10 + tmp % 10;
            tmp /= 10;
        }

        return reversed == x;
    }

// MY EASY DECISION
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        String reversed = new StringBuilder(value).reverse().toString();
        return value.equals(reversed);
    }
}