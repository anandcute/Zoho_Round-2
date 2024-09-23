import java.util.HashSet;

public class IntersectuonArray {
    public static int  intersection(int arr1[] , int arr2[] , int n , int m){
        int count = 0 ;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < m ; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(set);
        return count; 
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3,4,5};
        int n = arr1.length;
        int m = arr2.length;
       
        System.out.println( intersection(arr1, arr2, n, m));
    }
}
