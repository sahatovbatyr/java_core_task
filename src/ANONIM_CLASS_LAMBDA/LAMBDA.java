package ANONIM_CLASS_LAMBDA;

public class LAMBDA {

    public static void main(String[] args) {

//         This is anonim class, old version
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0; i<1000; i++){
//                    System.out.println("runnable:"+i);
//                }
//            }
//        };

        Runnable runnable = () -> {
            for (int i=0; i<1000; i++){
                System.out.println("runnable:"+i);
            }
        };

         new Thread(runnable).start();




    }

}
