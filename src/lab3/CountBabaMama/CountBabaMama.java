package lab3.CountBabaMama;

public class CountBabaMama {

    /**
     * Count the number of occurrences of substrings "baba" or "mama"
     * in the input string recursively. They may overlap.
     * For example, countBabaMama("aba babaa amama ma") → 2,
     * and countBabaMama("bababamamama") → 4.
     * @param input is the input string.
     * @return the number of occurrences.
     */
    public static int countBabaMama(String input) {
        // base case
        //baba 나 mama 가 없으면 굳이 recursive 하지 않고 0을 반환
        if (!input.contains("baba") && !input.contains("mama")) {
            return 0;
        }
        // recursive step
        if (input.substring(0,4).equals("baba") || input.substring(0,4).equals("mama")) {
            return 1+countBabaMama(input.substring(1));
        }
        return countBabaMama(input.substring(1));
    }

}
