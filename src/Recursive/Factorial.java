package Recursive;

public class Factorial {
    private int getFact(int n){
        if(n<=1){
            return n;
        }
        else{
            return n * getFact(n-1);
        }
    }
    public static void main(String a[]){
        Factorial obj = new Factorial();
        System.out.println(obj.getFact(5));
    }
}
