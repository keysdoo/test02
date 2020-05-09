package test_03.demo_01;

public class TraversingNum implements Runnable {
static int num=1;
    @Override
    public void run() {
synchronized ("1"){
    for (int j=1;j<=1000;j++){
            num++;

        if (j%2==0&&j%3==0&&j%5==0&&j%7==0){
            System.out.println("当前遍历的数是:："+j);
            try {
                "1".wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        "1".notify();


    }


}

    }
}
