import java.util.Arrays;

public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        boolean flag = true;
        if( n <= 2)
            return 0;
        for(int i=2;i<n;i++){
            flag = true;
            for(int j=2;j<=i/2;j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count ++;
            }

        }
        return count;
    }

     public int countPrimesOpt(int n) {
            if (n <= 2) return 0;

            boolean[] isPrime = new boolean[n];
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                    // Use long to avoid overflow for i*i for large values of i.
                    for (long j =  (long)i * i; j < n; j += i) {
                        isPrime[(int) j] = false;
                    }
                }
            }
            return count;
        }
        public static void main(String[] args) {
            CountPrimes cp = new CountPrimes();
            System.out.println(cp.countPrimesOpt(499939));
        }

}
