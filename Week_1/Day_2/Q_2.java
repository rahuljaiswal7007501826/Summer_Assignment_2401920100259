class Solution {
    public boolean containsDuplicate(int[] nums) {


        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(set.contains(nums[i])) return true;
        //     set.add(nums[i]);
        // }
        // return nums.length != set.size();


        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i-1] == nums[i]) return true;
        }
        return false;
    }
}
