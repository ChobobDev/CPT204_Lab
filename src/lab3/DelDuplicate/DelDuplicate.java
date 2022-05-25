package lab3.DelDuplicate;

public class DelDuplicate {
	
    /**
     * Remove adjacent duplicate characters in a string.
     * For example, delDuplicate("aaabbc") → "abc".
     * @param input is the input string.
     * @return the resulting string.
     */
    public static String delDuplicate(String input) {
        // base case
        //empty string 이거나 size 가 1인 string일 경우 input을 return
        if (input.length() < 2) {
            return input;
        }
        // recursive step
        if (input.charAt(0) == input.charAt(1)) {
            //만약 같다면, 첫 letter 지우고 재귀
            return delDuplicate(input.substring(1));
        } else {
            //만약 다르다면 첫 letter + 재기함수 값
            return input.charAt(0) + delDuplicate(input.substring(1));
        }
    }
}
