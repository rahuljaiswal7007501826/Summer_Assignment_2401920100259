class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;

        StringBuilder sb = new StringBuilder();

        int len = strs[0].length();

        for(int i = 0; i < len; i++){

            char ch = strs[0].charAt(i);
            boolean flag = true;

            for(int j = 1; j < n; j++){
                if(i >= strs[j].length() || ch != strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }

            if(flag) sb.append(ch);
            else break;

        }
        
        return sb.toString();
    }
}
