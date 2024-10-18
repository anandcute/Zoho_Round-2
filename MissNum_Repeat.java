



public class MissNum_Repeat {
    static int[] findTwoElement(int arr[]) {
        
        // code here
        int n = arr.length;
        int repeatNum = 0 ;
        for(int i = 0 ; i < arr.length -1 ; i++){
             int ind=Math.abs(arr[i])-1;
            if(arr[ind]<0)
                repeatNum=ind+1;
            else
                arr[ind]=-arr[ind];
        }
             int missNum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                missNum=i+1;
                break;
            }
        }
        
        int[] res = new int[2];
        res[0] = repeatNum;
        res[1] = missNum;
        
        return res ;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,7,-1};
        System.out.println(findTwoElement(arr));
    }
}