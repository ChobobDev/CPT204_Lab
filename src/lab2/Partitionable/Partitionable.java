package lab2.Partitionable;

import java.util.List;

public class Partitionable {

    /**
     * Decide whether a list is partitionable.
     * For example, isPartitionable([1, 1, 1, 2, 1]) -> true,
     * and isPartitionable([2, 1, 1, 2, 1]) -> false.
     * @param list is a non-empty list of integers.
     * @return true iff list is partitionable.
     */
    public static boolean isPartitionable(List<Integer> list) {
        for(int i=1;i<list.size();i++){
            int sum_of_left=0;
            int sum_of_right=0;
            for(int j=0;j<i;j++){
                sum_of_left+=list.get(j);
            }
            for(int k=i;k< list.size();k++){
                sum_of_right+=list.get(k);
            }
            if(sum_of_left==sum_of_right){
                return true;
            }
        }
        return false;
    }
}
