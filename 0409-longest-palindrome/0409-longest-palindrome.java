class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();
        int length=0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
                length+=2;
            }
            else{
                set.add(ch);
            }
        }
        return set.isEmpty() ? length : length+1;
    }
}