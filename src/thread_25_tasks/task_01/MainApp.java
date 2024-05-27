package thread_25_tasks.task_01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainApp {

    public static void main(String[] args) {

        MyThread thread_1 = new MyThread(10000);
        thread_1.setIsEven(false);
        thread_1.start();

        MyThread thread_2 = new MyThread(10000);
        thread_2.setIsEven(true);
        thread_2.start();

    }
}

class MyThread extends Thread {

    private boolean isEven = false;

    public void setIsEven(boolean isEven) {
        this.isEven = isEven;
    }

    int number;
    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
//        super.run();
        IntStream.range(1, number)
                .filter( x-> x%2 == (isEven?0:1) )
                .forEach(x-> System.out.println("isEven="+isEven+": "+x));
    }
}

