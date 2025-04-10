class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        boolean flag = false;
        for(int i:nums){
            if(i == 0){
                flag = true;
            }
            if(i < 0){
                return -1;
            }
            sum += i;
        }
        if(!flag)
            return 0;

        sum = (n*(n+1)/2) - sum;
        if(sum == 0)
            return n+1;

        return sum;
    }
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        System.out.println(obj.missingNumber(new int[]{1,2,4,0,-1}));
    }
}