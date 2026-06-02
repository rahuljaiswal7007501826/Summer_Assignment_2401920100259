class Solution {
    public int maxSubArray(int[] nums) {


        // Basic Approach    O(n^3)

        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         int sum = 0;
        //         for(int k = i; k <= j; k++){
        //             sum += nums[k];
        //         }
        //         max = Math.max(max, sum);
        //     }
        // }
        // return max;



        //  O(n^2)

        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += nums[j];
        //         max = Math.max(max, sum);
        //     }
        // }
        // return max;



        // Optimal  O(n)

        int n = nums.length;
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1; i < n; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
