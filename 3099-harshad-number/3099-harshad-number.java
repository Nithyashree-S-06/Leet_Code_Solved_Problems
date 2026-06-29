class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int div=1; int sum=0; int di;
        while(div<=x){
            int ld=x%(div*10)/div;
            sum = sum+ld;
            div*=10;

        }
        if(x%sum==0){
            return sum;
        }
        else{return -1;}
        
    }
}