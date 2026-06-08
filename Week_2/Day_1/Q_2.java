class Solution {
    public int firstUniqChar(String s) {

      // Method 1.......

        // int n = s.length();

        // HashMap<Character, Integer> map = new HashMap<>();

        // // filling the hashmap with character and index

        // for(int i = 0; i < n ; i++){
        //     if(map.containsKey(s.charAt(i))){
        //         int freq = map.get(s.charAt(i));
        //         map.put(s.charAt(i), freq + 1);
        //     }
        //     else map.put(s.charAt(i), 1);
        // }

        // // checking for the first unique character in hashmap

        // for(int i = 0; i < n; i++){
        //     if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) return i;
        // }
        // return -1;



      // Method 2..............
        
        int n = s.length();

        int[] arr = new int[26];

        // filling the array 

        for(int i = 0; i < n ; i++){
            arr[s.charAt(i) - 'a']++;
        }

        // checking for the first unique character in hashmap
        
        for(int i = 0; i < n; i++){
            if(arr[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
