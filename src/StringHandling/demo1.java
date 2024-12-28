package StringHandling;

public class demo1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("xyz");
        String str3 = "abc";

        System.out.println("hashcode is defined by String class");
        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());

        System.out.println("hashcode based on memory address");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str3));





    }

}