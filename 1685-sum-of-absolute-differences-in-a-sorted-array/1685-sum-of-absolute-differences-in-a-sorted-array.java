class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int[] prefixSum = new int[n + 1];
        
       
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        
        
        for (int i = 0; i < n; i++) {
            int left = nums[i] * i - prefixSum[i];
            int right = (prefixSum[n] - prefixSum[i + 1]) 
                        - nums[i] * (n - i - 1);
            result[i] = left + right;
        }
        
        return result;
    }
}