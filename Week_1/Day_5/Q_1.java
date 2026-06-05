class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();
        
        // removing and changing unwanted characters
        for(char ch : s.toCharArray()){
            if(ch >= 48 && ch <= 57){
                str.append(ch);
            }
            else if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                str.append(Character.toLowerCase(ch));
            }
        }

        int n = str.length();
        int i = 0;
        int j = n-1;

        // checking for paindrome
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }

        return true;
    }
}
