/**
 * 27.移除元素
 * https://leetcode-cn.com/problems/remove-element/
 */
public class leetcode_27 {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
               j++;
            }
        }
        return j;
    }

}
