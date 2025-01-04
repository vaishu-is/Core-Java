package StringHandling.Methods;

public class StartsEndWith {
    public static void main(String[] args) {

        String str="abc";
        System.out.println(str.startsWith("a"));//true
        System.out.println(str.startsWith("b"));//false
        //if the given String Starts with its oringinla then it returns true else false
        System.out.println(str.endsWith("c"));//true
        System.out.println(str.startsWith("z"));//false
        //if the given String Ends with its oringinla then it returns true else false
    }
}
