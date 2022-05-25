package lab2.MatchSwap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchSwap {

    /**
     * Modify a list of strings such that two strings with same
     * first letter are swapped.
     * For example, matchSwap(["ap", "bp", "cp", "aq", "cq", "bq"]) →
     * ["aq", "bq", "cq", "ap", "cp", "bp"].
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return the modified list.
     */
    public static List<String> matchSwap(List<String> list) {
        Map<String, Integer> swapMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String firstChar =  String.valueOf(list.get(i).charAt(0));
            if (swapMap.containsKey(firstChar)) {
                String temp = list.get(swapMap.get(firstChar));
                list.set(swapMap.get(firstChar), list.get(i));
                list.set(i, temp);
                swapMap.remove(firstChar);
            } else {
                swapMap.put(firstChar, i);
            }
        }
        return list;
    }
}