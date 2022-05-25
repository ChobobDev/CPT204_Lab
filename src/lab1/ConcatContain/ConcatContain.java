package lab1.ConcatContain;

public class ConcatContain {

    /**
     * Compute the smallest number of times source is concatenated with itself
     * so that the resulting string contains target.
     * For example, For example, source "ab" concatenated 2 times "ab"+"ab"+"ab" into "ababab"
     * contains target "baba".
     * @param source a non-empty string to be concatenated.
     * @param target a non-empty string that can be contained in repeatedly concatenated source.
     * @return the smallest number of times of the concatenation.
     */
    public static int concatContain(String source, String target) {
        String copy_of_src = source;
        boolean is_found = false;
        int count=0;
        while(!is_found){
            if(source.contains(target)){
                is_found=true;
            }else{
                source=source.concat(copy_of_src);
                count++;
            }
            if (count>=10000){
                return -1;
            }
        }
		return count;
    }

    
}