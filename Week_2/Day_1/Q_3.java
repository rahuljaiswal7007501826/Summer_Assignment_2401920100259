class Solution {
    public boolean canConstruct(String a, String b) {
        int[] arr = new int[26];
        for(int i = 0; i < a.length(); i++){
            arr[a.charAt(i) - 'a']++;
        }
        for(int i = 0; i < b.length(); i++){
            arr[b.charAt(i) - 'a']--;
        }
        for(int x : arr){
            if(x > 0) return false;
        }
        return true;
    }
}
