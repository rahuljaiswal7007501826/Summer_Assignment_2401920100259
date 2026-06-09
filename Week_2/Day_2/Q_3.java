class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        int m = s.length();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        ArrayList<Integer> ans = new ArrayList<>();

        if(n > m) return ans;

        for(int i = 0; i < n; i++){
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }
        
        if(Arrays.equals(freq1, freq2)) ans.add(0);

        for(int i = n; i < m; i++){
            freq1[s.charAt(i) - 'a']++;
            freq1[s.charAt(i - n) - 'a']--;
            if(Arrays.equals(freq1, freq2)) ans.add(i - n + 1);
        }
        
        return ans;
    }
}
