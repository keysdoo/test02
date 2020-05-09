package T3;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
scannertest();
    }
public static void scannertest(){
    System.out.println("请输入一串字符串（必须包含数字和字母）：");
        String s;
             Scanner sc=new Scanner(System.in);
             StringBuilder c=new StringBuilder();
             StringBuilder b=new StringBuilder();
             s=sc.next();
        for (int i=0;i<s.length();i++){


            if (s.charAt(i)<='9'&&s.charAt(i)>='0'){
                c.append(s.charAt(i));
            }
            if (s.charAt(i)<='z'&&s.charAt(i)>='a'||s.charAt(i)<='Z'&&s.charAt(i)>='A'){
                b.append(s.charAt(i));
            }

        }

                c.append(b);
    System.out.println(c);


}

}
