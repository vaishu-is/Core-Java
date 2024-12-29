package StringHandling;

public class demo5 {
    public static void main(String[] args) {

        String str1=    "A";
        String str2 =   "B";
        String str3 =   "A";
        String str4 = " C";
        //Compare to method return
        // 0----->  if both the String content is same
        //Negative -------> -
        //Postive ----------> +
        // if the fisrt value is biggher than second one the asci value o/p --> negative ascie value
        // if the first  object is smaller than second based on the asci value ----> postive  ascie value


        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));

        //o/p  string 1= A Str 2 =B -------> -1
        //o/p  String 1 =a str 2 =A ---------> 0









    }
}

