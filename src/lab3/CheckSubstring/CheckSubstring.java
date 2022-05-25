package lab3.CheckSubstring;

public class CheckSubstring {
	
    /**
     * Check if at least n copies of a substring occur in input string.
     * They may overlap.
     * For example, checkSubstring("ababaxxxaba", "aba", 3) → true
     * @param input is the input string.
     * @param subs is the non-empty substring.
     * @param n is non-negative number of occurrences.
     * @return true iff at least n copies of subs occur in input.
     */
    public static boolean checkSubstring(String input, String subs, int n) {
        // base case
        if (n <= 0)
            return true;
        if (subs.length() > input.length() && n > 0)
            return false;
        // recursive step
        if (input.substring(0, subs.length()).equals(subs))
            //substring이 있으니 n은 1감소, input은 맨 앞 지우고 recursive
            return checkSubstring(input.substring(1), subs, n-1);
        else
            //substring이 없으니 n은 고정, input은 맨 앞 지우고 recursive
            return checkSubstring(input.substring(1), subs, n);
    }
}
