public class Java_StringPool {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(String.format("str1 == str2 "+( str1 == str2)));
        System.out.println(String.format("str3 == str2 "+( str3 == str2)));

        System.out.println(String.format("str3 isEqual str2 "+( str3.equals(str2))));

    }
}
