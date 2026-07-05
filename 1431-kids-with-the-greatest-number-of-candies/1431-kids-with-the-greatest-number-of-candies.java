class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> A=new ArrayList<>();
        int max_candy=0;
        for(int candy :  candies){
            if(candy > max_candy) max_candy=candy;
        }
        for(int i=0; i<candies.length; i++){
            if((candies[i]+extraCandies)>=max_candy) A.add(true);
            else A.add(false);
        }
        return A;
    }
}