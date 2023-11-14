
public class search_range {
    public static int first = -1;
    public static int last = -1;
    public static void searchRange(int[] nums, int target, int idx) {
        if(idx==nums.length){
            System.out.println("First: "+first);
            System.out.println("Last: "+last);
            return;
        }
        if(nums[idx]==target){
            if(first==-1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        searchRange(nums, target, idx+1);
    }    
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10,8};
        int target = 8;
        searchRange(nums, target, 0);
    }
}
