public class BuySellStock {
    private int profitMax(int[] nums){
        int profit = 0;
        int buy = nums[0];
        int sell = 0;
        for(int i=1; i<nums.length; i++){
            int tempProfit = nums[i] - buy;
            profit = Math.max(tempProfit, profit);
            buy = Math.min(nums[i],buy);
        }
        return profit;
    }

    public static void main(String[] args){
        BuySellStock obj = new BuySellStock();
       System.out.println(obj.profitMax(new int[]{7,1,5,3,6,4}));
    }
}
