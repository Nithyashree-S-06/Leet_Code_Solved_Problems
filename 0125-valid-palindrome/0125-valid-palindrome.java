class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res.append(Character.toLowerCase(c));
            }
        }
        int n=res.length();
        for(int i=0; i<n/2; i++){
            if(res.charAt(i) != res.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}