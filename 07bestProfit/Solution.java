class Solution {
    public int maxProfit(int[] prices) {
        int buy;
        int profit=0;
        buy=prices[0];
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(buy<prices[i]){
                if((prices[i]-buy)>profit){
                    profit=prices[i]-buy;
                }
            }
            if(buy>prices[i]){
                buy=prices[i];
            }
        }
        return profit;
    }
}