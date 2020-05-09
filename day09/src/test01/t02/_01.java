package test01.t02;

import java.util.HashMap;

public class _01 {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
findchar(str);
    }
    public static void findchar(String str){

        HashMap<Character,Integer>map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (map.containsKey(c)){
                Integer count=map.get(c);
                map.put(c,++count);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);

    }
}
