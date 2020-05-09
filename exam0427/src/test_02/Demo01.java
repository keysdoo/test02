package test_02;


import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        // 1.创建HashMap集合,以商品名做键，以售出数量做值
        HashMap<String, Integer> map = new HashMap<>();
        // 2.创建Scanner对象,键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品名称，每行输入一个，以end结束");
        // 3.一直输入商品，直到end结束
        while (true) {
            String goods = sc.next();
            //4.如果输入的是end,直接结束循环录入
          if (goods.equals("end")){
              break;
          }
                    // 5.判断商品是否已售出过，如果售出过，数量加1，如果没有，数量存为1
                  if (map.containsKey(goods)){
                      map.put(goods,map.get(goods)+1);
                  }else map.put(goods,1);
        }

        // 6.遍历查看结果
        Set<String> strings = map.keySet();
        for (String good:strings
             ) {
            System.out.println("key:" +good+
                    "value:" +map.get(good)
                    );
        }
    }

}
