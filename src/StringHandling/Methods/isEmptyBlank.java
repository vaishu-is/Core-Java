package StringHandling.Methods;

public class isEmptyBlank {
    public static void main(String[] args) {
        String str ="" ;
        String str1= null;
        System.out.println("Is string is blank = "+str.isBlank());
        //It contain only white Space Codepoint otherwise False.
        System.out.println("Is string is Empyt  = "+str.isEmpty());
        //length==0 ----> true or False
    }
}
