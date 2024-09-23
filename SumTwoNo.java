// import java.util.Arrays;

import java.util.Arrays;

public class SumTwoNo {
    public int[] twoSum(int[] array , int target){
        // int[] result = new int[2];
        for(int i = 0 ; i < array.length -1 ; i++){
            for (int j = i + 1; j < array.length; j++) {
                // Check if the two elements add up to the target
                if (array[i] + array[j] == target) {
                    // If they do, return their indices
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        SumTwoNo t = new SumTwoNo();
        int array[] = {-1,-2,-3,-4,-5};
        int target = 6;
        System.out.println(Arrays.toString(t.twoSum(array, target)));
        
    }    
}
