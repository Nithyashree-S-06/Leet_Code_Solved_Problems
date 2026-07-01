class Solution {
    public int pivotIndex(int[] n) {
        int[] pf=new int[n.length];
        int[] sf=new int[n.length];
        pf[0]=n[0];
        sf[n.length-1]=n[n.length-1];
        for(int i=1; i<n.length; i++){
            pf[i]=pf[i-1] + n[i];
        }
        for( int i=n.length-2; i>=0; i--){
            sf[i]=sf[i+1] + n[i];
        }
        for(int i=0; i<n.length; i++){
            int ls=(i==0)?0:pf[i-1];
            int rs=(i==n.length-1)?0:sf[i+1];

            if(ls==rs){
                return i;
            }
                
            }
        return -1;

    }
}