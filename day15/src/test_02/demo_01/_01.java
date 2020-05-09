package test_02.demo_01;

public class _01 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(jiecheng(n));

    }
    public static int jiecheng(int n){
        if (n==1){
            return 1;
        }

        return n*jiecheng(n-1);
    }

}
