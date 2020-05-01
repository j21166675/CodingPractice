public class FibonacciSeries{
    int temp1=1;
    int temp2=1;

    public void calFib(int sum)
    {
System.out.print(temp1+","+ temp2);
        while (sum <=10)
        {
            sum=temp1+temp2;
            temp1=temp2;
            temp2=sum;
            System.out.print(","+sum);
        }
    }

    private void recursiveFeb(int sum, int prev, int n){
        System.out.print(","+sum);
        int temp = sum;
        if (sum < n ){
            sum+=prev;

            recursiveFeb(sum,temp,n);
        }
    }

    public static void main (String args[]){
        FibonacciSeries fb = new FibonacciSeries();
       // fb.calFib(8);
        System.out.print(1);
        fb.recursiveFeb(1,1,20);


    }
}