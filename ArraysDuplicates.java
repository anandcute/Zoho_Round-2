import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysDuplicates {
    public ArrayList<Integer> findDuplicates(int[] array) {
        int n = array.length;
        boolean checkDuplicate = false;
        Arrays.sort(array);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1 ; i < n ; i++){
            if(array[i-1] == array[i]){
                if(!list.contains(array[i])){
                    list.add(array[i]);
                }
                checkDuplicate = true;
            }
        }
        if(!checkDuplicate){
            list.add(-1);
        }
        return list;
    }
    public static void main(String[] args) {
        ArraysDuplicates obj = new ArraysDuplicates();
        int[] array = {10,3,10,38,22,3,9};
        // System.out.println(obj.findDuplicates(array));
        Iterator <Integer> it = obj.findDuplicates(array).iterator();
        while (!it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
