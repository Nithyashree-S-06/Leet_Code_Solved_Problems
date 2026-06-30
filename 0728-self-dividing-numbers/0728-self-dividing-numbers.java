class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> res =  new ArrayList<>();
        for(int n=left; n<=right; n++){
            int div=1;
            boolean SelfDivide=true;
            int temp=n;
            while(temp>0){
                int ld=n%(div*10)/div;
                if(ld==0 || n%ld!=0){
                    SelfDivide=false;
                    break;
                }
                div*=10;
                temp/=10;
            }
            if(SelfDivide){
                res.add(n);
            }
        }
        return res;
        
    }
}