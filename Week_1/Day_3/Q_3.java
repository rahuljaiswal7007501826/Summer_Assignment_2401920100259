class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int maxWater = 0;
        while(j > i){
            int water = Math.min(height[i], height[j]) * (j - i);
            maxWater = Math.max(water, maxWater);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxWater;
    }
}
