/**
 * leetcode 27
 */
public class DeleteEqualityItem {
    
    public static int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == val) {
                i++;
                continue;
            }
            nums[j-i] = nums[j];
        }
        return nums.length - i;
    }
    
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));

    }
}