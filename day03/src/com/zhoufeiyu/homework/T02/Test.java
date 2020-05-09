package com.zhoufeiyu.homework.T02;

public	class Test {
    public static void main(String[] args) {
        fun(new Animal() {
            @Override
            public void show() {

            }
        });
      fun(new A());
    }

    public static void fun(Animal a ){


		a.show();


	}


}



class  A implements Animal{
    @Override
    public void show() {

    }
}


