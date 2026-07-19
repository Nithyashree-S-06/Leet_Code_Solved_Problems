class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre=strs[0];
        for(String s : strs){
            while(s.indexOf(pre)!=0){
                pre=pre.substring(0, pre.length()-1);
                if(pre.isEmpty()) return "";
            }

        }

        if(strs==null || strs.length==0) return "";
        return pre;
    }
}