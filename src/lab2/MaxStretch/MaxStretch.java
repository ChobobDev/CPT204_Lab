package lab2.MaxStretch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStretch {

    /**
     * Find the largest stretch in a list.
     * For example, maxStretch([8(0), 5(1), 1(2), 2(3), 3(4), 4(5), 5(6), 10]) = 6.
     * @param list is a list of integers.
     * @return the largest stretch in list.
     */
    public static int maxStretch(List<Integer> list) {
        int max = 0;
        for(int i=0;i<list.size()-1;i++){
            for(int j=list.size()-1;j>i;j--){
                if(list.get(i)==list.get(j)){
                    if((j-i+1)>max){
                        max=j-i+1;
                    }
                }
            }
        }
        return max;
    }
}