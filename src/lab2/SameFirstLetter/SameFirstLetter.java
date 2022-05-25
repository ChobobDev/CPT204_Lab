package lab2.SameFirstLetter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameFirstLetter {

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {
        Map<String, String> sameLetter = new HashMap<>();
        for(String word:list){
            String first_letter = String.valueOf(word.charAt(0));
            if(!sameLetter.containsKey(first_letter)){
                sameLetter.put(first_letter,word);
            }else{
                sameLetter.put(first_letter,sameLetter.get(first_letter)+","+word);
            }
        }
        return sameLetter;
    }

}