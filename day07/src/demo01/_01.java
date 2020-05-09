package demo01;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class _01 {

    public static void main(String[] args) {

        Collection<String>coll=new ArrayList<>();
        coll.add("大宝");
        coll.add("二宝");
        coll.add("三宝");
        coll.add("四宝");
        Iterator<String> it=coll.iterator();
while (it.hasNext()){

 if (it.equals("大宝"))
 {
   coll.iterator().remove();
 }

    System.out.println(it.next());
   // coll.remove(next);

}
        for (String a:coll
             ) {
            System.out.println(a);
        }




    }
}
