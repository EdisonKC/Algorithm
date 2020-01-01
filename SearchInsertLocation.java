public class SearchInsertLocation {
    
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) {
            return 0;
        }
        for(int i=0; i < nums.length; i++) {
            if (nums[nums.length-1] < target) {
                return nums.length;
            }
            else if (target < nums[i]) {
                return 0;
            }
            else if(nums[i] == target) {
                return i;
            }
            else if(nums[i] < target && nums[i+1] > target) {
                return i+1;
            }
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
        int nums[] = {1,3,5,8,9,10};
        System.out.println(searchInsert(nums,11));
    }
}