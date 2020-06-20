package Recursive;

import Sorting.FindingIntersectWithMergeSort;

public class Fibonacci {
    private int fib(int n){
        if(n==0 || n==1){
            return n;
            }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String a[]){
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fib(4));
    }
}

