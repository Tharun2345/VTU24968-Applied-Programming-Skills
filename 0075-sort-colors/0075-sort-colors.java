class Solution {
    public void sortColors(int[] nums) {
        int low = 0, curr = 0, high = nums.length-1;
        while (curr <= high){
            if (nums[curr] == 0){
                int temp = nums[curr];
                nums[curr] = nums[low];
                nums[low] = temp;
                low++; curr++;
            }
            else if (nums[curr] == 1){
                curr++;
            }
            else {
                int temp = nums[curr];
                nums[curr] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}