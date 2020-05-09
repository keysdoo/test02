package com.zhoufeiyu.homework;



public class Outside {


    private int a = 100;


    class inside {
        private int a = 200;
        public void show() {
                int a=300;
            System.out.println(Outside.this.a);//100
            System.out.println(this.a);//200
            System.out.println(a);//300
        }




    }

  inside get(){

       return new inside();
   }



}


