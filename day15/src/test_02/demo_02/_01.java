package test_02.demo_02;

public class _01 {
    public static void main(String[] args) {
        int n=100;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
