class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        long sum = 0;

        // calculating sum for first k elements
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
 
        long max = sum;

        // sliding window of k length calculating maximum sum of subarray of k length
        for(int i = k; i < n; i++){
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        // calculate average and return it
        return (double)max/k;
    }
}
