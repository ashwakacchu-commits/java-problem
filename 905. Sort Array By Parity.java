class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int insertPos = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }
        
        return nums;
    }
}
