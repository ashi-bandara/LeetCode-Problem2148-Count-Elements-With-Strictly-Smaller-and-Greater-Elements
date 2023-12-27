import java.util.Arrays;

class Solution {
    public int countElements(int[] nums) {
        int largest = Arrays.stream(nums).max().getAsInt();
        int smallest = Arrays.stream(nums).min().getAsInt();
        int count = 0;

        for (int num : nums) {
            if (num > smallest && num < largest) {
                count++;
            }
        }
        return count;
    }
}