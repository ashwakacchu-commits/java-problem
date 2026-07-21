class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // Pointer for the position of the last unique element found
        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            // Whenever we find a new unique element
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
