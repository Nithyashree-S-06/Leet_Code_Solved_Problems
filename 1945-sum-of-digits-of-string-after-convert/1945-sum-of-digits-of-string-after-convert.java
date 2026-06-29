class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                int ans=ch-'a'+1;
                sb.append(ans);
            }
        }
        String numStr = sb.toString();
        int sum=0;
        while(k>0){
            sum=0;
            for(int i=0; i<numStr.length(); i++){
                char ch1=numStr.charAt(i);
                sum += ch1 - '0';
            }
            numStr = String.valueOf(sum);
                k--;
        }
         return sum; 
    }
}