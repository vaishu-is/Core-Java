package StringHandling;

public class demo4 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        String str3 =new String("abc");

        System.out.println("***************** == *************");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str2);

        System.out.println("**************** Equal to method*********************");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        System.out.println("****************** Compare to method****************** ");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str3));

    }
}
