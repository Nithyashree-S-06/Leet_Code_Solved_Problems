class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(String word: words){
            boolean isconsistent=true;
            for(int i=0; i<word.length(); i++){
                String chr=String.valueOf(word.charAt(i));
                if(!allowed.contains(chr)){
                    isconsistent=false;
                    break;
                }
            }
            if(isconsistent) cnt++;
        }
        return cnt;
    }
}