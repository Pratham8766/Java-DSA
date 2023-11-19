public class check_sorted_array {
    //check is array is sorted
    public static boolean isSorted(int [] arr, int idx){  
        if(arr.length-1==idx){
            return true;
        }     
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3};
        boolean b = isSorted(arr, 0);
        System.out.println(b);
    }
}
