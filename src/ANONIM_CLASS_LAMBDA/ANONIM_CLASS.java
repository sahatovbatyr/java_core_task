package ANONIM_CLASS_LAMBDA;

public class ANONIM_CLASS {


    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1000; i++){
                    System.out.println("runnable:"+i);
                }
            }
        };



        Thread thread = new Thread(runnable);
        thread.start();

    }
}
