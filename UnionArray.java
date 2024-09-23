

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class UnionArray {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6,2};
        int[] result = new int[array1.length + array2.length];

        // System.arraycopy(array1, 0, result, 0, array1.length);
        // System.arraycopy(array2, 0, result, array1.length, array2.length);

        // // Print combined array
        // System.out.println(Arrays.toString(result));
//union
        //  Integer[] array1 = {1, 2, 3, 4};
        // Integer[] array2 = {3, 4, 5, 6};
        
        // Set<Integer> resultSet = new HashSet<>(Arrays.asList(array1));
        // resultSet.addAll(Arrays.asList(array2)); // Union operation

        // // Convert the result back to array
        // Integer[] result = resultSet.toArray(new Integer[0]);

        // // Print the result
        // System.out.println(Arrays.toString(result));

        for(int i = 0 ; i < array1.length + 5 ; i++){
            result[i] = array1[i];
        }
        for(int j = 0 ; j < array2.length ; j++){
            result[j + array1.length] = array2[j]; 

        }
        System.out.println(Arrays.toString(result));
    }
}


    
   
    