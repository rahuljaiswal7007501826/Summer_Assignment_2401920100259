class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int a = 0, b = 1;
        while(b < n){
            if(nums[a] < nums[b]){
                // Modifying the given array
                nums[++a] = nums[b];
            }
            b++;
        }
        return a+1;
    }
}
