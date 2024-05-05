//  calculate 2^64

public class DegreesOf_2 {



    public static void main(String[] srgs) {
        StringBuilder res = new StringBuilder("1");

        int i;
        for(i = 1; i < 65; ++i) {
            res = new StringBuilder(multiplyby2(res.toString()));
            System.out.println("2^" + i + "=" + res);
            System.out.println("*******************************");
        }

        System.out.println("2^=" + (i - 1) + "=" + res);
        System.out.println("Math.POW ___ 2^64=" + Math.pow(2.0, 64.0));
    }

    public static String multiplyby2(String text_integer) {
        int curDigit ;
        StringBuilder last = new StringBuilder("");
        int memory = 0;
        int remains =0;


        for(int i = text_integer.length(); i > 0; --i) {

             curDigit = Integer.parseInt(text_integer.substring(i - 1, i));
             remains=0;

            if (curDigit * 2 + memory >= 10) {
                remains = curDigit * 2 + memory - 10;
                memory = 1;
            } else {
                remains = curDigit * 2 + memory;
                memory = 0;
            }

            last = new StringBuilder( String.valueOf( remains) ).append( last);


        }

        if (memory != 0) {
            last = new StringBuilder( String.valueOf( memory) ).append( last);
        }

        return last.toString();
    }
}
