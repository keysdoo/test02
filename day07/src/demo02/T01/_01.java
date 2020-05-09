package demo02.T01;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class _01 {
    public static void main(String[] args) {

        Collection<String> collection=new ArrayList<>();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");
        Iterator it=collection.iterator();
//        while (it.hasNext()){
//            String temp=(String)it.next();
//            if (temp.length()<10){
//                System.out.println(temp);
//            }
//        }
//
//        while (it.hasNext()){
//            System.out.println();
//        }
//
//        while (it.hasNext()){
//            String temp=(String)it.next();
//            if (temp.contains("Java")){
//                System.out.println(temp);
//            }
//        }
while (it.hasNext()) {
    String temp = (String) it.next();
    if (temp.contains("Oracle")) {
        it.remove();
    }

}
Iterator it1=collection.iterator();
while (it1.hasNext()){
    System.out.println(it1.next());
}


    }

}
