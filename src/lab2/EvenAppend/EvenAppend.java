package lab2.EvenAppend;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EvenAppend {

    /**
     * Append words that appear the 2nd, 4th, 6th, etc. time in a list.
     * For example, evenAppend(["a", "b", "b", "a", "a", "b", "b"]) → "bab".
     * @param list is a list of words.
     * @return a concatenation of even appearing words.
     */
    public static String evenAppend(List<String> list) {
        String ans = "";
        Map<String, Integer> counter = new HashMap<>();
        for(String element:list){
            if(!counter.containsKey(element)){
                counter.put(element,1);
            }else{
                counter.put(element, counter.get(element) + 1);
                if (counter.get(element) % 2 == 0) {
                    ans += element;
                }
            }
        }
		return ans;
    }

}
