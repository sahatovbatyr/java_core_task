package thread.thread01;

class MyThread extends Thread{

    String threadName;

    MyThread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            System.out.println(threadName+":"+i);
        }
    }
}

public class MainApp {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("@@@@@@@@@@@@@@@@@@@@@@first");
        myThread1.start();

        MyThread myThread2 = new MyThread("*******SECOND********");
        myThread2.start();

        System.out.println("KKKKKKKKKKKKKKKKKKKK   KONES MAIN KKKKKKKKKKKKK");


    }
}
