/**
 * leetcode 26
 * 双指针法：
 * 1、设定两个指针，一个快指针j，一个慢指针i；
 * 2、如果nums[i] == nums[j],则增加j,跳过重复项
 * 3、当我们遇到nums[i]!=nums[j]的时候，则重复项结束，必须将nums[j]的值赋值给nums[i++]
 * 4、重复相同过程，知道j到数组最后
 */
public class DeleteDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }
}