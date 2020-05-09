package demo01;



public class _01 {


    public static void main(String[] args) {
        System.out.println(as("ss"));
        System.out.println(as(123));
        System.out.println(as('t'));
        System.out.println(ss("ss"));
        System.out.println(ss(123));
        System.out.println(ss('t'));
        System.out.println(sb("ss"));
        System.out.println(sb(123));
        System.out.println(sb('t'));

    }
public static <E> E ss(E e){
        return e;
}

    public static <L> L sb(L e){
        return e;
    }


    public static <T> T as(T e){


        return e;
}
public static <L> L ass(L s){
        return  s;
}

}