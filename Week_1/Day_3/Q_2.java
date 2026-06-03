class Solution {
    public int[] sortedSquares(int[] nums) {

        // Square and sort....

        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     nums[i] *= nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;


        // using extra array and two pointer

        int n = nums.length;
        int a = 0;
        int b = n-1;
        int[] res = new int[n];
        for(int i = n-1; i >= 0; i--){
            if(Math.abs(nums[a]) < Math.abs(nums[b])){
                res[i] = nums[b]*nums[b];
                b--;
            }
            else{
                res[i] = nums[a]*nums[a];
                a++;
            }
        }
        return res;
    }
}
