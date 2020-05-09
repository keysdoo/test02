package demo01;

import java.util.ArrayList;
import java.util.Collection;

public class Mycontain <T> {

        Collection<T> col=new ArrayList<>();

        public  <E>void addmethod(T e){

            col.add(e);

        }
    }